/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviedatabase.test;

import moviedatabase.beans.AddSeriesToDatabase;
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
public class AddSeriesToDatabaseTest {
    
    public AddSeriesToDatabaseTest() {
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
     * Test of addSeries method, of class AddSeriesToDatabase.
     */
    @Test
    public void testAddSeries() {
        System.out.println("addSeries");
        String url = "";
        AddSeriesToDatabase.addSeries(url);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveImage method, of class AddSeriesToDatabase.
     */
    @Test
    public void testSaveImage() throws Exception {
        System.out.println("saveImage");
        String imgUrl = "";
        String movieTitle = "";
        AddSeriesToDatabase.saveImage(imgUrl, movieTitle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
