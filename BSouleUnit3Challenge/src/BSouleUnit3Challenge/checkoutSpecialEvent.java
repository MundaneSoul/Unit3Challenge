/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BSouleUnit3Challenge;

import java.util.List;

/**
 *
 * @author bsoule
 */
public class checkoutSpecialEvent implements CheckoutBoothStrategy{
         //No ticket checkout (with fee)
     private final double specialEvent = 20.00;
     private double totalSpEvent = 0.00;
     private int totalCheckInSpEvent = 0;

    /**
     * creates checkout function to be used in main
     * @param spots
     */
    @Override
    public void checkoutFunction(List<ParkingSpot> spots) {
        System.out.println("\nReceipt for vehicle " + spots.get(0).getCar().getId() + "\n");
        System.out.println("Ticket Lost -- Fee Payment Required");
        System.out.println("You paid: $20.00\n");
        spots.remove(0);
        totalSpEvent += specialEvent;
        totalCheckInSpEvent++;    
    }

    /**
     * get special event ticket number
     * @return
     */
    @Override
    public int getTotalCheckIn() {
        return totalCheckInSpEvent;   
    }

    /**
     * get special event ticket value/amount
     * @return
     */
    @Override
    public double getTotalOfTickets() {
        return totalSpEvent;  
    }
}
