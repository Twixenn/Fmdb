/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviedatabase.beans;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author Fia
 */
public class Episode {
    private double seasonId;
    private String title = "No title";
    private Double ratings = 0.0;
    private String plot = "No plot";
    private String runtime = "0 min";
    
    public Episode(ResultSet data) {
        try {
            this.seasonId = data.getDouble("season");
            setTitle(data.getString("title"));
            setRatings(data.getString("rating"));
            setPlot(data.getString("plot"));
            setRuntime(data.getString("runtime"));
        } catch (SQLException ex) {
            Logger.getLogger(Episode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Episode(String url, double season) throws IOException {
        this.seasonId = season;
        addEpisode(url);
    }
    
    public void addEpisode(String url) throws IOException {
        Document episodeDoc = Jsoup.connect("http://www.imdb.com" + url).get();
        setTitle(episodeDoc.select("div.title_wrapper h1").html().replaceAll("&nbsp;", "").replaceAll("'", ""));
        setPlot(episodeDoc.select("div.summary_text").html().replaceAll("'", "").replaceAll("<(.*?)>(.*?)<(.*?)>", "Have no added plot").replaceAll("&nbsp;", ""));
        setRatings(episodeDoc.select("div.ratingValue strong span").html());
        setRuntime(episodeDoc.select("div.txt-block time").html());
    }

    public void setTitle(String title) {
        if(!title.isEmpty() && title != null) {
            this.title = title;
        }
    }

    public void setRatings(String ratings) {
        if(!ratings.replaceAll("[a-zA-Z]", "").isEmpty() && ratings != null) {
            this.ratings = Double.parseDouble(ratings.replaceAll("[a-zA-Z]", ""));
        }
    }

    public void setPlot(String plot) {
        if(!plot.isEmpty() && plot != null) {
            this.plot = plot;
        }
    }

    public void setRuntime(String runtime) {
        if(!runtime.isEmpty() && runtime != null) {
            this.runtime = runtime;
        } 
    }
    
    

    public double getSeasonId() {
        return seasonId;
    }

    public String getTitle() {
        return title;
    }

    public Double getRatings() {
        return ratings;
    }

    public String getPlot() {
        return plot;
    }

    public String getRuntime() {
        return runtime;
    }
    
    
    
    @Override
    public String toString() {
        String output = "(" + this.seasonId + ", '" + this.title + "', '" + this.plot + "', '"
                    + this.ratings + "', '" + this.runtime + "')";
        return output;
    }
}
