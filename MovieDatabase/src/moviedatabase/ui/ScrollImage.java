/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviedatabase.ui;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author Fia
 */
public class ScrollImage {
    BorderPane borderPane;
    ImageView imageView;
    
    public BorderPane displayImage() {
        borderPane = new BorderPane();
        imageView = new ImageView();
        
        borderPane.setLayoutX(457.0);
        borderPane.setLayoutY(10.0);
        borderPane.setPrefHeight(180.0);
        borderPane.setPrefWidth(200.0);

        BorderPane.setAlignment(imageView, javafx.geometry.Pos.CENTER);
        imageView.setFitHeight(180.0);
        imageView.setFitWidth(165.0);
        imageView.setOnMouseClicked(this::imageClick);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("Bilder/Rick and Morty.jpg").toExternalForm()));
        borderPane.setCenter(imageView);
        
        return borderPane;
    }
    
    public void imageClick(javafx.scene.input.MouseEvent mouseEvent) {
        System.out.println("Hejsantjosan");
        //loadNewScene();
    }
    
}
