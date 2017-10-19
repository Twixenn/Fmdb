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
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public static void main(String[] args) {
        try {
            /*Document document = Jsoup.connect("http://www.imdb.com/chart/toptv/").get(); 
            Elements trow = document.select("tbody.lister-list tr");
            
            for(int i = 3; i < 4; i++) {
                String title = trow.get(i).select("td.titleColumn a").html();
                String releaseYear = trow.get(i).select("td.titleColumn span.secondaryInfo").html();
                releaseYear= releaseYear.replace("(", "").replace(")","");
                String img_src = trow.get(i).select("td.posterColumn img").attr("src");
                String rating = trow.get(i).select("td.ratingColumn strong").html();
                String seriesUrl = trow.get(i).select("td.titleColumn a").attr("href");
                String[] seriesUrls = seriesUrl.split("/");
                seriesUrl = "http://www.imdb.com/title/" + seriesUrls[2];
                Document doc2 = Jsoup.connect(seriesUrl).get();
                Elements page = doc2.select("div#content-2-wide");
                String plot = page.select("div.summary_text").html();
                String genre = page.select("div.titlebar span.itemprop").html();
                String episodeguideUrl = seriesUrl + "/episodes";
                Document doc3 = Jsoup.connect(episodeguideUrl).get();*/
                Document doc3 = Jsoup.connect("http://www.imdb.com/title/tt0944947/episodes").get();
                Elements page2 = doc3.select("div#main"); 
                String[] seasons = page2.select("select#bySeason option").html().split("\\r?\\n");
                for (int i = 0; i < seasons.length; i++) {
                    System.out.println(seasons[i]); 
                }
                //saveImg(img_src, title);
            //}
            
        } catch (Exception ex) {
            System.out.println(ex);
        } 
    }
    
    public static void saveImg(String imgurl, String name) throws MalformedURLException, IOException {
        URL url = new URL(imgurl);
        BufferedImage img = ImageIO.read(url);
        File file = new File("C:\\Volumes\\Godzilla Hårddisken\\images\\" + name + ".jpg");
        ImageIO.write(img, "jpg", file);
        
    }
}
