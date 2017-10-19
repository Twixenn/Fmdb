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
            
            String sql = "SELECT * FROM serie";
            ResultSet data = stmt.executeQuery(sql);
            
            while(data.next()){
                series.add(new Serie(data));
            }
            
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
