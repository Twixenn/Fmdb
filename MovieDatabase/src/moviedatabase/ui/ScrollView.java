/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviedatabase.ui;
import java.util.List;
import moviedatabase.beans.Serie;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Fia
 */
public class ScrollView {
    BorderPane borderPane;
    ScrollPane scrollPane;
    HBox hBox;
    Label label;
    
    public BorderPane displayScrollView(String genre, List<Serie> series) {
        borderPane = new BorderPane();
        scrollPane = new ScrollPane();
        hBox = new HBox();
        label = new Label();
        
        borderPane.setPrefHeight(200.0);
        borderPane.setPrefWidth(200.0);

        BorderPane.setAlignment(scrollPane, javafx.geometry.Pos.CENTER);
        scrollPane.setFitToHeight(true);
        scrollPane.setFitToWidth(true);
        scrollPane.setHvalue(0.5);
        scrollPane.setMinHeight(USE_PREF_SIZE);
        scrollPane.setPrefHeight(200.0);
        scrollPane.setPrefWidth(200.0);
        scrollPane.setStyle("-fx-background-color: black;");

        hBox.setPrefHeight(100.0);
        hBox.setPrefWidth(200.0);
        hBox.setSpacing(10.0);
        hBox.setStyle("-fx-background-color: black;");
        
        for(Serie s:series) {
            hBox.getChildren().add(new ScrollImage().displayImage(s.getTitle()));
        }
        
        hBox.setPadding(new Insets(0.0, 10.0, 0.0, 10.0));
        scrollPane.setContent(hBox);
        borderPane.setCenter(scrollPane);

        
        BorderPane.setAlignment(label, javafx.geometry.Pos.CENTER_LEFT);
        label.setText(genre);
        label.setTextFill(javafx.scene.paint.Color.WHITE);
        label.setFont(new Font("System Font", 20.0));
        borderPane.setTop(label);
        
        return borderPane;
    }
    
}
