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
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.scene.layout.VBox;
import javafx.scene.shape.SVGPath;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import moviedatabase.beans.Serie;

/**
 *
 * @author Fia
 */
public class SerieView {
    BorderPane borderPane;
    HBox hBox;
    TextField textField;
    Button button;
    ImageView imageView;
    ScrollPane scrollPane;
    BorderPane borderPane0;
    ImageView imageView0;
    VBox vBox;
    Label label;
    HBox hBox0;
    Label label0;
    Separator separator;
    Label label1;
    HBox hBox1;
    SVGPath sVGPath;
    Label label2;
    VBox vBox0;
    Label label3;
    HBox hBox2;
    Label label4;
    Label label5;
    Button button0;
    Stage stag;
    Button button1;
    
    private Serie serie;

    public BorderPane displaySerie(String title) {
        this.serie = new MovieDatabaseController().getSeries(title);
        
        button1 = new Button();
        borderPane = new BorderPane();
        hBox = new HBox();
        textField = new TextField();
        button = new Button();
        imageView = new ImageView();
        scrollPane = new ScrollPane();
        borderPane0 = new BorderPane();
        imageView0 = new ImageView();
        vBox = new VBox();
        label = new Label();
        hBox0 = new HBox();
        label0 = new Label();
        separator = new Separator();
        label1 = new Label();
        hBox1 = new HBox();
        label2 = new Label();
        vBox0 = new VBox();
        label3 = new Label();
        hBox2 = new HBox();
        label4 = new Label();
        label5 = new Label();
        button0 = new Button();
        List<SVGPath> stars = new ArrayList();
        
        BorderPane border = new BorderPane();
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
        borderPane0.setPadding(new Insets(20.0, 20.0, 10.0, 20.0));

        BorderPane.setAlignment(imageView0, javafx.geometry.Pos.TOP_CENTER);
        imageView0.setFitHeight(180.0);
        imageView0.setFitWidth(200.0); 
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("Bilder/"+ this.serie.getTitle() +".jpg").toExternalForm()));
        BorderPane.setMargin(imageView0, new Insets(20.0, 0.0, 0.0, 0.0));
        borderPane0.setLeft(imageView0);

        BorderPane.setAlignment(vBox, javafx.geometry.Pos.CENTER);
        vBox.setPrefHeight(79.0);
        vBox.setPrefWidth(558.0);
        vBox.setSpacing(4.0);

        label.setText(this.serie.getTitle());
        label.setTextFill(javafx.scene.paint.Color.WHITE);
        label.setFont(new Font(20.0));

        hBox0.setPrefHeight(18.0);
        hBox0.setPrefWidth(4.0);

        label0.setText(this.serie.getReleaseYear());
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));

        separator.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separator.setPrefHeight(200.0);
        HBox.setMargin(separator, new Insets(0.0, 10.0, 0.0, 10.0));

        label1.setText(this.serie.getGenres());
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));

        hBox1.setPrefHeight(28.0);
        hBox1.setPrefWidth(542.0);
        
        for(int i = 0; i <= 10; i++) {
            sVGPath = new SVGPath();
            if(i <= this.serie.getRatings()) {
                sVGPath.setContent("M9.5 14.25l-5.584 2.936 1.066-6.218L.465 6.564l6.243-.907L9.5 0l2.792 5.657 6.243.907-4.517 4.404 1.066 6.218M9.5 14.25l-5.584 2.936 1.066-6.218L.465 6.564l6.243-.907L9.5 0l2.792 5.657 6.243.907-4.517 4.404 1.066 6.218");
                sVGPath.setFill(javafx.scene.paint.Color.valueOf("#009ee3"));
            } else {
                sVGPath.setContent("M9.5 14.25l-5.584 2.936 1.066-6.218L.465 6.564l6.243-.907L9.5 0l2.792 5.657 6.243.907-4.517 4.404 1.066 6.218M9.5 14.25l-5.584 2.936 1.066-6.218L.465 6.564l6.243-.907L9.5 0l2.792 5.657 6.243.907-4.517 4.404 1.066 6.218");
                sVGPath.setFill(javafx.scene.paint.Color.WHITE);
            }
            stars.add(sVGPath);
        }

        label2.setAlignment(javafx.geometry.Pos.CENTER);
        label2.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        label2.setText(this.serie.getRatings() + "/10");
        label2.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));
        HBox.setMargin(label2, new Insets(0.0, 0.0, 0.0, 10.0));
        borderPane0.setTop(vBox);

        BorderPane.setAlignment(vBox0, javafx.geometry.Pos.CENTER);
        vBox0.setPrefHeight(213.0);
        vBox0.setPrefWidth(441.0);
        vBox0.setSpacing(10.0);

        label3.setText(this.serie.getPlot());
        label3.setTextFill(javafx.scene.paint.Color.WHITE);
        label3.setWrapText(true);

        hBox2.setPrefHeight(19.0);
        hBox2.setPrefWidth(395.0);
        hBox2.setSpacing(10.0);

        button0.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(27.0);
        button0.setPrefWidth(124.0);
        button0.setStyle("-fx-background-insets: 0; -fx-background-color: transparent; -fx-background-radius: 0; -fx-border-width: 0;");
        button0.setText("Episode Guide >");
        button0.setOnMouseClicked(this::episodeClick);
        button0.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));
        button0.setUnderline(true);
        button0.setCursor(Cursor.HAND);
        
        vBox0.setPadding(new Insets(20.0, 20.0, 0.0, 20.0));
        borderPane0.setCenter(vBox0);
        scrollPane.setContent(borderPane0);
        border.setCenter(scrollPane);

        hBox.getChildren().add(textField);
        hBox.getChildren().add(button);
        vBox.getChildren().add(label);
        hBox0.getChildren().add(label0);
        hBox0.getChildren().add(separator);
        hBox0.getChildren().add(label1);
        vBox.getChildren().add(hBox0);
        for(SVGPath star:stars) {
            hBox1.getChildren().add(star);
        }
        hBox1.getChildren().add(label2);
        vBox.getChildren().add(hBox1);
        vBox0.getChildren().add(label3);
        vBox0.getChildren().add(hBox2);
        vBox0.getChildren().add(button0);
        
        return border;
    }
    
    public void episodeClick(MouseEvent mouseEvent) {
        new MovieDatabaseController().loadNewScene(new EpisodeList().displayEpisodeList(this.serie));
    }
    
    public void addToWatchList(MouseEvent mouseEvent) {
        if(!WatchList.watchList.contains(this.serie)) {
            WatchList.watchList.add(this.serie);
        }
    }
}
