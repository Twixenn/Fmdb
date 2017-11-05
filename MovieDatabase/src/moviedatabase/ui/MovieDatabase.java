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


    @Override
    public void start(Stage stage) throws Exception {
        border = new BorderPane();
        scrollPane = new ScrollPane();
        vBox = new VBox();
        borderPane = new BorderPane();
        hBox = new HBox();
        
        stage.setTitle("FMdB");
        
        Scene scene = new Scene(border, 600, 400);
        
        border.setMaxHeight(USE_PREF_SIZE);
        border.setMaxWidth(USE_PREF_SIZE);
        border.setMinHeight(USE_PREF_SIZE);
        border.setMinWidth(USE_PREF_SIZE);
        border.setPrefHeight(400.0);
        border.setPrefWidth(600.0);
        border.setStyle("-fx-background-color: black;");

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
        Header header = new Header();
        border.setTop(header.displayHeader());
        
        scene.getStylesheets().add("/moviedatabase/main.css");
        scene.getStylesheets().add("/moviedatabase/main.css");
        
        ScrollView scrollView = new ScrollView();

        vBox.getChildren().add(scrollView.displayScrollView("Horror"));
        vBox.getChildren().add(scrollView.displayScrollView("Drama"));
        vBox.getChildren().add(scrollView.displayScrollView("Comedy"));
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public void loadNewScene(Stage stage, BorderPane border) {
        stage.setTitle("FMdB");
        stage.setScene(new Scene(border, 600, 400));
        stage.show();

    }
    
}
