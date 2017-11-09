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
public class Season {
    private List<Episode> episodes = new ArrayList<>();
    private static double id = 0;
    private double seriesId;
    private double seasonId;
    
    public Season(ResultSet data) {
        try {
            this.seasonId = data.getDouble("id");
            this.seriesId = data.getDouble("series");
        } catch (SQLException ex) {
            Logger.getLogger(Season.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Season(String url, String s, double series, double maxId) throws IOException {
        id = maxId;
        id++;
        this.seasonId = id;
        this.seriesId = series;
        addEpisodes(url, s);
    }
    
    public void addEpisodes(ResultSet data) {
        this.episodes.add(new Episode(data));
    }
    
    public void addEpisodes(String url, String s) throws IOException {
        Document episodesList = Jsoup.connect(url + "?season=" + s).get();
        Elements episodesHref = episodesList.select("div.info strong a");

        for (Element e : episodesHref) {
            String episodeUrl = e.attr("href");
            this.episodes.add(new Episode(episodeUrl, this.seasonId));
        }
    }
    
    public List<Episode> getEpisodes() {
        return this.episodes;
    }
    
    public double getSeasonId() {
        return this.seasonId;
    }
    
    @Override
    public String toString() {
        String output = "(" + this.seasonId + ", " + this.seriesId + ")";
        return output;
    }
}
