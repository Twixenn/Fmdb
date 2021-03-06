/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviedatabase.ui;
import java.net.URL;
import java.util.ArrayList;
import moviedatabase.beans.Serie;

import java.util.List;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Fia
 */
public class HomePage {
    List<String> genres;
    BorderPane border;
    ScrollPane scrollPane;
    VBox vBox;
    
    //HEADER
    BorderPane borderPane;
    HBox hBox;
    ImageView imageView;
    BorderPane borderPane2;
    Button button;
    TextField textField;
    ImageView imageView2;

    public BorderPane displayHomePage() {
        List<Serie> series = new MovieDatabaseController().series;
        genres = new ArrayList();
        
        border = new BorderPane();
        scrollPane = new ScrollPane();
        vBox = new VBox();
        borderPane = new BorderPane();
        hBox = new HBox();
        
        border.setMaxHeight(USE_PREF_SIZE);
        border.setMaxWidth(USE_PREF_SIZE);
        border.setMinHeight(USE_PREF_SIZE);
        border.setMinWidth(USE_PREF_SIZE);
        border.setPrefHeight(400.0);
        border.setPrefWidth(600.0);
        border.setStyle("-fx-background-color: black;");
        border.getStylesheets().add(getClass().getResource("main.css").toExternalForm());

        border.setCenter(scrollPane);
        scrollPane.setFitToHeight(true);
        scrollPane.setFitToWidth(true);
        scrollPane.setPrefHeight(200.0);
        scrollPane.setPrefWidth(200.0);
        scrollPane.setStyle("-fx-background-color: black;");

        vBox.setSpacing(20.0);
        vBox.setStyle("-fx-background-color: black;");

        
        vBox.setPadding(new Insets(0.0, 10.0, 0.0, 20.0));
        scrollPane.setContent(vBox);
        BorderPane.setAlignment(scrollPane, Pos.CENTER);
        
        //HEADER
        border.setTop(new Header().displayHeader());
        
        for(Serie s:series) {
            genres = s.getAllGenres(genres);
        }
        
        for(String g:genres) {
            List <Serie> seriesOfThisGenre = new ArrayList();
            for(Serie s:series) {
                for(String genre:s.getAllGenres()) {
                    if(genre.contains(g)) {
                        seriesOfThisGenre.add(s);
                    }
                }
            }
            vBox.getChildren().add(new ScrollView().displayScrollView(g, seriesOfThisGenre));
        }
        
        return border;
    }
}
