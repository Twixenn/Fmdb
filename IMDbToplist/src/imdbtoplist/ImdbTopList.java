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
            /*Document document = Jsoup.connect("http://www.imdb.com/chart/toptv/").get();
            Elements trow = document.select("tbody.lister-list tr");*/
            String url ="http://www.imdb.com/title/tt1475582/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=2398042182&pf_rd_r=0APV8R9VG404F05SX2M8&pf_rd_s=center-1&pf_rd_t=15506&pf_rd_i=toptv&ref_=chttvtp_tt_12";
            String[] urls = url.split("(?:http:\\/\\/www.imdb.com\\/title\\/|www.imdb.com\\/title\\/)");
            urls = urls[1].split("/");
            url = "http://www.imdb.com/title/" + urls[0];
            Document doc2 = Jsoup.connect(url).get();
        Elements page = doc2.select("div#content-2-wide");
        String title = page.select("div.title_wrapper h1").html();
        title = title.replaceAll("&nbsp;", "");
        String releaseYear = page.select("div.subtext a").html();

        //Använder regex för att endast få ut årtalet
        String isSeries = releaseYear.replaceAll("(?![TV]).*", "").replaceAll("\\n", "");
        //isTvSeries(isSeries);
        releaseYear = releaseYear.replaceAll("(?![0-9]).", "").replaceAll("\\n", "").substring(0, 4);
        String coverImage = page.select("div.poster img").attr("src");

        String rating = (page.select("div.ratingValue strong span").html());
        String plot = page.select("div.summary_text").html();
        //setGenres(page.select("div.titlebar span.itemprop").html());
        
        //ADD SEASON
                String episodeguideUrl = url + "/episodes";
                Document doc3 = Jsoup.connect(episodeguideUrl).get();
                Elements page2 = doc3.select("div#main");
                String[] seasons = page2.select("select#bySeason option").html().split("\\n");
                
                //ADD EPISODES
                for (int i = 0; i < seasons.length; i++) {
                    Document episodesList = Jsoup.connect(episodeguideUrl + "?season=" + seasons[i]).get();
                    Elements episodes = episodesList.select("div.info a");
                    
                    for (Element episode : episodes) {
                        String episodesUrl = (episode.attr("href"));
                        Document episodePage = Jsoup.connect("http://www.imdb.com" + episodesUrl).get();
                        String episodeTitle = episodePage.select("div.title_wrapper h1").html().replaceAll("&nbsp;", "");
                        String episodePlot = episodePage.select("div.summary_text").html();
                        String episodeRating = episodePage.select("div.ratingValue strong span").html();
                        String runtime = episodePage.select("div.txt-block time").html();
                        System.out.println(episodeTitle + " " + episodePlot + " " + episodeRating + " " + runtime);
                    }
                    
                //saveImg(img_src, title);
                }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void addSeason(String url) throws IOException {
        String seriesUrl = url;
        Document doc2 = Jsoup.connect(seriesUrl).get();
        Elements page = doc2.select("div#content-2-wide");
        String title = page.select("div.title_wrapper h1").html();
        title = title.replaceAll("&nbsp;", "");
        String releaseYear = page.select("div.subtext a").html();

        //Använder regex för att endast få ut årtalet
        releaseYear = releaseYear.replaceAll("(?![TV]).*", "").replaceAll("\\n", "");
        System.out.println(releaseYear);
        releaseYear = releaseYear.replaceAll("(?![0-9]).", "");
        String img_src = page.select("div.poster img").attr("src");

        String rating = page.select("div.ratingValue strong span").html();
        String plot = page.select("div.summary_text").html();
        String genre = page.select("div.titlebar span.itemprop").html();
    }

    //Kollar om användaren matar in en TV-serie
    public static boolean isTvSeries(String s) {
        if (!"".equals(s.replaceAll("(?![TV]).", ""))) {
            return true;
        } else {
            return false;
        }
    }
}
