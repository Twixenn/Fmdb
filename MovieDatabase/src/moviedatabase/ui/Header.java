/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviedatabase.ui;

import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

/**
 *
 * @author Fia
 */
public class Header {
    BorderPane borderPane = new BorderPane();
    HBox hBox = new HBox();
    TextField textField = new TextField();
    Button button = new Button();
    BorderPane borderPane2 = new BorderPane();
    ImageView imageView = new ImageView();
    ImageView imageView2 = new ImageView();
    
    public BorderPane displayHeader() {
        BorderPane.setAlignment(borderPane, javafx.geometry.Pos.CENTER);
        borderPane.setPrefHeight(50.0);
        borderPane.setPrefWidth(200.0);

        BorderPane.setAlignment(hBox, javafx.geometry.Pos.CENTER);
        hBox.setAlignment(javafx.geometry.Pos.CENTER);
        hBox.setPrefHeight(76.0);
        hBox.setPrefWidth(254.0);
        hBox.setSpacing(10.0);

        textField.setPromptText("Search...");

        button.setMnemonicParsing(false);
        button.setStyle("-fx-background-color: #009EE3;");
        button.setText("Search");
        button.setFont(new Font(12.0));
        button.setCursor(Cursor.HAND);
        hBox.setPadding(new Insets(0.0, 20.0, 0.0, 0.0));
        borderPane.setRight(hBox);

        BorderPane.setAlignment(imageView, javafx.geometry.Pos.CENTER);
        imageView.setFitHeight(56.0);
        imageView.setFitWidth(162.0);
        imageView.setOnMouseClicked(this::imageClick);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("fmdb.png").toExternalForm()));
        BorderPane.setMargin(imageView, new Insets(10.0, 0.0, 10.0, 20.0));
        borderPane.setLeft(imageView);

        BorderPane.setAlignment(imageView2, javafx.geometry.Pos.CENTER);
        imageView2.setFitHeight(30.0);
        imageView2.setFitWidth(25.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("fmdb.png").toExternalForm()));
        borderPane.setCenter(imageView2);
        
        hBox.getChildren().add(textField);
        hBox.getChildren().add(button);
        
        return borderPane;
    }
    
    public void imageClick(javafx.scene.input.MouseEvent mouseEvent) {
        loadHomeScene();
    }
    
    public void loadHomeScene() {
        new MovieDatabase().loadNewScene(new HomePage().displayHomePage());
    }
}
