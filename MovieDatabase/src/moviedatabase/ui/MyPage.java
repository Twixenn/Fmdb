/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviedatabase.ui;

import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/**
 *
 * @author Fia
 */
public class MyPage {
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
    Label label0;
    ImageView imageView1;

    public BorderPane displayMyPage() {
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
        label0 = new Label();
        imageView1 = new ImageView();

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

        label.setText("Add New Serie >");
        label.setTextFill(javafx.scene.paint.Color.WHITE);
        label.setOnMouseClicked(this::newSerieClick);
        label.setUnderline(true);
        label.setFont(new Font(20.0));

        label0.setText("Your Watchlist >");
        label0.setTextFill(javafx.scene.paint.Color.WHITE);
        label0.setUnderline(true);
        label0.setFont(new Font(20.0));
        label0.setOnMouseClicked(this::watchlistClick);
        vBox.setPadding(new Insets(30.0));
        scrollPane.setContent(vBox);
        border.setCenter(scrollPane);

        BorderPane.setAlignment(imageView1, javafx.geometry.Pos.TOP_RIGHT);
        imageView1.setFitHeight(241.0);
        imageView1.setFitWidth(177.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("fmdb.png").toExternalForm()));
        BorderPane.setMargin(imageView1, new Insets(30.0, 60.0, 30.0, 0.0));
        border.setRight(imageView1);

        hBox.getChildren().add(textField);
        hBox.getChildren().add(button);
        vBox.getChildren().add(label);
        vBox.getChildren().add(label0);
        
        return border;
    }
    
    public void newSerieClick(MouseEvent mouseEvent) {
        new MovieDatabase().loadNewScene(new AddNewSerie().displayAddNewSerie());
    }
    
    public void watchlistClick(MouseEvent mouseEvent) {
        new MovieDatabase().loadNewScene(new WatchList().displayWatchList());
    }
}
