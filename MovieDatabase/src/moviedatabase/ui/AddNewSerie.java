/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviedatabase.ui;
import beans.AddSeriesToDatabase;

import javafx.geometry.Insets;
import javafx.scene.Cursor;
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

/**
 *
 * @author Fia
 */
public class AddNewSerie {
    BorderPane border;
    BorderPane borderPane;
    HBox hBox;
    TextField textField;
    Button button;
    ImageView imageView;
    ImageView imageView0;
    ScrollPane scrollPane;
    VBox vBox;
    Label label;
    VBox vBox0;
    Label label0;
    TextField textField0;
    Button button0;

    public BorderPane displayAddNewSerie() {
        border = new BorderPane();
        borderPane = new BorderPane();
        hBox = new HBox();
        textField = new TextField();
        button = new Button();
        imageView = new ImageView();
        imageView0 = new ImageView();
        scrollPane = new ScrollPane();
        vBox = new VBox();
        label = new Label();
        vBox0 = new VBox();
        label0 = new Label();
        textField0 = new TextField();
        button0 = new Button();

        border.setMaxHeight(USE_PREF_SIZE);
        border.setMaxWidth(USE_PREF_SIZE);
        border.setMinHeight(USE_PREF_SIZE);
        border.setMinWidth(USE_PREF_SIZE);
        border.setPrefHeight(400.0);
        border.setPrefWidth(600.0);
        border.setStyle("-fx-background-color: black;");
        border.getStylesheets().add("main.css");

        border.setTop(new Header().displayHeader());
        
        BorderPane.setAlignment(scrollPane, javafx.geometry.Pos.CENTER);
        scrollPane.setFitToHeight(true);
        scrollPane.setFitToWidth(true);
        scrollPane.setHbarPolicy(javafx.scene.control.ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setPrefHeight(200.0);
        scrollPane.setPrefWidth(200.0);
        scrollPane.setStyle("-fx-background-color: black;");

        vBox.setPrefHeight(200.0);
        vBox.setPrefWidth(100.0);
        vBox.setSpacing(20.0);
        vBox.setStyle("-fx-background-color: black;");

        label.setText("Add New Serie");
        label.setTextFill(javafx.scene.paint.Color.WHITE);
        label.setFont(new Font(20.0));

        vBox0.setPrefHeight(200.0);
        vBox0.setPrefWidth(100.0);
        vBox0.setSpacing(10.0);

        label0.setText("Url from IMDB");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));

        textField0.setPromptText("Url");

        button0.setMnemonicParsing(false);
        button0.setStyle("-fx-background-color: #009EE3 #009EE3;");
        button0.setText("Add");
        button0.setOnMouseClicked(this::addSerie);
        vBox.setPadding(new Insets(30.0));
        scrollPane.setContent(vBox);
        border.setCenter(scrollPane);

        hBox.getChildren().add(textField);
        hBox.getChildren().add(button);
        vBox.getChildren().add(label);
        vBox0.getChildren().add(label0);
        vBox0.getChildren().add(textField0);
        vBox0.getChildren().add(button0);
        vBox.getChildren().add(vBox0);
        
        return border;
    }
    
    public void addSerie(javafx.scene.input.MouseEvent mouseEvent) {
        System.out.println("Lägger till serie");
        String url = textField0.getText();
        AddSeriesToDatabase.addSeries(url);
    }
}
