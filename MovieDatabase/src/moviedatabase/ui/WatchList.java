/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviedatabase.ui;

import java.util.ArrayList;
import java.util.List;
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
import moviedatabase.beans.Serie;

/**
 *
 * @author Fia
 */
public class WatchList {

    BorderPane border;
    BorderPane borderPane;
    HBox hBox;
    TextField textField;
    Button button;
    ImageView imageView;
    ImageView imageView0;
    ScrollPane scrollPane;
    BorderPane borderPane0;
    Label label;
    ScrollPane scrollPane0;
    VBox vBox;
    HBox hBox0;
    Label label0;
    HBox hBox1;
    Button button0;
    Button button1;
    HBox hBox2;
    Label label1;
    HBox hBox3;
    Button button2;
    Button button3;
    HBox hBox4;
    Label label2;
    HBox hBox5;
    Button button4;
    Button button5;
    HBox hBox6;
    Label label3;
    HBox hBox7;
    Button button6;
    Button button7;
    HBox hBox8;
    Label label4;
    HBox hBox9;
    Button button8;
    Button button9;
    HBox hBox10;
    Label label5;
    HBox hBox11;
    Button button10;
    Button button11;
    HBox hBox12;
    Label label6;
    HBox hBox13;
    Button button12;
    Button button13;
    HBox hBox14;
    Label label7;
    HBox hBox15;
    Button button14;
    Button button15;
    public static List<Serie> watchList = new ArrayList();
    private List<Button> removeButtons;

