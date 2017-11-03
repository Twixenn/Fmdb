/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import utilites.ConnectionFactory;
import com.mysql.jdbc.Connection;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;

/**
 *
 * @author Fia
 */
public class AddSeriesToDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Serie> series = new ArrayList<>();
        // TODO code application logic here

        try {
            Connection connection = ConnectionFactory.getConnection();

            Statement stmt = connection.createStatement();
            String sql = "SELECT MAX(id) FROM Serie";
            ResultSet res = stmt.executeQuery(sql);
            double seriesMaxId = -1;
            if (res.next()) {
                seriesMaxId = res.getDouble(1);
            }
          
            sql = "SELECT MAX(id) FROM Season";
            res = stmt.executeQuery(sql);
            double seasonMaxId = -1;
            if (res.next()) {
                seasonMaxId = res.getDouble(1);
            }
            String url = "http://www.imdb.com/title/tt5491994/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=2398042182&pf_rd_r=01ATK98NRN4Y7C22X6H2&pf_rd_s=center-1&pf_rd_t=15506&pf_rd_i=toptv&ref_=chttvtp_tt_1";
            Serie serie = new Serie(url, seriesMaxId, seasonMaxId);
            
            //ADD SERIES
            /*sql = "INSERT INTO `Serie`(`id`, `title`, `releaseYear`, `ratings`, `plot`, `coverImage`, `genre`)"
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

            /*while(data.next()){
                series.add(new Serie(data));
            }*/
            
            connection.close();
            saveImage(serie.getImage(), serie.getTitle());
            
        } catch (Exception e) {
            System.out.println("ERROR");
            System.out.println(e.getMessage());
        }
    }
    
    public static void saveImage(String imgUrl, String movieTitle) throws MalformedURLException, IOException {
        URL url = new URL(imgUrl);
        BufferedImage img = ImageIO.read(url);
        File file = new File("/Volumes/Godzilla Hårddisksson/TE4/Projekt/Fmdb/Bilder/" + movieTitle + ".jpg");
        ImageIO.write(img, "jpg", file);
    }

}
