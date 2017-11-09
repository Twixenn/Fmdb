/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviedatabase.beans;

import moviedatabase.utilites.ConnectionFactory;
import com.mysql.jdbc.Connection;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;

/**
 *
 * @author Fia
 */
public class AddSeriesToDatabase {

    public static void addSeries(String url) {
        try {
            Connection connection = ConnectionFactory.getConnection();
            
            //Sätter så att inte id blir samma som någon tidigare
            Statement stmt = connection.createStatement();
            String sql = "SELECT MAX(id) FROM Serie";
            ResultSet res = stmt.executeQuery(sql);
            double seriesMaxId = -1;
            if (res.next()) {
                seriesMaxId = res.getDouble(1);
            }
            
            //Sätter så att inte id blir samma som någon tidigare
            sql = "SELECT MAX(id) FROM Season";
            res = stmt.executeQuery(sql);
            double seasonMaxId = -1;
            if (res.next()) {
                seasonMaxId = res.getDouble(1);
            }
            Serie serie = new Serie(url, seriesMaxId, seasonMaxId);
            
            //ADD SERIES
            sql = "INSERT INTO `Serie`(`id`, `title`, `releaseYear`, `ratings`, `plot`, `coverImage`, `genre`)"
                    + " VALUES "+ serie.toString();
            stmt.executeUpdate(sql);
            
            //ADD SEASONS
            sql = "INSERT INTO `Season` (`id`, `series`)"
                    + " VALUES ";
            for(Season s:serie.getSeasons()) {
                sql += s.toString() +",";
            }
            
            sql = sql.substring(0,sql.length() - 1);
            stmt.executeUpdate(sql);
            
            //ADD EPISODES
            sql = "INSERT INTO `Episode`(`season`, `title`, `plot`, `rating`, `runtime`)"
                    + " VALUES ";
            for(Season s:serie.getSeasons()) {
                for(Episode e:s.getEpisodes()) {
                    sql += e.toString() + ",";
                }
            }
            
            sql = sql.substring(0,sql.length() - 1);
            stmt.executeUpdate(sql);
            
            connection.close();
            saveImage(serie.getImage(), serie.getTitle());
            
        } catch (Exception e) {
            System.out.println("ERROR");
            System.out.println(e.getMessage());
            /*if(e.getMessage() = "HTTP error fetching URL") {
                System.out.println("It´s something wrong with your url, are you sure it´s a TV-series and not a movie? ");
            }*/
        }
    }
    
    public static void saveImage(String imgUrl, String movieTitle) throws MalformedURLException, IOException {
        URL url = new URL(imgUrl);
        BufferedImage img = ImageIO.read(url);
        File file = new File("/Volumes/Godzilla Hårddisksson/TE4/Projekt/Fmdb/MovieDatabase/src/moviedatabase/ui/Bilder/" + movieTitle + ".jpg");
        ImageIO.write(img, "jpg", file);
    }

}
