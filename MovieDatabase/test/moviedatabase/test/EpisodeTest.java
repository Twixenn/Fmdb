/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviedatabase.test;

import moviedatabase.beans.Episode;
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
public class EpisodeTest {
    
    public EpisodeTest() {
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
     * Test of addEpisode method, of class Episode.
     */
    @Test
    public void testAddEpisode() throws Exception {
        System.out.println("addEpisode");
        String url = "";
        Episode instance = null;
        instance.addEpisode(url);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class Episode.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Episode instance = null;
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRatings method, of class Episode.
     */
    @Test
    public void testSetRatings() {
        System.out.println("setRatings");
        String ratings = "";
        Episode instance = null;
        instance.setRatings(ratings);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlot method, of class Episode.
     */
    @Test
    public void testSetPlot() {
        System.out.println("setPlot");
        String plot = "";
        Episode instance = null;
        instance.setPlot(plot);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRuntime method, of class Episode.
     */
    @Test
    public void testSetRuntime() {
        System.out.println("setRuntime");
        String runtime = "";
        Episode instance = null;
        instance.setRuntime(runtime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSeasonId method, of class Episode.
     */
    @Test
    public void testGetSeasonId() {
        System.out.println("getSeasonId");
        Episode instance = null;
        double expResult = 0.0;
        double result = instance.getSeasonId();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class Episode.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Episode instance = null;
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRatings method, of class Episode.
     */
    @Test
    public void testGetRatings() {
        System.out.println("getRatings");
        Episode instance = null;
        Double expResult = null;
        Double result = instance.getRatings();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlot method, of class Episode.
     */
    @Test
    public void testGetPlot() {
        System.out.println("getPlot");
        Episode instance = null;
        String expResult = "";
        String result = instance.getPlot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRuntime method, of class Episode.
     */
    @Test
    public void testGetRuntime() {
        System.out.println("getRuntime");
        Episode instance = null;
        String expResult = "";
        String result = instance.getRuntime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Episode.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Episode instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
