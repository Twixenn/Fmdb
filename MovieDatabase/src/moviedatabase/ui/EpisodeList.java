/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviedatabase.ui;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
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
public class EpisodeList {
    BorderPane border;
    BorderPane borderPane;
    HBox hBox;
    TextField textField;
    Button button;
    ImageView imageView;
    ScrollPane scrollPane;
    BorderPane borderPane0;
    HBox hBox0;
    ImageView imageView0;
    VBox vBox;
    Label label;
    HBox hBox1;
    Label label0;
    Separator separator;
    Label label1;
    ScrollPane scrollPane0;
    VBox vBox0;
    MenuButton menuButton;
    MenuItem menuItem;
    MenuItem menuItem0;
    VBox vBox1;
    Label label2;
    Label label3;
    HBox hBox2;
    Label label4;
    Separator separator0;
    Label label5;
    VBox vBox2;
    Label label6;
    Label label7;
    HBox hBox3;
    Label label8;
    Separator separator1;
    Label label9;
    VBox vBox3;
    Label label10;
    Label label11;
    HBox hBox4;
    Label label12;
    Separator separator2;
    Label label13;
    VBox vBox4;
    Label label14;
    Label label15;
    HBox hBox5;
    Label label16;
    Separator separator3;
    Label label17;
    VBox vBox5;
    Label label18;
    Label label19;
    HBox hBox6;
    Label label110;
    Separator separator4;
    Label label111;
    VBox vBox6;
    Label label112;
    Label label113;
    HBox hBox7;
    Label label114;
    Separator separator5;
    Label label115;

    public BorderPane displayEpisodeList() {
        border = new BorderPane();
        borderPane = new BorderPane();
        hBox = new HBox();
        textField = new TextField();
        button = new Button();
        imageView = new ImageView();
        scrollPane = new ScrollPane();
        borderPane0 = new BorderPane();
        hBox0 = new HBox();
        imageView0 = new ImageView();
        vBox = new VBox();
        label = new Label();
        hBox1 = new HBox();
        label0 = new Label();
        separator = new Separator();
        label1 = new Label();
        scrollPane0 = new ScrollPane();
        vBox0 = new VBox();
        menuButton = new MenuButton();
        menuItem = new MenuItem();
        menuItem0 = new MenuItem();
        vBox1 = new VBox();
        label2 = new Label();
        label3 = new Label();
        hBox2 = new HBox();
        label4 = new Label();
        separator0 = new Separator();
        label5 = new Label();
        vBox2 = new VBox();
        label6 = new Label();
        label7 = new Label();
        hBox3 = new HBox();
        label8 = new Label();
        separator1 = new Separator();
        label9 = new Label();
        vBox3 = new VBox();
        label10 = new Label();
        label11 = new Label();
        hBox4 = new HBox();
        label12 = new Label();
        separator2 = new Separator();
        label13 = new Label();
        vBox4 = new VBox();
        label14 = new Label();
        label15 = new Label();
        hBox5 = new HBox();
        label16 = new Label();
        separator3 = new Separator();
        label17 = new Label();
        vBox5 = new VBox();
        label18 = new Label();
        label19 = new Label();
        hBox6 = new HBox();
        label110 = new Label();
        separator4 = new Separator();
        label111 = new Label();
        vBox6 = new VBox();
        label112 = new Label();
        label113 = new Label();
        hBox7 = new HBox();
        label114 = new Label();
        separator5 = new Separator();
        label115 = new Label();

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
        borderPane0.setPadding(new Insets(20.0, 20.0, 10.0, 20.0));

        BorderPane.setAlignment(hBox0, javafx.geometry.Pos.CENTER);
        hBox0.setPrefHeight(100.0);
        hBox0.setPrefWidth(200.0);
        hBox0.setSpacing(20.0);

        imageView0.setFitHeight(103.0);
        imageView0.setFitWidth(72.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("Bilder/dirk.jpg").toExternalForm()));

        vBox.setPrefHeight(79.0);
        vBox.setPrefWidth(558.0);
        vBox.setSpacing(4.0);

        label.setText("Dirk Gently's Holistic Detective Agency");
        label.setTextFill(javafx.scene.paint.Color.WHITE);
        label.setFont(new Font(20.0));

        hBox1.setPrefHeight(18.0);
        hBox1.setPrefWidth(4.0);

