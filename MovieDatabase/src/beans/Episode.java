/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author Fia
 */
public class Episode {
    private double seasonId;
    private String title;
    private String ratings;
    private String plot;
    private String runtime;

    public Episode(String url, double season) throws IOException {
        this.seasonId = season;
        addEpisode(url);
    }
    
    public void addEpisode(String url) throws IOException {
        Document episodeDoc = Jsoup.connect("http://www.imdb.com" + url).get();
        this.title = episodeDoc.select("div.title_wrapper h1").html().replaceAll("&nbsp;", "").replaceAll("'", "");
        this.plot = episodeDoc.select("div.summary_text").html().replaceAll("'", "");
        this.ratings = episodeDoc.select("div.ratingValue strong span").html();
        this.runtime = episodeDoc.select("div.txt-block time").html();
    }
    
    @Override
    public String toString() {
        String output = "(" + this.seasonId + ", '" + this.title + "', '" + this.plot + "', '"
                    + this.ratings + "', '" + this.runtime + "')";
        return output;
    }
}
