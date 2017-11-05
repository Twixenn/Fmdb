package moviedatabase;

import java.net.URL;
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
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public abstract class imdbSakBase extends BorderPane {

    protected ScrollPane scrollPane;
    protected VBox vBox;
    protected BorderPane borderPane;
    protected ScrollPane scrollPane0;
    protected HBox hBox;
    protected BorderPane borderPane0;
    protected ImageView imageView;
    protected BorderPane borderPane1;
    protected ImageView imageView0;
    protected BorderPane borderPane2;
    protected ImageView imageView1;
    protected BorderPane borderPane3;
    protected ImageView imageView2;
    protected BorderPane borderPane4;
    protected ImageView imageView3;
    protected BorderPane borderPane5;
    protected ImageView imageView4;
    protected BorderPane borderPane6;
    protected ImageView imageView5;
    protected BorderPane borderPane7;
    protected ImageView imageView6;
    protected Label label;
    protected BorderPane borderPane8;
    protected ScrollPane scrollPane1;
    protected HBox hBox0;
    protected BorderPane borderPane9;
    protected ImageView imageView7;
    protected BorderPane borderPane10;
    protected ImageView imageView8;
    protected BorderPane borderPane11;
    protected ImageView imageView9;
    protected BorderPane borderPane12;
    protected ImageView imageView10;
    protected BorderPane borderPane13;
    protected ImageView imageView11;
    protected BorderPane borderPane14;
    protected ImageView imageView12;
    protected BorderPane borderPane15;
    protected ImageView imageView13;
    protected BorderPane borderPane16;
    protected ImageView imageView14;
    protected Label label0;
    protected BorderPane borderPane17;
    protected ScrollPane scrollPane2;
    protected HBox hBox1;
    protected BorderPane borderPane18;
    protected ImageView imageView15;
    protected BorderPane borderPane19;
    protected ImageView imageView16;
    protected BorderPane borderPane110;
    protected ImageView imageView17;
    protected BorderPane borderPane111;
    protected ImageView imageView18;
    protected BorderPane borderPane112;
    protected ImageView imageView19;
    protected BorderPane borderPane113;
    protected ImageView imageView110;
    protected BorderPane borderPane114;
    protected ImageView imageView111;
    protected BorderPane borderPane115;
    protected ImageView imageView112;
    protected Label label1;
    protected BorderPane borderPane116;
    protected HBox hBox2;
    protected TextField textField;
    protected Button button;
    protected ImageView imageView113;
    protected ImageView imageView114;

    public imdbSakBase() {

        scrollPane = new ScrollPane();
        vBox = new VBox();
        borderPane = new BorderPane();
        scrollPane0 = new ScrollPane();
        hBox = new HBox();
        borderPane0 = new BorderPane();
        imageView = new ImageView();
        borderPane1 = new BorderPane();
        imageView0 = new ImageView();
        borderPane2 = new BorderPane();
        imageView1 = new ImageView();
        borderPane3 = new BorderPane();
        imageView2 = new ImageView();
        borderPane4 = new BorderPane();
        imageView3 = new ImageView();
        borderPane5 = new BorderPane();
        imageView4 = new ImageView();
        borderPane6 = new BorderPane();
        imageView5 = new ImageView();
        borderPane7 = new BorderPane();
        imageView6 = new ImageView();
        label = new Label();
        borderPane8 = new BorderPane();
        scrollPane1 = new ScrollPane();
        hBox0 = new HBox();
        borderPane9 = new BorderPane();
        imageView7 = new ImageView();
        borderPane10 = new BorderPane();
        imageView8 = new ImageView();
        borderPane11 = new BorderPane();
        imageView9 = new ImageView();
        borderPane12 = new BorderPane();
        imageView10 = new ImageView();
        borderPane13 = new BorderPane();
        imageView11 = new ImageView();
        borderPane14 = new BorderPane();
        imageView12 = new ImageView();
        borderPane15 = new BorderPane();
        imageView13 = new ImageView();
        borderPane16 = new BorderPane();
        imageView14 = new ImageView();
        label0 = new Label();
        borderPane17 = new BorderPane();
        scrollPane2 = new ScrollPane();
        hBox1 = new HBox();
        borderPane18 = new BorderPane();
        imageView15 = new ImageView();
        borderPane19 = new BorderPane();
        imageView16 = new ImageView();
        borderPane110 = new BorderPane();
        imageView17 = new ImageView();
        borderPane111 = new BorderPane();
        imageView18 = new ImageView();
        borderPane112 = new BorderPane();
        imageView19 = new ImageView();
        borderPane113 = new BorderPane();
        imageView110 = new ImageView();
        borderPane114 = new BorderPane();
        imageView111 = new ImageView();
        borderPane115 = new BorderPane();
        imageView112 = new ImageView();
        label1 = new Label();
        borderPane116 = new BorderPane();
        hBox2 = new HBox();
        textField = new TextField();
        button = new Button();
        imageView113 = new ImageView();
        imageView114 = new ImageView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);
        setStyle("-fx-background-color: black;");

        BorderPane.setAlignment(scrollPane, javafx.geometry.Pos.CENTER);
        scrollPane.setFitToHeight(true);
        scrollPane.setFitToWidth(true);
        scrollPane.setPrefHeight(200.0);
        scrollPane.setPrefWidth(200.0);
        scrollPane.setStyle("-fx-background-color: black;");

        vBox.setSpacing(20.0);
        vBox.setStyle("-fx-background-color: black;");

        borderPane.setPrefHeight(200.0);
        borderPane.setPrefWidth(200.0);

        BorderPane.setAlignment(scrollPane0, javafx.geometry.Pos.CENTER);
        scrollPane0.setFitToHeight(true);
        scrollPane0.setFitToWidth(true);
        scrollPane0.setHvalue(0.5);
        scrollPane0.setMinHeight(USE_PREF_SIZE);
        scrollPane0.setPrefHeight(200.0);
        scrollPane0.setPrefWidth(200.0);
        scrollPane0.setStyle("-fx-background-color: black;");

        hBox.setPrefHeight(100.0);
        hBox.setPrefWidth(200.0);
        hBox.setSpacing(10.0);
        hBox.setStyle("-fx-background-color: black;");

        borderPane0.setLayoutX(457.0);
        borderPane0.setLayoutY(10.0);
        borderPane0.setPrefHeight(180.0);
        borderPane0.setPrefWidth(200.0);

        BorderPane.setAlignment(imageView, javafx.geometry.Pos.CENTER);
        imageView.setFitHeight(180.0);
        imageView.setFitWidth(165.0);
        imageView.setOnMouseClicked(this::imageClick);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("dirk.jpg").toExternalForm()));
        borderPane0.setCenter(imageView);

        borderPane1.setPrefHeight(180.0);
        borderPane1.setPrefWidth(200.0);

        BorderPane.setAlignment(imageView0, javafx.geometry.Pos.CENTER);
        imageView0.setFitHeight(180.0);
        imageView0.setFitWidth(165.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("dirk.jpg").toExternalForm()));
        borderPane1.setCenter(imageView0);

        borderPane2.setPrefHeight(180.0);
        borderPane2.setPrefWidth(200.0);

        BorderPane.setAlignment(imageView1, javafx.geometry.Pos.CENTER);
        imageView1.setFitHeight(180.0);
        imageView1.setFitWidth(165.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("dirk.jpg").toExternalForm()));
        borderPane2.setCenter(imageView1);

        borderPane3.setPrefHeight(180.0);
        borderPane3.setPrefWidth(200.0);

        BorderPane.setAlignment(imageView2, javafx.geometry.Pos.CENTER);
        imageView2.setFitHeight(180.0);
        imageView2.setFitWidth(165.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("dirk.jpg").toExternalForm()));
        borderPane3.setCenter(imageView2);

        borderPane4.setPrefHeight(180.0);
        borderPane4.setPrefWidth(200.0);

        BorderPane.setAlignment(imageView3, javafx.geometry.Pos.CENTER);
        imageView3.setFitHeight(180.0);
        imageView3.setFitWidth(165.0);
        imageView3.setPickOnBounds(true);
        imageView3.setPreserveRatio(true);
        imageView3.setImage(new Image(getClass().getResource("dirk.jpg").toExternalForm()));
        borderPane4.setCenter(imageView3);

        borderPane5.setPrefHeight(180.0);
        borderPane5.setPrefWidth(200.0);

        BorderPane.setAlignment(imageView4, javafx.geometry.Pos.CENTER);
        imageView4.setFitHeight(180.0);
        imageView4.setFitWidth(165.0);
        imageView4.setPickOnBounds(true);
        imageView4.setPreserveRatio(true);
        imageView4.setImage(new Image(getClass().getResource("dirk.jpg").toExternalForm()));
        borderPane5.setCenter(imageView4);

        borderPane6.setPrefHeight(180.0);
        borderPane6.setPrefWidth(200.0);

        BorderPane.setAlignment(imageView5, javafx.geometry.Pos.CENTER);
        imageView5.setFitHeight(180.0);
        imageView5.setFitWidth(165.0);
        imageView5.setPickOnBounds(true);
        imageView5.setPreserveRatio(true);
        imageView5.setImage(new Image(getClass().getResource("dirk.jpg").toExternalForm()));
        borderPane6.setCenter(imageView5);

        borderPane7.setPrefHeight(180.0);
        borderPane7.setPrefWidth(200.0);

        BorderPane.setAlignment(imageView6, javafx.geometry.Pos.CENTER);
        imageView6.setFitHeight(180.0);
        imageView6.setFitWidth(165.0);
        imageView6.setPickOnBounds(true);
        imageView6.setPreserveRatio(true);
        imageView6.setImage(new Image(getClass().getResource("dirk.jpg").toExternalForm()));
        borderPane7.setCenter(imageView6);
        hBox.setPadding(new Insets(0.0, 10.0, 0.0, 10.0));
        scrollPane0.setContent(hBox);
        borderPane.setCenter(scrollPane0);

        BorderPane.setAlignment(label, javafx.geometry.Pos.CENTER_LEFT);
        label.setText("Comedy");
        label.setTextFill(javafx.scene.paint.Color.WHITE);
        label.setFont(new Font("System Font", 20.0));
        borderPane.setTop(label);

        borderPane8.setPrefHeight(200.0);
        borderPane8.setPrefWidth(200.0);

        BorderPane.setAlignment(scrollPane1, javafx.geometry.Pos.CENTER);
        scrollPane1.setFitToHeight(true);
        scrollPane1.setFitToWidth(true);
        scrollPane1.setHvalue(0.5);
        scrollPane1.setMinHeight(USE_PREF_SIZE);
        scrollPane1.setPrefHeight(200.0);
        scrollPane1.setPrefWidth(200.0);
        scrollPane1.setStyle("-fx-background-color: black;");

        hBox0.setPrefHeight(100.0);
        hBox0.setPrefWidth(200.0);
        hBox0.setSpacing(10.0);
        hBox0.setStyle("-fx-background-color: black;");

        borderPane9.setLayoutX(457.0);
        borderPane9.setLayoutY(10.0);
        borderPane9.setPrefHeight(180.0);
        borderPane9.setPrefWidth(200.0);

        BorderPane.setAlignment(imageView7, javafx.geometry.Pos.CENTER);
        imageView7.setFitHeight(180.0);
        imageView7.setFitWidth(165.0);
        imageView7.setPickOnBounds(true);
        imageView7.setPreserveRatio(true);
        imageView7.setImage(new Image(getClass().getResource("dirk.jpg").toExternalForm()));
        borderPane9.setCenter(imageView7);

        borderPane10.setPrefHeight(180.0);
        borderPane10.setPrefWidth(200.0);

        BorderPane.setAlignment(imageView8, javafx.geometry.Pos.CENTER);
        imageView8.setFitHeight(180.0);
        imageView8.setFitWidth(165.0);
        imageView8.setPickOnBounds(true);
        imageView8.setPreserveRatio(true);
        imageView8.setImage(new Image(getClass().getResource("dirk.jpg").toExternalForm()));
        borderPane10.setCenter(imageView8);

        borderPane11.setPrefHeight(180.0);
        borderPane11.setPrefWidth(200.0);

        BorderPane.setAlignment(imageView9, javafx.geometry.Pos.CENTER);
        imageView9.setFitHeight(180.0);
        imageView9.setFitWidth(165.0);
        imageView9.setPickOnBounds(true);
        imageView9.setPreserveRatio(true);
        imageView9.setImage(new Image(getClass().getResource("dirk.jpg").toExternalForm()));
        borderPane11.setCenter(imageView9);

        borderPane12.setPrefHeight(180.0);
        borderPane12.setPrefWidth(200.0);

        BorderPane.setAlignment(imageView10, javafx.geometry.Pos.CENTER);
        imageView10.setFitHeight(180.0);
        imageView10.setFitWidth(165.0);
        imageView10.setPickOnBounds(true);
        imageView10.setPreserveRatio(true);
        imageView10.setImage(new Image(getClass().getResource("dirk.jpg").toExternalForm()));
        borderPane12.setCenter(imageView10);

        borderPane13.setPrefHeight(180.0);
        borderPane13.setPrefWidth(200.0);

        BorderPane.setAlignment(imageView11, javafx.geometry.Pos.CENTER);
        imageView11.setFitHeight(180.0);
        imageView11.setFitWidth(165.0);
        imageView11.setPickOnBounds(true);
        imageView11.setPreserveRatio(true);
        imageView11.setImage(new Image(getClass().getResource("dirk.jpg").toExternalForm()));
        borderPane13.setCenter(imageView11);

        borderPane14.setPrefHeight(180.0);
        borderPane14.setPrefWidth(200.0);

        BorderPane.setAlignment(imageView12, javafx.geometry.Pos.CENTER);
        imageView12.setFitHeight(180.0);
        imageView12.setFitWidth(165.0);
        imageView12.setPickOnBounds(true);
        imageView12.setPreserveRatio(true);
        imageView12.setImage(new Image(getClass().getResource("dirk.jpg").toExternalForm()));
        borderPane14.setCenter(imageView12);

        borderPane15.setPrefHeight(180.0);
        borderPane15.setPrefWidth(200.0);

        BorderPane.setAlignment(imageView13, javafx.geometry.Pos.CENTER);
        imageView13.setFitHeight(180.0);
        imageView13.setFitWidth(165.0);
        imageView13.setPickOnBounds(true);
        imageView13.setPreserveRatio(true);
        imageView13.setImage(new Image(getClass().getResource("dirk.jpg").toExternalForm()));
        borderPane15.setCenter(imageView13);

        borderPane16.setPrefHeight(180.0);
        borderPane16.setPrefWidth(200.0);

        BorderPane.setAlignment(imageView14, javafx.geometry.Pos.CENTER);
        imageView14.setFitHeight(180.0);
        imageView14.setFitWidth(165.0);
        imageView14.setPickOnBounds(true);
        imageView14.setPreserveRatio(true);
        imageView14.setImage(new Image(getClass().getResource("dirk.jpg").toExternalForm()));
        borderPane16.setCenter(imageView14);
        hBox0.setPadding(new Insets(0.0, 10.0, 0.0, 10.0));
        scrollPane1.setContent(hBox0);
        borderPane8.setCenter(scrollPane1);

        BorderPane.setAlignment(label0, javafx.geometry.Pos.CENTER_LEFT);
        label0.setText("Comedy");
        label0.setTextFill(javafx.scene.paint.Color.WHITE);
        label0.setFont(new Font("System Font", 20.0));
        borderPane8.setTop(label0);

        borderPane17.setPrefHeight(200.0);
        borderPane17.setPrefWidth(200.0);

        BorderPane.setAlignment(scrollPane2, javafx.geometry.Pos.CENTER);
        scrollPane2.setFitToHeight(true);
        scrollPane2.setFitToWidth(true);
        scrollPane2.setHvalue(0.5);
        scrollPane2.setMinHeight(USE_PREF_SIZE);
        scrollPane2.setPrefHeight(200.0);
        scrollPane2.setPrefWidth(200.0);
        scrollPane2.setStyle("-fx-background-color: black;");

        hBox1.setPrefHeight(100.0);
        hBox1.setPrefWidth(200.0);
        hBox1.setSpacing(10.0);
        hBox1.setStyle("-fx-background-color: black;");

        borderPane18.setLayoutX(457.0);
        borderPane18.setLayoutY(10.0);
        borderPane18.setPrefHeight(180.0);
        borderPane18.setPrefWidth(200.0);

        BorderPane.setAlignment(imageView15, javafx.geometry.Pos.CENTER);
        imageView15.setFitHeight(180.0);
        imageView15.setFitWidth(165.0);
        imageView15.setPickOnBounds(true);
        imageView15.setPreserveRatio(true);
        imageView15.setImage(new Image(getClass().getResource("dirk.jpg").toExternalForm()));
        borderPane18.setCenter(imageView15);

        borderPane19.setPrefHeight(180.0);
        borderPane19.setPrefWidth(200.0);

        BorderPane.setAlignment(imageView16, javafx.geometry.Pos.CENTER);
        imageView16.setFitHeight(180.0);
        imageView16.setFitWidth(165.0);
        imageView16.setPickOnBounds(true);
        imageView16.setPreserveRatio(true);
        imageView16.setImage(new Image(getClass().getResource("dirk.jpg").toExternalForm()));
        borderPane19.setCenter(imageView16);

        borderPane110.setPrefHeight(180.0);
        borderPane110.setPrefWidth(200.0);

        BorderPane.setAlignment(imageView17, javafx.geometry.Pos.CENTER);
        imageView17.setFitHeight(180.0);
        imageView17.setFitWidth(165.0);
        imageView17.setPickOnBounds(true);
        imageView17.setPreserveRatio(true);
        imageView17.setImage(new Image(getClass().getResource("dirk.jpg").toExternalForm()));
        borderPane110.setCenter(imageView17);

        borderPane111.setPrefHeight(180.0);
        borderPane111.setPrefWidth(200.0);

        BorderPane.setAlignment(imageView18, javafx.geometry.Pos.CENTER);
        imageView18.setFitHeight(180.0);
        imageView18.setFitWidth(165.0);
        imageView18.setPickOnBounds(true);
        imageView18.setPreserveRatio(true);
        imageView18.setImage(new Image(getClass().getResource("dirk.jpg").toExternalForm()));
        borderPane111.setCenter(imageView18);

        borderPane112.setPrefHeight(180.0);
        borderPane112.setPrefWidth(200.0);

        BorderPane.setAlignment(imageView19, javafx.geometry.Pos.CENTER);
        imageView19.setFitHeight(180.0);
        imageView19.setFitWidth(165.0);
        imageView19.setPickOnBounds(true);
        imageView19.setPreserveRatio(true);
        imageView19.setImage(new Image(getClass().getResource("dirk.jpg").toExternalForm()));
        borderPane112.setCenter(imageView19);

        borderPane113.setPrefHeight(180.0);
        borderPane113.setPrefWidth(200.0);

        BorderPane.setAlignment(imageView110, javafx.geometry.Pos.CENTER);
        imageView110.setFitHeight(180.0);
        imageView110.setFitWidth(165.0);
        imageView110.setPickOnBounds(true);
        imageView110.setPreserveRatio(true);
        imageView110.setImage(new Image(getClass().getResource("dirk.jpg").toExternalForm()));
        borderPane113.setCenter(imageView110);

        borderPane114.setPrefHeight(180.0);
        borderPane114.setPrefWidth(200.0);

        BorderPane.setAlignment(imageView111, javafx.geometry.Pos.CENTER);
        imageView111.setFitHeight(180.0);
        imageView111.setFitWidth(165.0);
        imageView111.setPickOnBounds(true);
        imageView111.setPreserveRatio(true);
        imageView111.setImage(new Image(getClass().getResource("dirk.jpg").toExternalForm()));
        borderPane114.setCenter(imageView111);

        borderPane115.setPrefHeight(180.0);
        borderPane115.setPrefWidth(200.0);

        BorderPane.setAlignment(imageView112, javafx.geometry.Pos.CENTER);
        imageView112.setFitHeight(180.0);
        imageView112.setFitWidth(165.0);
        imageView112.setPickOnBounds(true);
        imageView112.setPreserveRatio(true);
        imageView112.setImage(new Image(getClass().getResource("dirk.jpg").toExternalForm()));
        borderPane115.setCenter(imageView112);
        hBox1.setPadding(new Insets(0.0, 10.0, 0.0, 10.0));
        scrollPane2.setContent(hBox1);
        borderPane17.setCenter(scrollPane2);

        BorderPane.setAlignment(label1, javafx.geometry.Pos.CENTER_LEFT);
        label1.setText("Comedy");
        label1.setTextFill(javafx.scene.paint.Color.WHITE);
        label1.setFont(new Font("System Font", 20.0));
        borderPane17.setTop(label1);
        vBox.setPadding(new Insets(0.0, 10.0, 0.0, 20.0));
        scrollPane.setContent(vBox);
        setCenter(scrollPane);

        BorderPane.setAlignment(borderPane116, javafx.geometry.Pos.CENTER);
        borderPane116.setPrefHeight(50.0);
        borderPane116.setPrefWidth(200.0);

        BorderPane.setAlignment(hBox2, javafx.geometry.Pos.CENTER);
        hBox2.setAlignment(javafx.geometry.Pos.CENTER);
        hBox2.setPrefHeight(76.0);
        hBox2.setPrefWidth(254.0);
        hBox2.setSpacing(10.0);

        textField.setPromptText("Search...");

        button.setMnemonicParsing(false);
        button.setStyle("-fx-background-color: #009EE3;");
        button.setText("Search");
        button.setFont(new Font(12.0));
        button.setCursor(Cursor.HAND);
        hBox2.setPadding(new Insets(0.0, 20.0, 0.0, 0.0));
        borderPane116.setRight(hBox2);

        BorderPane.setAlignment(imageView113, javafx.geometry.Pos.CENTER);
        imageView113.setFitHeight(56.0);
        imageView113.setFitWidth(162.0);
        imageView113.setPickOnBounds(true);
        imageView113.setPreserveRatio(true);
        imageView113.setImage(new Image(getClass().getResource("fmdb.png").toExternalForm()));
        BorderPane.setMargin(imageView113, new Insets(10.0, 0.0, 10.0, 20.0));
        borderPane116.setLeft(imageView113);

        BorderPane.setAlignment(imageView114, javafx.geometry.Pos.CENTER);
        imageView114.setFitHeight(30.0);
        imageView114.setFitWidth(25.0);
        imageView114.setPickOnBounds(true);
        imageView114.setPreserveRatio(true);
        imageView114.setImage(new Image(getClass().getResource("../../../../../../../Desktop/IMDB/avatar.png").toExternalForm()));
        borderPane116.setCenter(imageView114);
        setTop(borderPane116);
        getStylesheets().add("/moviedatabase/main.css");
        getStylesheets().add("/moviedatabase/main.css");

        hBox.getChildren().add(borderPane0);
        hBox.getChildren().add(borderPane1);
        hBox.getChildren().add(borderPane2);
        hBox.getChildren().add(borderPane3);
        hBox.getChildren().add(borderPane4);
        hBox.getChildren().add(borderPane5);
        hBox.getChildren().add(borderPane6);
        hBox.getChildren().add(borderPane7);
        vBox.getChildren().add(borderPane);
        hBox0.getChildren().add(borderPane9);
        hBox0.getChildren().add(borderPane10);
        hBox0.getChildren().add(borderPane11);
        hBox0.getChildren().add(borderPane12);
        hBox0.getChildren().add(borderPane13);
        hBox0.getChildren().add(borderPane14);
        hBox0.getChildren().add(borderPane15);
        hBox0.getChildren().add(borderPane16);
        vBox.getChildren().add(borderPane8);
        hBox1.getChildren().add(borderPane18);
        hBox1.getChildren().add(borderPane19);
        hBox1.getChildren().add(borderPane110);
        hBox1.getChildren().add(borderPane111);
        hBox1.getChildren().add(borderPane112);
        hBox1.getChildren().add(borderPane113);
        hBox1.getChildren().add(borderPane114);
        hBox1.getChildren().add(borderPane115);
        vBox.getChildren().add(borderPane17);
        hBox2.getChildren().add(textField);
        hBox2.getChildren().add(button);

    }

    protected abstract void imageClick(javafx.scene.input.MouseEvent mouseEvent);

}
