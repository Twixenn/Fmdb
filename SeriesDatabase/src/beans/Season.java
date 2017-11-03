/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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

    public Season(String url, String s, double series, double maxId) throws IOException {
        id = maxId;
        id++;
        this.seasonId = id;
        this.seriesId = series;
        addEpisodes(url, s);
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
    
    @Override
    public String toString() {
        String output = "(" + this.seasonId + ", " + this.seriesId + ")";
        return output;
    }
}
