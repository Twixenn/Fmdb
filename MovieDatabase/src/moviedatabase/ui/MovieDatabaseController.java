/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviedatabase.ui;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import moviedatabase.ui.ScrollView;
import moviedatabase.ui.Header;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import moviedatabase.beans.Episode;
import moviedatabase.beans.Season;
import moviedatabase.beans.Serie;
import moviedatabase.utilites.ConnectionFactory;

/**
 *
 * @author Fia
 */
public class MovieDatabaseController extends Application {
    static Stage stage;
    public static List<Serie> series;

    @Override
    public void start(Stage stag) throws Exception {
        getImages();
        stage = stag;
        stage.setTitle("FMdB"); 
        Scene scene = new Scene(new HomePage().displayHomePage(), 600, 400);
        stage.setScene(scene);
        stage.show();
    }
    
    public void getImages() {
        try {
            series = new ArrayList();
            Connection connection = ConnectionFactory.getConnection();
            
            //Sätter så att inte id blir samma som någon tidigare
            Statement stmt = connection.createStatement();
            
            //Sätter så att inte id blir samma som någon tidigare
            String sql = "SELECT * FROM Serie";
            ResultSet res = stmt.executeQuery(sql);
            
            res.beforeFirst();
            if (res.next()) {
                do {
                    Serie serie = new Serie(res);
                    series.add(serie);
                } while(res.next());
            }
            
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(MovieDatabaseController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MovieDatabaseController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Serie getSeries(String title) {
        try {
            Connection connection = ConnectionFactory.getConnection();
            
            Statement stmt = connection.createStatement();
            
            String sql = "SELECT * FROM Serie WHERE title = '" + title + "'";
            ResultSet res = stmt.executeQuery(sql);
            
            res.beforeFirst();
            if (res.next()) {
                Serie serie = new Serie(res);
                return serie;
            }

            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(MovieDatabaseController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MovieDatabaseController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<Season> getSeasons(Serie serie) { 
        try {
            Connection connection = ConnectionFactory.getConnection();
            
            Statement stmt = connection.createStatement();
            
            String sql = "SELECT * FROM Season WHERE series = '" + serie.getSeriesId() + "'";
            ResultSet res = stmt.executeQuery(sql);
            
            res.beforeFirst();
            if (res.next()) {
                do {
                    serie.addSeasons(res);
                } while(res.next());
            }
            
            for(Season s:serie.getSeasons()) {
                sql = "SELECT * FROM Episode WHERE season = '" + s.getSeasonId() + "'";
                res = stmt.executeQuery(sql);
            
                res.beforeFirst();
                if (res.next()) {
                    do {
                        s.addEpisodes(res);
                    } while(res.next());
                }
            }
            
            connection.close();
            return serie.getSeasons();
        } catch (SQLException ex) {
            Logger.getLogger(MovieDatabaseController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MovieDatabaseController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public void loadNewScene(BorderPane border) {
        stage.setTitle("FMdB");
        stage.setScene(new Scene(border, 600, 400));  
        stage.show();
    }
    
}
