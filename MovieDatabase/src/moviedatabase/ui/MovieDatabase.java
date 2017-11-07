/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviedatabase.ui;

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

/**
 *
 * @author Fia
 */
public class MovieDatabase extends Application {
    static Stage stage;

    @Override
    public void start(Stage stag) throws Exception {
        stage = stag;
        stage.setTitle("FMdB"); 
        Scene scene = new Scene(new HomePage().displayHomePage(), 600, 400);
        stage.setScene(scene);
        stage.show();
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
