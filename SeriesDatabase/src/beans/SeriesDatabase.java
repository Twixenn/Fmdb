/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import utilites.ConnectionFactory;
import com.mysql.jdbc.Connection;
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
        System.out.println("test");
        try {
            Connection connection = ConnectionFactory.getConnection();
            
            Statement stmt = connection.createStatement();
            
            String sql = "INSERT INTO `Serie` "
                    + "(`title`, `releaseYear`, `ratings`, `plot`, `coverImage`, `genre`) "
                    + "VALUES ('Band of Brothers', '2001', '9.5', 'The story of Easy Company of the U.S. Army 101st Airborne Division, and their mission in World War II Europe, from Operation Overlord, through V-J Day.', 'https://images-na.ssl-images-amazon.com/images/M/MV5BMTI3ODc2ODc0M15BMl5BanBnXkFtZTYwMjgzNjc3._V1_UX182_CR0,0,182,268_AL_.jpg', 'Action Drama History War')";
            //ResultSet data = stmt.executeQuery(sql);
            stmt.executeUpdate(sql);
            
            /*while(data.next()){
                series.add(new Serie(data));
            }*/
            
            connection.close();
            
            for(Serie s:series) {
                System.out.println(s.toString());
            }
        } catch (Exception e) {
            System.out.println("ERROR");
            System.out.println(e.getMessage());
        }
    }
    
}
