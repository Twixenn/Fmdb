/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviedatabase.beans;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.EmptyStackException;
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
    private String title = "No title";
    private String releaseYear = "";
    private List<Season> seasons = new ArrayList<>();
    private Double rating = 0.0;
    private String plot = "No Plot";
    private String coverImage = "";;
    private List<String> genres = new ArrayList<>();
    
    public Serie() {
        
    }
    
    
    public Serie(ResultSet data) {
        try {
            this.seriesId = data.getDouble("id");
            setTitle(data.getString("title"));
            setReleaseYear(data.getString("releaseYear"));
            setRating(data.getString("ratings"));
            setPlot(data.getString("plot"));
            setCoverImage(data.getString("coverImage"));
            String genres = data.getString("genre");
            String[] parts = genres.split(" ");
                for(int i = 0; i < parts.length; i++) {
                this.genres.add(parts[i]);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Serie.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Sorry, somthing went wrong when trying to get information from your database");
        }
    }
    
    public Serie(String url, double maxId, double seasonId) throws IOException, Exception {
        id = maxId;
        id++;
        this.seriesId = id; 
        addSerie(url, seasonId);
    }
    
    public void addSerie(String url, double seasonId) throws Exception {
        String[] urls = url.split("(?:http:\\/\\/www.imdb.com\\/title\\/|www.imdb.com\\/title\\/)");
        if(urls.length < 2) {
            throwException("It´s something wrong with your url, are you sure it´s a TV-series from IMdB?");
        }
        urls = urls[1].split("/");
        url = "http://www.imdb.com/title/" + urls[0];
        
        Document doc2 = Jsoup.connect(url).get();
        Elements page = doc2.select("div#content-2-wide");
        String releaseYear = page.select("div.subtext a").html();
        String isSeries = releaseYear.replaceAll("(?![TV]).*", "").replaceAll("\\n", "");
        isTvSeries(isSeries);
        this.title = page.select("div.title_wrapper h1").html();
        this.title = this.title.replaceAll("&nbsp;", "").replaceAll("'", "");

        //Använder regex för att endast få ut årtalet
        this.releaseYear = releaseYear.replaceAll("(?![0-9]).", "").replaceAll("\\n", "").substring(0, 4);
        this.coverImage = page.select("div.poster img").attr("src");

        this.rating = Double.parseDouble(page.select("div.ratingValue strong span").html());
        this.plot = page.select("div.summary_text").html().replaceAll("'", "").replaceAll("<(.*?)>(.*?)<(.*?)>", "");
        setGenres(page.select("div.titlebar span.itemprop").html());

        addSeasons(url, seasonId);
    }
    
    public void throwException(String message) throws Exception {
        throw new Exception(message);
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
    
    public void addSeasons(ResultSet data) {
        this.seasons.add(new Season(data));
    }
    
    public boolean isTvSeries(String s) throws Exception {
        if ("".equals(s.replaceAll("(?![TV]).", ""))) {
            throwException("It´s something wrong with your url, are you sure it´s a TV-series from IMdB and not a movie? ");
            return false;
        } else {
            return true;
        }
    }
    
    public void setGenres(String genres) {
        String[] parts = genres.split("\\n");
        for(int i = 0; i < parts.length; i++) {
            this.genres.add(parts[i]);
        }
    }

    public void setTitle(String title) {
        if(!title.isEmpty() && title != null) {
            this.title = title;
        }
    }

    public void setReleaseYear(String releaseYear) {
        if(!releaseYear.replaceAll("[a-zA-Z]", "").isEmpty() && releaseYear != null) {
            this.releaseYear = releaseYear;
        }
    }

    public void setRating(String rating) {
        if(!rating.replaceAll("[a-zA-Z]", "").isEmpty() && rating != null) {
            this.rating = Double.parseDouble(rating.replaceAll("[a-zA-Z]", ""));
        }
    }

    public void setPlot(String plot) {
        if(!plot.isEmpty() && plot != null) {
            this.plot = plot;
        }
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }
    
    
    
    public void setSeasons(ResultSet data) {
        seasons.add(new Season(data));
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
    
    public double getSeriesId() {
        return seriesId;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public String getPlot() {
        return plot;
    }
    
    public Double getRatings() {
        return rating;
    }
    
    public String getGenres() {
        String genresString = "";
        for(String g:this.genres) {
            genresString += g + " ";
        }
        return genresString;
    }
    
    public List<String> getAllGenres() {
        return this.genres;
    }
    
    public List<String> getAllGenres(List<String> summaryGenres) {
        for(String genre:this.genres) {
            if(!summaryGenres.contains(genre)) {
                summaryGenres.add(genre);
            }
        }
        return summaryGenres;
    }
    
    @Override
    public String toString() {
        String output = "(" + this.seriesId + ", '" + this.title + "', '" + this.releaseYear + "', '"
                    + this.rating + "', '" + this.plot + "', '"
                    + this.coverImage + "', '" + getGenres() + "')";
        return output;
    }
}