    public BorderPane displayWatchList() {
        this.removeButtons = new ArrayList();
        border = new BorderPane();
        borderPane = new BorderPane();
        hBox = new HBox();
        textField = new TextField();
        button = new Button();
        imageView = new ImageView();
        imageView0 = new ImageView();
        scrollPane = new ScrollPane();
        borderPane0 = new BorderPane();
        label = new Label();
        scrollPane0 = new ScrollPane();
        vBox = new VBox();
        hBox0 = new HBox();
        label0 = new Label();
        hBox1 = new HBox();
        button0 = new Button();
        button1 = new Button();
        hBox2 = new HBox();
        label1 = new Label();
        hBox3 = new HBox();
        button2 = new Button();
        button3 = new Button();
        hBox4 = new HBox();
        label2 = new Label();
        hBox5 = new HBox();
        button4 = new Button();
        button5 = new Button();
        hBox6 = new HBox();
        label3 = new Label();
        hBox7 = new HBox();
        button6 = new Button();
        button7 = new Button();
        hBox8 = new HBox();
        label4 = new Label();
        hBox9 = new HBox();
        button8 = new Button();
        button9 = new Button();
        hBox10 = new HBox();
        label5 = new Label();
        hBox11 = new HBox();
        button10 = new Button();
        button11 = new Button();
        hBox12 = new HBox();
        label6 = new Label();
        hBox13 = new HBox();
        button12 = new Button();
        button13 = new Button();
        hBox14 = new HBox();
        label7 = new Label();
        hBox15 = new HBox();
        button14 = new Button();
        button15 = new Button();

        border.setMaxHeight(USE_PREF_SIZE);
        border.setMaxWidth(USE_PREF_SIZE);
        border.setMinHeight(USE_PREF_SIZE);
        border.setMinWidth(USE_PREF_SIZE);
        border.setPrefHeight(400.0);
        border.setPrefWidth(600.0);
        border.setStyle("-fx-background-color: black;");
        border.getStylesheets().add(getClass().getResource("main.css").toExternalForm());

        border.setTop(new Header().displayHeader());

        BorderPane.setAlignment(scrollPane, javafx.geometry.Pos.CENTER);
        scrollPane.setFitToHeight(true);
        scrollPane.setFitToWidth(true);
        scrollPane.setHbarPolicy(javafx.scene.control.ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setPrefHeight(200.0);
        scrollPane.setPrefWidth(200.0);
        scrollPane.setStyle("-fx-background-color: black;");

        borderPane0.setPrefHeight(200.0);
        borderPane0.setPrefWidth(200.0);
        borderPane0.setStyle("-fx-background-color: black;");

        BorderPane.setAlignment(label, javafx.geometry.Pos.TOP_LEFT);
        label.setText("Your Watchlist");
        label.setTextFill(javafx.scene.paint.Color.WHITE);
        label.setFont(new Font(20.0));
        borderPane0.setTop(label);
        borderPane0.setPadding(new Insets(20.0));

        BorderPane.setAlignment(scrollPane0, javafx.geometry.Pos.CENTER);
        scrollPane0.setFitToHeight(true);
        scrollPane0.setFitToWidth(true);
        scrollPane0.setHbarPolicy(javafx.scene.control.ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane0.setPrefHeight(200.0);
        scrollPane0.setPrefWidth(200.0);
        scrollPane0.setStyle("-fx-background-color: black;");

        vBox.setPrefHeight(200.0);
        vBox.setPrefWidth(100.0);
        vBox.setSpacing(10.0);
        vBox.setStyle("-fx-background-color: black;");

        for (Serie s : watchList) {
            hBox0 = new HBox();
            hBox0.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
            hBox0.setPrefHeight(25.0);
            hBox0.setPrefWidth(558.0);

            label0.setPrefHeight(17.0);
            label0.setPrefWidth(243.0);
            label0.setText(s.getTitle());
            label0.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));

            hBox1.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);
            hBox1.setPrefHeight(25.0);
            hBox1.setPrefWidth(291.0);
            hBox1.setSpacing(20.0);

            button0.setAlignment(javafx.geometry.Pos.CENTER);
            button0.setMnemonicParsing(false);
            button0.setStyle("-fx-padding: 0; -fx-background-color: transparent;");
            button0.setText("Go to series >");
            button0.setOnMouseClicked(this::goToSerie);
            button0.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));
            button0.setUnderline(true);

            button1.setAlignment(javafx.geometry.Pos.CENTER);
            button1.setMnemonicParsing(false);
            button1.setStyle("-fx-padding: 0; -fx-background-color: transparent;");
            button1.setText("Remove from Watchlist >");
            button1.setOnMouseClicked(this::removeFromList);
            button1.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));
            button1.setUnderline(true);
            removeButtons.add(button1);
            hBox0.setPadding(new Insets(10.0));
        }
        scrollPane0.setContent(vBox);
        borderPane0.setCenter(scrollPane0);
        scrollPane.setContent(borderPane0);
        border.setCenter(scrollPane);

        hBox.getChildren().add(textField);
        hBox.getChildren().add(button);
        hBox0.getChildren().add(label0);
        hBox1.getChildren().add(button0);
        hBox1.getChildren().add(button1);
        hBox0.getChildren().add(hBox1);
        vBox.getChildren().add(hBox0);
        hBox2.getChildren().add(label1);
        hBox3.getChildren().add(button2);
        hBox3.getChildren().add(button3);
        hBox2.getChildren().add(hBox3);
        vBox.getChildren().add(hBox2);
        hBox4.getChildren().add(label2);
        hBox5.getChildren().add(button4);
        hBox5.getChildren().add(button5);
        hBox4.getChildren().add(hBox5);
        vBox.getChildren().add(hBox4);
        hBox6.getChildren().add(label3);
        hBox7.getChildren().add(button6);
        hBox7.getChildren().add(button7);
        hBox6.getChildren().add(hBox7);
        vBox.getChildren().add(hBox6);
        hBox8.getChildren().add(label4);
        hBox9.getChildren().add(button8);
        hBox9.getChildren().add(button9);
        hBox8.getChildren().add(hBox9);
        vBox.getChildren().add(hBox8);
        hBox10.getChildren().add(label5);
        hBox11.getChildren().add(button10);
        hBox11.getChildren().add(button11);
        hBox10.getChildren().add(hBox11);
        vBox.getChildren().add(hBox10);
        hBox12.getChildren().add(label6);
        hBox13.getChildren().add(button12);
        hBox13.getChildren().add(button13);
        hBox12.getChildren().add(hBox13);
        vBox.getChildren().add(hBox12);
        hBox14.getChildren().add(label7);
        hBox15.getChildren().add(button14);
        hBox15.getChildren().add(button15);
        hBox14.getChildren().add(hBox15);
        vBox.getChildren().add(hBox14);

        return border;
    }
    
    public void removeFromList(MouseEvent mouseEvent) {
        
    }
    
    public void goToSerie(MouseEvent mouseEvent) {
        
    }

}
