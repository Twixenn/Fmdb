/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imdbtoplist;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Fia
 */
public class ImdbTopList {
    
    public static void main(String[] args) throws IOException {
        try {
            Document document = Jsoup.connect("http://www.imdb.com/chart/toptv/").get(); 
            Elements trow = document.select("tbody.lister-list tr");
            
            for(int i = 2; i < 4; i++) {
                String seriesUrl = trow.get(i).select("td.titleColumn a").attr("href");
                String[] seriesUrls = seriesUrl.split("/");
                seriesUrl = "http://www.imdb.com/title/" + seriesUrls[2];
                Document doc2 = Jsoup.connect(seriesUrl).get();
                Elements page = doc2.select("div#content-2-wide");
                String title = page.select("div.title_wrapper h1").html();
                title = title.replaceAll("&nbsp;","");
                String releaseYear = page.select("div.subtext a").html();
                
                //Använder regex för att endast få ut årtalet
                releaseYear = releaseYear.replaceAll("(?![TV]).*", "");
                releaseYear = releaseYear.replaceAll("\\n", "");
                System.out.println(releaseYear);
                isTvSeries(releaseYear);
                releaseYear = releaseYear.replaceAll("(?![0-9]).", "");
                String img_src = page.select("div.poster img").attr("src");
                
                String rating = page.select("div.ratingValue strong span").html();
                /*String plot = page.select("div.summary_text").html();
                String genre = page.select("div.titlebar span.itemprop").html();
                String episodeguideUrl = seriesUrl + "/episodes";
                Document doc3 = Jsoup.connect(episodeguideUrl).get();
                Elements page2 = doc3.select("div#main"); 
                String[] seasons = page2.select("select#bySeason option").html().split("\\n");
                for (int j = 0; j < seasons.length; j++) {
                    //Gör urlen så den använder strings från tidigare
                    Document episodesList = Jsoup.connect(episodeguideUrl + "?season=" + seasons[j]).get(); 
                    Elements episodes = episodesList.select("div.info a");
                    ArrayList<String> titles = new ArrayList<>();
                    ArrayList<String> episodesUrl = new ArrayList<>();
                    for (Element episode : episodes) {
                        titles.add(episode.text());
                        episodesUrl.add(episode.attr("href"));
                    }
                    String[] plots = episodesList.select("div.info div.item_description").html().split("\\n");
                    for (int k = 0; k < episodesUrl.size(); k++) {
                        Document episode = Jsoup.connect("http://www.imdb.com" + episodesUrl.get(k)).get();
                        String episodeRating = episode.select("div.ratingValue strong span").html();
                        String runtime = episode.select("div.txt-block time").html();
                    }
                    
                }*/
                //saveImg(img_src, title);
            }
            
        } catch (Exception ex) {
            System.out.println(ex);
        } 
    }
    
    public void addSeason(String url) {
        
    }
    
    //Kollar om användaren matar in en TV-serie
    public static boolean isTvSeries(String s) {
        if(!"".equals(s.replaceAll("(?![TV]).", ""))) {
            return true;
        }
        else {
            return false;
        }
    }
}
