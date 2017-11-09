/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviedatabase.test;

import java.sql.ResultSet;
import java.util.List;
import moviedatabase.beans.Episode;
import moviedatabase.beans.Season;
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
public class SeasonTest {
    
    public SeasonTest() {
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
     * Test of addEpisodes method, of class Season.
     */
    @Test
    public void testAddEpisodes_ResultSet() {
        System.out.println("addEpisodes");
        ResultSet data = null;
        Season instance = null;
        instance.addEpisodes(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEpisodes method, of class Season.
     */
    @Test
    public void testAddEpisodes_String_String() throws Exception {
        System.out.println("addEpisodes");
        String url = "";
        String s = "";
        Season instance = null;
        instance.addEpisodes(url, s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEpisodes method, of class Season.
     */
    @Test
    public void testGetEpisodes() {
        System.out.println("getEpisodes");
        Season instance = null;
        List<Episode> expResult = null;
        List<Episode> result = instance.getEpisodes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSeasonId method, of class Season.
     */
    @Test
    public void testGetSeasonId() {
        System.out.println("getSeasonId");
        Season instance = null;
        double expResult = 0.0;
        double result = instance.getSeasonId();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Season.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Season instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
