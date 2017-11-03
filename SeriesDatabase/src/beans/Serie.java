/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/**
 *
 * @author Fia
 */
public class Serie {
    private static double id = 0;
    private double seriesId;
    private String title;
    private String releaseYear;
    private List<Season> seasons = new ArrayList<>();
    private double rating;
    private String plot;
    private String coverImage;
    private List<String> genres = new ArrayList<>();
    
    
    public Serie(ResultSet data) {
        try {
            this.title = data.getString("title");
            this.releaseYear = (data.getString("releaseYear"));
            this.rating = (data.getDouble("ratings"));
            this.plot = (data.getString("plot"));
            this.coverImage = (data.getString("coverImage"));
            String string = (data.getString("genre"));
            String[] parts = string.split(",");
            for(int i = 0; i < parts.length; i++) {
                this.genres.add(parts[i]);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Serie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Serie(String url, double maxId, double seasonId) throws IOException {
        id = maxId;
        id++;
        this.seriesId = id; 
        addSerie(url, seasonId);
    }
    
    public void addSerie(String url, double seasonId) throws IOException {
        String[] urls = url.split("(?:http:\\/\\/www.imdb.com\\/title\\/|www.imdb.com\\/title\\/)");
        urls = urls[1].split("/");
        url = "http://www.imdb.com/title/" + urls[0];
            
        Document doc2 = Jsoup.connect(url).get();
        Elements page = doc2.select("div#content-2-wide");
        this.title = page.select("div.title_wrapper h1").html();
        this.title = this.title.replaceAll("&nbsp;", "").replaceAll("'", "");
        String releaseYear = page.select("div.subtext a").html();

        //Använder regex för att endast få ut årtalet
        String isSeries = releaseYear.replaceAll("(?![TV]).*", "").replaceAll("\\n", "");
        isTvSeries(isSeries);
        this.releaseYear = releaseYear.replaceAll("(?![0-9]).", "").replaceAll("\\n", "").substring(0, 4);
        this.coverImage = page.select("div.poster img").attr("src");

        this.rating = Double.parseDouble(page.select("div.ratingValue strong span").html());
        this.plot = page.select("div.summary_text").html().replaceAll("'", "");
        setGenres(page.select("div.titlebar span.itemprop").html());
        
        addSeasons(url, seasonId);
    }
    
    public void addSeasons(String url, double seasonId) throws IOException {
        String episodeguideUrl = url + "/episodes";
        Document doc3 = Jsoup.connect(episodeguideUrl).get();
        Elements page2 = doc3.select("div#main");
        String[] seasonsOp = page2.select("select#bySeason option").html().split("\\n");

        for (String s:seasonsOp) {
            this.seasons.add(new Season(episodeguideUrl, s, seriesId, seasonId));
            seasonId++;
        }
    }
    
    public static boolean isTvSeries(String s) {
        if (!"".equals(s.replaceAll("(?![TV]).", ""))) {
            return true;
        } else {
            return false;
        }
    }
    
    public void setGenres(String genres) {
        String[] parts = genres.split("\\n");
        for(int i = 0; i < parts.length; i++) {
            this.genres.add(parts[i]);
        }
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public List<Season> getSeasons() {
        return this.seasons;
    }
    
    public String getImage() {
        return this.coverImage;
    }
    
    public String getGenres() {
        String genresString = "";
        for(String g:genres) {
            genresString += g + " ";
        }
        return genresString;
    }
    
    @Override
    public String toString() {
        String output = "(" + this.seriesId + ", '" + this.title + "', '" + this.releaseYear + "', '"
                    + this.rating + "', '" + this.plot + "', '"
                    + this.coverImage + "', '" + getGenres() + "')";
        return output;
    }
}
