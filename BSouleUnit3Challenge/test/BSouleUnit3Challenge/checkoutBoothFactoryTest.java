/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BSouleUnit3Challenge;

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
public class checkoutBoothFactoryTest {
    
    public checkoutBoothFactoryTest() {
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
     * Test of getCheckoutBoothStrategy method, of class checkoutBoothFactory.
     */
    @Test
    public void testGetCheckoutBoothStrategy() {
        System.out.println("getCheckoutBoothStrategy");
        String strategyType = "";
        checkoutBoothFactory instance = new checkoutBoothFactoryImpl();
        CheckoutBoothStrategy expResult = null;
        CheckoutBoothStrategy result = instance.getCheckoutBoothStrategy(strategyType);
        assertEquals(expResult, result);
        // TODO 
    }

    public class checkoutBoothFactoryImpl implements checkoutBoothFactory {

        public CheckoutBoothStrategy getCheckoutBoothStrategy(String strategyType) {
            return null;
        }
    }
    
}
