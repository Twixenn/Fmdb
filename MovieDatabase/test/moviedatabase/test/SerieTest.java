/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviedatabase.test;

import java.sql.ResultSet;
import java.util.List;
import moviedatabase.beans.Season;
import moviedatabase.beans.Serie;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fia
 */
public class SerieTest {
    
    public SerieTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addSeasons method, of class Serie.
     */
    @Test
    public void testAddSeasons_String_double() throws Exception {
        System.out.println("addSeasons");
        String url = "";
        double seasonId = 0.0;
        Serie instance = null;
        instance.addSeasons(url, seasonId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addSeasons method, of class Serie.
     */
    @Test
    public void testAddSeasons_ResultSet() {
        System.out.println("addSeasons");
        ResultSet data = null;
        Serie instance = null;
        instance.addSeasons(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isTvSeries method, of class Serie.
     */
    @Test
    public void testIsTvSeries() throws Exception {
        System.out.println("isTvSeries");
        String s = "TV Series (2017– )";
        Serie instance = new Serie();
        instance.isTvSeries(s);
        assertEquals(instance.isTvSeries(s), true);
    }

    /**
     * Test of setGenres method, of class Serie.
     */
    @Test
    public void testSetGenres() {
        System.out.println("setGenres");
        String genres = "Horror\\nDrama\\nComedy";
        Serie instance = new Serie();
        instance.setGenres(genres);
        System.out.println(instance.getAllGenres().size());
        assertEquals(instance.getAllGenres().size(), 3);
    }

    /**
     * Test of setTitle method, of class Serie.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Serie instance = null;
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReleaseYear method, of class Serie.
     */
    @Test
    public void testSetReleaseYear() {
        System.out.println("setReleaseYear");
        String releaseYear = "";
        Serie instance = null;
        instance.setReleaseYear(releaseYear);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRating method, of class Serie.
     */
    @Test
    public void testSetRating() {
        System.out.println("setRating");
        String rating = "";
        Serie instance = null;
        instance.setRating(rating);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlot method, of class Serie.
     */
    @Test
    public void testSetPlot() {
        System.out.println("setPlot");
        String plot = "";
        Serie instance = null;
        instance.setPlot(plot);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCoverImage method, of class Serie.
     */
    @Test
    public void testSetCoverImage() {
        System.out.println("setCoverImage");
        String coverImage = "";
        Serie instance = null;
        instance.setCoverImage(coverImage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSeasons method, of class Serie.
     */
    @Test
    public void testSetSeasons() {
        System.out.println("setSeasons");
        ResultSet data = null;
        Serie instance = null;
        instance.setSeasons(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class Serie.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Serie instance = null;
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSeasons method, of class Serie.
     */
    @Test
    public void testGetSeasons() {
        System.out.println("getSeasons");
        Serie instance = null;
        List<Season> expResult = null;
        List<Season> result = instance.getSeasons();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImage method, of class Serie.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        Serie instance = null;
        String expResult = "";
        String result = instance.getImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSeriesId method, of class Serie.
     */
    @Test
    public void testGetSeriesId() {
        System.out.println("getSeriesId");
        Serie instance = null;
        double expResult = 0.0;
        double result = instance.getSeriesId();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReleaseYear method, of class Serie.
     */
    @Test
    public void testGetReleaseYear() {
        System.out.println("getReleaseYear");
        Serie instance = null;
        String expResult = "";
        String result = instance.getReleaseYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlot method, of class Serie.
     */
    @Test
    public void testGetPlot() {
        System.out.println("getPlot");
        Serie instance = null;
        String expResult = "";
        String result = instance.getPlot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRatings method, of class Serie.
     */
    @Test
    public void testGetRatings() {
        System.out.println("getRatings");
        Serie instance = null;
        Double expResult = null;
        Double result = instance.getRatings();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGenres method, of class Serie.
     */
    @Test
    public void testGetGenres() {
        System.out.println("getGenres");
        Serie instance = null;
        String expResult = "";
        String result = instance.getGenres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllGenres method, of class Serie.
     */
    @Test
    public void testGetAllGenres_0args() {
        System.out.println("getAllGenres");
        Serie instance = null;
        List<String> expResult = null;
        List<String> result = instance.getAllGenres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllGenres method, of class Serie.
     */
    @Test
    public void testGetAllGenres_List() {
        System.out.println("getAllGenres");
        List<String> summaryGenres = null;
        Serie instance = null;
        List<String> expResult = null;
        List<String> result = instance.getAllGenres(summaryGenres);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Serie.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Serie instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
