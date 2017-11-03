/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import utilites.ConnectionFactory;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fia
 */
public class SeriesDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Serie> series = new ArrayList<>();
        // TODO code application logic here

        try {
            Connection connection = ConnectionFactory.getConnection();

            Statement stmt = connection.createStatement();
            Serie serie = new Serie("http://www.imdb.com/title/tt4047038/");
            
            //ADD SERIES
            String sql = "INSERT INTO `Serie`(`id`, `title`, `releaseYear`, `ratings`, `plot`, `coverImage`, `genre`)"
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
            for (Serie s : series) {
                System.out.println(s.toString());
            }
        } catch (Exception e) {
            System.out.println("ERROR");
            System.out.println(e.getMessage());
        }
    }

}
