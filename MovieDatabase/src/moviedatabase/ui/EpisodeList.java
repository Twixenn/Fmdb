/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviedatabase.ui;

import java.util.ArrayList;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
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
import javafx.scene.text.Text;
import moviedatabase.beans.Episode;
import moviedatabase.beans.Season;
import moviedatabase.beans.Serie;

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
    private Serie serie;
    private List<MenuItem> menuItems;
    private Season selectedSeason;

    public BorderPane displayEpisodeList(Serie serie) {
        this.serie = serie;
        new MovieDatabaseController().getSeasons(this.serie);
        this.selectedSeason = this.serie.getSeasons().get(0);

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

        BorderPane.setAlignment(hBox0, javafx.geometry.Pos.CENTER);
        hBox0.setPrefHeight(100.0);
        hBox0.setPrefWidth(200.0);
        hBox0.setSpacing(20.0);

        imageView0.setFitHeight(103.0);
        imageView0.setFitWidth(72.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("Bilder/" + this.serie.getTitle() + ".jpg").toExternalForm()));

        vBox.setPrefHeight(79.0);
        vBox.setPrefWidth(558.0);
        vBox.setSpacing(4.0);

        label.setText(this.serie.getTitle());
        label.setTextFill(javafx.scene.paint.Color.WHITE);
        label.setFont(new Font(20.0));

        hBox1.setPrefHeight(18.0);
        hBox1.setPrefWidth(4.0);

        label0.setText(this.serie.getReleaseYear());
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));

        separator.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separator.setPrefHeight(200.0);
        HBox.setMargin(separator, new Insets(0.0, 10.0, 0.0, 10.0));

        label1.setText(this.serie.getGenres());
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

        showEpisodes();

        vBox0.setPadding(new Insets(10.0, 10.0, 20.0, 10.0));
        vBox0.setOpaqueInsets(new Insets(0.0));
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

        return border;
    }
    
    public void addSesonsButtons() {
        this.menuItems = new ArrayList();
        menuButton.setMnemonicParsing(false);
        menuButton.setStyle("-fx-background-color: #009EE3;");
        menuButton.setText("Seasons");

        for (Season s : this.serie.getSeasons()) {
            menuItem = new MenuItem();
            menuItem.setMnemonicParsing(false);
            menuItem.setText("Season " + (this.serie.getSeasons().indexOf(s) + 1));
            menuItem.setOnAction(this::seasonClick);
            menuItems.add(menuItem);
        }

        VBox.setMargin(menuButton, new Insets(0.0));
        menuButton.getItems().clear();
        for (MenuItem m : menuItems) {
            menuButton.getItems().add(m);
        }
        vBox0.getChildren().add(menuButton);
    }

    public void showEpisodes() {
        addSesonsButtons();
        int episodeNr = 0;
        for (Episode e:this.selectedSeason.getEpisodes()) {
            episodeNr++;
            vBox1 = new VBox();
            vBox1.setPrefWidth(200.0);
            vBox1.setSpacing(5.0);

            label2 = new Label();
            label2.setText(episodeNr + ". " + (e.getTitle().replaceAll("&amp;", "&")));
            label2.setTextFill(javafx.scene.paint.Color.WHITE);

            label3 = new Label();
            label3.setText(e.getPlot());
            label3.setTextFill(javafx.scene.paint.Color.valueOf("#888888"));
            label3.setWrapText(true);

            hBox2 = new HBox();
            hBox2.setPrefHeight(0.0);
            hBox2.setPrefWidth(520.0);
            hBox2.setSpacing(10.0);

            label4 = new Label();
            label4.setText(e.getRuntime());
            label4.setTextFill(javafx.scene.paint.Color.valueOf("#666666"));

            separator0 = new Separator();
            separator0.setOrientation(javafx.geometry.Orientation.VERTICAL);
            separator0.setPrefHeight(200.0);
            separator0.setStyle("-fx-background-color: black;");

            label5 = new Label();
            label5.setLayoutX(10.0);
            label5.setLayoutY(10.0);
            label5.setText(e.getRatings() + "/10");
            label5.setTextFill(javafx.scene.paint.Color.valueOf("#666666"));

            hBox2.getChildren().add(label4);
            hBox2.getChildren().add(separator0);
            hBox2.getChildren().add(label5);

            vBox1.getChildren().add(label2);
            vBox1.getChildren().add(label3);
            vBox1.getChildren().add(hBox2);
            vBox0.getChildren().add(vBox1);
        }
        scrollPane0.setContent(vBox0);
    }

    public void seasonClick(ActionEvent action) {
        MenuItem clickedSeason = (MenuItem) action.getSource();
        int newSeason = Integer.parseInt(clickedSeason.getText().replaceAll("Season ", ""));
        this.selectedSeason = this.serie.getSeasons().get(newSeason - 1);
        vBox0.getChildren().clear();
        showEpisodes();
    }
}
