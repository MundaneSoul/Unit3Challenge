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
public class CheckoutBoothStrategyTest {
    
    public CheckoutBoothStrategyTest() {
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
     * Test of checkoutFunction method, of class CheckoutBoothStrategy.
     */
    @Test
    public void testCheckoutFunction() {
        System.out.println("checkoutFunction");
        List<ParkingSpot> spots = null;
        CheckoutBoothStrategy instance = new CheckoutBoothStrategyImpl();
        instance.checkoutFunction(spots);
        // TODO 
    }

    /**
     * Test of getTotalCheckIn method, of class CheckoutBoothStrategy.
     */
    @Test
    public void testGetTotalCheckIn() {
        System.out.println("getTotalCheckIn");
        CheckoutBoothStrategy instance = new CheckoutBoothStrategyImpl();
        int expResult = 0;
        int result = instance.getTotalCheckIn();
        assertEquals(expResult, result);
        // TODO 
    }

    /**
     * Test of getTotalOfTickets method, of class CheckoutBoothStrategy.
     */
    @Test
    public void testGetTotalOfTickets() {
        System.out.println("getTotalOfTickets");
        CheckoutBoothStrategy instance = new CheckoutBoothStrategyImpl();
        double expResult = 0.0;
        double result = instance.getTotalOfTickets();
        assertEquals(expResult, result, 0.0);
        // TODO 
    }

    public class CheckoutBoothStrategyImpl implements CheckoutBoothStrategy {

        public void checkoutFunction(List<ParkingSpot> spots) {
        }

        public int getTotalCheckIn() {
            return 0;
        }

        public double getTotalOfTickets() {
            return 0.0;
        }
    }
    
}
