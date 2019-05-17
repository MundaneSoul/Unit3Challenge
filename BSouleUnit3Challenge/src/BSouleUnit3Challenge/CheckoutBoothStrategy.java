
package BSouleUnit3Challenge;

import java.util.List;

/**
 *
 * @author bsoule
 */
//Satisfies strategy pattern
public interface CheckoutBoothStrategy {
    
    /**
     *  create list of parking spots named spots
     * @param spots
     */
    public void checkoutFunction(List<ParkingSpot> spots);
    
    /**
     * get cumulative number of tickets
     * @return
     */
    public int getTotalCheckIn();
    
    /**
     * get cumulative amount earned
     * @return
     */
    public double getTotalOfTickets();
    
    
}
