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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

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

    public BorderPane displayWatchList() {
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
        border.getStylesheets().add("main.css");
        
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

        hBox0.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBox0.setPrefHeight(25.0);
        hBox0.setPrefWidth(558.0);
        hBox0.getStylesheets().add("/moviedatabase/main.css");

        label0.setPrefHeight(17.0);
        label0.setPrefWidth(243.0);
        label0.setText("Game of Thrones");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));

        hBox1.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);
        hBox1.setPrefHeight(25.0);
        hBox1.setPrefWidth(291.0);
        hBox1.setSpacing(20.0);

        button0.setAlignment(javafx.geometry.Pos.CENTER);
        button0.setMnemonicParsing(false);
        button0.setStyle("-fx-padding: 0; -fx-background-color: transparent;");
        button0.setText("Go to series >");
        button0.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));
        button0.setUnderline(true);

        button1.setAlignment(javafx.geometry.Pos.CENTER);
        button1.setMnemonicParsing(false);
        button1.setStyle("-fx-padding: 0; -fx-background-color: transparent;");
        button1.setText("Remove from Watchlist >");
        button1.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));
        button1.setUnderline(true);
        hBox0.setPadding(new Insets(10.0));

        hBox2.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBox2.setPrefHeight(25.0);
        hBox2.setPrefWidth(558.0);
        hBox2.getStylesheets().add("/moviedatabase/main.css");

        label1.setPrefHeight(17.0);
        label1.setPrefWidth(243.0);
        label1.setText("Game of Thrones");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));

        hBox3.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);
        hBox3.setPrefHeight(25.0);
        hBox3.setPrefWidth(291.0);
        hBox3.setSpacing(20.0);

        button2.setAlignment(javafx.geometry.Pos.CENTER);
        button2.setMnemonicParsing(false);
        button2.setStyle("-fx-padding: 0; -fx-background-color: transparent;");
        button2.setText("Go to series >");
        button2.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));
        button2.setUnderline(true);

        button3.setAlignment(javafx.geometry.Pos.CENTER);
        button3.setMnemonicParsing(false);
        button3.setStyle("-fx-padding: 0; -fx-background-color: transparent;");
        button3.setText("Remove from Watchlist >");
        button3.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));
        button3.setUnderline(true);
        hBox2.setPadding(new Insets(10.0));

        hBox4.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBox4.setPrefHeight(25.0);
        hBox4.setPrefWidth(558.0);
        hBox4.getStylesheets().add("/moviedatabase/main.css");

        label2.setPrefHeight(17.0);
        label2.setPrefWidth(243.0);
        label2.setText("Game of Thrones");
        label2.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));

        hBox5.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);
        hBox5.setPrefHeight(25.0);
        hBox5.setPrefWidth(291.0);
        hBox5.setSpacing(20.0);

        button4.setAlignment(javafx.geometry.Pos.CENTER);
        button4.setMnemonicParsing(false);
        button4.setStyle("-fx-padding: 0; -fx-background-color: transparent;");
        button4.setText("Go to series >");
        button4.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));
        button4.setUnderline(true);

        button5.setAlignment(javafx.geometry.Pos.CENTER);
        button5.setMnemonicParsing(false);
        button5.setStyle("-fx-padding: 0; -fx-background-color: transparent;");
        button5.setText("Remove from Watchlist >");
        button5.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));
        button5.setUnderline(true);
        hBox4.setPadding(new Insets(10.0));

        hBox6.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBox6.setPrefHeight(25.0);
        hBox6.setPrefWidth(558.0);
        hBox6.getStylesheets().add("/moviedatabase/main.css");

        label3.setPrefHeight(17.0);
        label3.setPrefWidth(243.0);
        label3.setText("Game of Thrones");
        label3.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));

        hBox7.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);
        hBox7.setPrefHeight(25.0);
        hBox7.setPrefWidth(291.0);
        hBox7.setSpacing(20.0);

        button6.setAlignment(javafx.geometry.Pos.CENTER);
        button6.setMnemonicParsing(false);
        button6.setStyle("-fx-padding: 0; -fx-background-color: transparent;");
        button6.setText("Go to series >");
        button6.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));
        button6.setUnderline(true);

        button7.setAlignment(javafx.geometry.Pos.CENTER);
        button7.setMnemonicParsing(false);
        button7.setStyle("-fx-padding: 0; -fx-background-color: transparent;");
        button7.setText("Remove from Watchlist >");
        button7.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));
        button7.setUnderline(true);
        hBox6.setPadding(new Insets(10.0));

        hBox8.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBox8.setPrefHeight(25.0);
        hBox8.setPrefWidth(558.0);
        hBox8.getStylesheets().add("/moviedatabase/main.css");

        label4.setPrefHeight(17.0);
        label4.setPrefWidth(243.0);
        label4.setText("Game of Thrones");
        label4.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));

        hBox9.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);
        hBox9.setPrefHeight(25.0);
        hBox9.setPrefWidth(291.0);
        hBox9.setSpacing(20.0);

        button8.setAlignment(javafx.geometry.Pos.CENTER);
        button8.setMnemonicParsing(false);
        button8.setStyle("-fx-padding: 0; -fx-background-color: transparent;");
        button8.setText("Go to series >");
        button8.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));
        button8.setUnderline(true);

        button9.setAlignment(javafx.geometry.Pos.CENTER);
        button9.setMnemonicParsing(false);
        button9.setStyle("-fx-padding: 0; -fx-background-color: transparent;");
        button9.setText("Remove from Watchlist >");
        button9.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));
        button9.setUnderline(true);
        hBox8.setPadding(new Insets(10.0));

        hBox10.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBox10.setPrefHeight(25.0);
        hBox10.setPrefWidth(558.0);
        hBox10.getStylesheets().add("/moviedatabase/main.css");

        label5.setPrefHeight(17.0);
        label5.setPrefWidth(243.0);
        label5.setText("Game of Thrones");
        label5.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));

        hBox11.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);
        hBox11.setPrefHeight(25.0);
        hBox11.setPrefWidth(291.0);
        hBox11.setSpacing(20.0);

        button10.setAlignment(javafx.geometry.Pos.CENTER);
        button10.setMnemonicParsing(false);
        button10.setStyle("-fx-padding: 0; -fx-background-color: transparent;");
        button10.setText("Go to series >");
        button10.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));
        button10.setUnderline(true);

        button11.setAlignment(javafx.geometry.Pos.CENTER);
        button11.setMnemonicParsing(false);
        button11.setStyle("-fx-padding: 0; -fx-background-color: transparent;");
        button11.setText("Remove from Watchlist >");
        button11.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));
        button11.setUnderline(true);
        hBox10.setPadding(new Insets(10.0));

        hBox12.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBox12.setPrefHeight(25.0);
        hBox12.setPrefWidth(558.0);
        hBox12.getStylesheets().add("/moviedatabase/main.css");

        label6.setPrefHeight(17.0);
        label6.setPrefWidth(243.0);
        label6.setText("Game of Thrones");
        label6.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));

        hBox13.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);
        hBox13.setPrefHeight(25.0);
        hBox13.setPrefWidth(291.0);
        hBox13.setSpacing(20.0);

        button12.setAlignment(javafx.geometry.Pos.CENTER);
        button12.setMnemonicParsing(false);
        button12.setStyle("-fx-padding: 0; -fx-background-color: transparent;");
        button12.setText("Go to series >");
        button12.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));
        button12.setUnderline(true);

        button13.setAlignment(javafx.geometry.Pos.CENTER);
        button13.setMnemonicParsing(false);
        button13.setStyle("-fx-padding: 0; -fx-background-color: transparent;");
        button13.setText("Remove from Watchlist >");
        button13.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));
        button13.setUnderline(true);
        hBox12.setPadding(new Insets(10.0));

        hBox14.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBox14.setPrefHeight(25.0);
        hBox14.setPrefWidth(558.0);
        hBox14.getStylesheets().add("/moviedatabase/main.css");

        label7.setPrefHeight(17.0);
        label7.setPrefWidth(243.0);
        label7.setText("Game of Thrones");
        label7.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));

        hBox15.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);
        hBox15.setPrefHeight(25.0);
        hBox15.setPrefWidth(291.0);
        hBox15.setSpacing(20.0);

        button14.setAlignment(javafx.geometry.Pos.CENTER);
        button14.setMnemonicParsing(false);
        button14.setStyle("-fx-padding: 0; -fx-background-color: transparent;");
        button14.setText("Go to series >");
        button14.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));
        button14.setUnderline(true);

        button15.setAlignment(javafx.geometry.Pos.CENTER);
        button15.setMnemonicParsing(false);
        button15.setStyle("-fx-padding: 0; -fx-background-color: transparent;");
        button15.setText("Remove from Watchlist >");
        button15.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));
        button15.setUnderline(true);
        hBox14.setPadding(new Insets(10.0));
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
    
}
