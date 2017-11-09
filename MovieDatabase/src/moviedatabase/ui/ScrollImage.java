/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviedatabase.ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.io.File;
import moviedatabase.beans.Serie;
import static moviedatabase.ui.MovieDatabaseController.main;

/**
 *
 * @author Fia
 */
public class ScrollImage {

    BorderPane borderPane;
    ImageView imageView;
    Stage stage;
    private String title;

    public BorderPane displayImage(String image) {
        this.title = image;
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
        if (image != null) {
            imageView.setImage(new Image(getClass().getResource("Bilder/" + this.title + ".jpg").toExternalForm()));
        }
        borderPane.setCenter(imageView);

        return borderPane;
    }

    public void imageClick(MouseEvent mouseEvent) {
        if(this.title != null) {
            new MovieDatabaseController().loadNewScene(new SerieView().displaySerie(this.title));
        }
    }
}
