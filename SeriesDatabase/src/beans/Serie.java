/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fia
 */
public class Serie {
    private String title;
    private int releaseYear;
    private int seasons;
    private double ratings;
    private String plot;
    private String coverImage;
    private List<String> creators = new ArrayList<>();
    private List<String> genres = new ArrayList<>();
    
    public Serie(ResultSet data) {
        try {
            this.title = data.getString("title");
            this.releaseYear = (data.getInt("releaseYear"));
            this.ratings = (data.getDouble("ratings"));
            this.plot = (data.getString("plot"));
            this.coverImage = (data.getString("coverImage"));
            String string = (data.getString("genre"));
            String[] parts = string.split(",");
            for(int i = 0; i < parts.length; i++) {
                this.genres.add(parts[i]);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Serie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }
    
    public void setGenres(String genres) {
        String[] parts = genres.split(",");
        for(int i = 0; i < parts.length; i++) {
            this.genres.add(parts[i]);
        }
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRatings() {
        return ratings;
    }

    public String getPlot() {
        return plot;
    }

    public String getCoverImage() {
        return coverImage;
    }
    
    public List<String> getGenres() {
        return genres;
    }
    
    public int numberOfSeasons() {
        return seasons;
    }
    
    @Override
    public String toString() {
        String output ="Title: " + getTitle() + 
                " Release year: " + getReleaseYear() + 
                " Ratings: " + getRatings() + 
                " Plot: " + getPlot() +
                " Genres: " + getGenres();
        return output;
    }
}
