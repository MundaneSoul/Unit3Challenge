/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BSouleUnit3Challenge;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author soule
 */
public class checkoutTicketTest {
    
    public checkoutTicketTest() {
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
     * Test of getTotalCheckIn method, of class checkoutTicket.
     */
    @Test
    public void testGetTotalCheckIn() {
        System.out.println("getTotalCheckIn");
        checkoutTicket instance = new checkoutTicket();
        int expResult = 0;
        int result = instance.getTotalCheckIn();
        assertEquals(expResult, result);
        // TODO 
    }

    /**
     * Test of getTotalOfTickets method, of class checkoutTicket.
     */
    @Test
    public void testGetTotalOfTickets() {
        System.out.println("getTotalOfTickets");
        checkoutTicket instance = new checkoutTicket();
        double expResult = 0.0;
        double result = instance.getTotalOfTickets();
        assertEquals(expResult, result, 0.0);
        // TODO 
    }
    
}