        label0.setText("2016-");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));

        separator.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separator.setPrefHeight(200.0);
        HBox.setMargin(separator, new Insets(0.0, 10.0, 0.0, 10.0));

        label1.setText("Comedy, Sci-Fi");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));
        borderPane0.setTop(hBox0);

        BorderPane.setAlignment(scrollPane0, javafx.geometry.Pos.CENTER);
        scrollPane0.setFitToWidth(true);
        scrollPane0.setPrefHeight(200.0);
        scrollPane0.setPrefWidth(200.0);
        scrollPane0.setStyle("-fx-background-color: #222;");

        vBox0.setPrefWidth(540.0);
        vBox0.setSpacing(20.0);
        vBox0.setStyle("-fx-background-color: #222;");

        menuButton.setMnemonicParsing(false);
        menuButton.setStyle("-fx-background-color: #009EE3;");
        menuButton.setText("Seasons");

        menuItem.setMnemonicParsing(false);
        menuItem.setText("Season 1");
        menuItem.setOnAction(this::seasonClick);

        menuItem0.setMnemonicParsing(false);
        menuItem0.setText("Season 2");
        menuItem0.setOnAction(this::seasonClick);
        VBox.setMargin(menuButton, new Insets(0.0));

        vBox1.setPrefWidth(200.0);
        vBox1.setSpacing(5.0);

        label2.setText("1. Horizon");
        label2.setTextFill(javafx.scene.paint.Color.WHITE);

        label3.setText("Holistic detective Dirk Gently investigates cases involving the supernatural.Holistic detective Dirk Gently investigates cases involving the supernatural.Holistic detective Dirk Gently investigates cases involving the supernatural.Holistic detective Dirk Gently investigates cases involving the supernatural.");
        label3.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));
        label3.setWrapText(true);

        hBox2.setPrefHeight(0.0);
        hBox2.setPrefWidth(520.0);
        hBox2.setSpacing(10.0);

        label4.setText("53 min");
        label4.setTextFill(javafx.scene.paint.Color.valueOf("#666666"));

        separator0.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separator0.setPrefHeight(200.0);
        separator0.setStyle("-fx-background-color: #666;");

        label5.setLayoutX(10.0);
        label5.setLayoutY(10.0);
        label5.setText("8.0/10");
        label5.setTextFill(javafx.scene.paint.Color.valueOf("#666666"));

        vBox2.setPrefWidth(200.0);
        vBox2.setSpacing(5.0);

        label6.setText("2. Horizon");
        label6.setTextFill(javafx.scene.paint.Color.WHITE);

        label7.setText("Holistic detective Dirk Gently investigates cases involving the supernatural.Holistic detective Dirk Gently investigates cases involving the supernatural.Holistic detective Dirk Gently investigates cases involving the supernatural.Holistic detective Dirk Gently investigates cases involving the supernatural.");
        label7.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));
        label7.setWrapText(true);

        hBox3.setPrefHeight(0.0);
        hBox3.setPrefWidth(520.0);
        hBox3.setSpacing(10.0);

        label8.setText("53 min");
        label8.setTextFill(javafx.scene.paint.Color.valueOf("#666666"));

        separator1.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separator1.setPrefHeight(200.0);
        separator1.setStyle("-fx-background-color: #666;");

        label9.setLayoutX(10.0);
        label9.setLayoutY(10.0);
        label9.setText("8.0/10");
        label9.setTextFill(javafx.scene.paint.Color.valueOf("#666666"));

        vBox3.setPrefWidth(200.0);
        vBox3.setSpacing(5.0);

        label10.setText("3. Horizon");
        label10.setTextFill(javafx.scene.paint.Color.WHITE);

        label11.setText("Holistic detective Dirk Gently investigates cases involving the supernatural.Holistic detective Dirk Gently investigates cases involving the supernatural.Holistic detective Dirk Gently investigates cases involving the supernatural.Holistic detective Dirk Gently investigates cases involving the supernatural.");
        label11.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));
        label11.setWrapText(true);

        hBox4.setPrefHeight(0.0);
        hBox4.setPrefWidth(520.0);
        hBox4.setSpacing(10.0);

        label12.setText("53 min");
        label12.setTextFill(javafx.scene.paint.Color.valueOf("#666666"));

        separator2.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separator2.setPrefHeight(200.0);
        separator2.setStyle("-fx-background-color: #666;");

        label13.setLayoutX(10.0);
        label13.setLayoutY(10.0);
        label13.setText("8.0/10");
        label13.setTextFill(javafx.scene.paint.Color.valueOf("#666666"));

        vBox4.setPrefWidth(200.0);
        vBox4.setSpacing(5.0);

        label14.setText("4. Horizon");
        label14.setTextFill(javafx.scene.paint.Color.WHITE);

        label15.setText("Holistic detective Dirk Gently investigates cases involving the supernatural.Holistic detective Dirk Gently investigates cases involving the supernatural.Holistic detective Dirk Gently investigates cases involving the supernatural.Holistic detective Dirk Gently investigates cases involving the supernatural.");
        label15.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));
        label15.setWrapText(true);

        hBox5.setPrefHeight(0.0);
        hBox5.setPrefWidth(520.0);
        hBox5.setSpacing(10.0);

        label16.setText("53 min");
        label16.setTextFill(javafx.scene.paint.Color.valueOf("#666666"));

        separator3.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separator3.setPrefHeight(200.0);
        separator3.setStyle("-fx-background-color: #666;");

        label17.setLayoutX(10.0);
        label17.setLayoutY(10.0);
        label17.setText("8.0/10");
        label17.setTextFill(javafx.scene.paint.Color.valueOf("#666666"));

        vBox5.setPrefWidth(200.0);
        vBox5.setSpacing(5.0);

        label18.setText("5. Horizon");
        label18.setTextFill(javafx.scene.paint.Color.WHITE);

        label19.setText("Holistic detective Dirk Gently investigates cases involving the supernatural.Holistic detective Dirk Gently investigates cases involving the supernatural.Holistic detective Dirk Gently investigates cases involving the supernatural.Holistic detective Dirk Gently investigates cases involving the supernatural.");
        label19.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));
        label19.setWrapText(true);

        hBox6.setPrefHeight(0.0);
        hBox6.setPrefWidth(520.0);
        hBox6.setSpacing(10.0);

        label110.setText("53 min");
        label110.setTextFill(javafx.scene.paint.Color.valueOf("#666666"));

        separator4.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separator4.setPrefHeight(200.0);
        separator4.setStyle("-fx-background-color: #666;");

        label111.setLayoutX(10.0);
        label111.setLayoutY(10.0);
        label111.setText("8.0/10");
        label111.setTextFill(javafx.scene.paint.Color.valueOf("#666666"));

        vBox6.setPrefWidth(200.0);
        vBox6.setSpacing(5.0);

        label112.setText("6. Horizon");
        label112.setTextFill(javafx.scene.paint.Color.WHITE);

        label113.setText("Holistic detective Dirk Gently investigates cases involving the supernatural.Holistic detective Dirk Gently investigates cases involving the supernatural.Holistic detective Dirk Gently investigates cases involving the supernatural.Holistic detective Dirk Gently investigates cases involving the supernatural.");
        label113.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));
        label113.setWrapText(true);

        hBox7.setPrefHeight(0.0);
        hBox7.setPrefWidth(520.0);
        hBox7.setSpacing(10.0);

        label114.setText("53 min");
        label114.setTextFill(javafx.scene.paint.Color.valueOf("#666666"));

        separator5.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separator5.setPrefHeight(200.0);
        separator5.setStyle("-fx-background-color: #666;");

        label115.setLayoutX(10.0);
        label115.setLayoutY(10.0);
        label115.setText("8.0/10");
        label115.setTextFill(javafx.scene.paint.Color.valueOf("#666666"));
        vBox0.setPadding(new Insets(10.0, 10.0, 20.0, 10.0));
        vBox0.setOpaqueInsets(new Insets(0.0));
        scrollPane0.setContent(vBox0);
        BorderPane.setMargin(scrollPane0, new Insets(10.0, 0.0, 0.0, 0.0));
        borderPane0.setCenter(scrollPane0);
        scrollPane.setContent(borderPane0);
        border.setCenter(scrollPane);

        hBox.getChildren().add(textField);
        hBox.getChildren().add(button);
        hBox0.getChildren().add(imageView0);
        vBox.getChildren().add(label);
        hBox1.getChildren().add(label0);
        hBox1.getChildren().add(separator);
        hBox1.getChildren().add(label1);
        vBox.getChildren().add(hBox1);
        hBox0.getChildren().add(vBox);
        menuButton.getItems().add(menuItem);
        menuButton.getItems().add(menuItem0);
        vBox0.getChildren().add(menuButton);
        vBox1.getChildren().add(label2);
        vBox1.getChildren().add(label3);
        hBox2.getChildren().add(label4);
        hBox2.getChildren().add(separator0);
        hBox2.getChildren().add(label5);
        vBox1.getChildren().add(hBox2);
        vBox0.getChildren().add(vBox1);
        vBox2.getChildren().add(label6);
        vBox2.getChildren().add(label7);
        hBox3.getChildren().add(label8);
        hBox3.getChildren().add(separator1);
        hBox3.getChildren().add(label9);
        vBox2.getChildren().add(hBox3);
        vBox0.getChildren().add(vBox2);
        vBox3.getChildren().add(label10);
        vBox3.getChildren().add(label11);
        hBox4.getChildren().add(label12);
        hBox4.getChildren().add(separator2);
        hBox4.getChildren().add(label13);
        vBox3.getChildren().add(hBox4);
        vBox0.getChildren().add(vBox3);
        vBox4.getChildren().add(label14);
        vBox4.getChildren().add(label15);
        hBox5.getChildren().add(label16);
        hBox5.getChildren().add(separator3);
        hBox5.getChildren().add(label17);
        vBox4.getChildren().add(hBox5);
        vBox0.getChildren().add(vBox4);
        vBox5.getChildren().add(label18);
        vBox5.getChildren().add(label19);
        hBox6.getChildren().add(label110);
        hBox6.getChildren().add(separator4);
        hBox6.getChildren().add(label111);
        vBox5.getChildren().add(hBox6);
        vBox0.getChildren().add(vBox5);
        vBox6.getChildren().add(label112);
        vBox6.getChildren().add(label113);
        hBox7.getChildren().add(label114);
        hBox7.getChildren().add(separator5);
        hBox7.getChildren().add(label115);
        vBox6.getChildren().add(hBox7);
        vBox0.getChildren().add(vBox6);
        
        return border;
    }
    
    public void seasonClick(ActionEvent actionEvent) {
        System.out.println("Ändrar säsong");
    }
}
