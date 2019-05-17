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
public class checkoutNoTicket implements CheckoutBoothStrategy {
     //No ticket checkout (with fee)
     private final double lostTicket = 25.00;
     private double totalNoTicket = 0.00;
     private int totalCheckInNoTicket = 0;

    /**
     * create checkout function to be used in main
     * @param spots
     */
    @Override
    public void checkoutFunction(List<ParkingSpot> spots) {
        System.out.println("\nReceipt for vehicle " + spots.get(0).getCar().getId() + "\n");
        System.out.println("Ticket Lost -- Fee Payment Required");
        System.out.println("You paid: $25.00\n");
        spots.remove(0);
        totalNoTicket += lostTicket;
        totalCheckInNoTicket++;    
    }

    /**
     * no ticket checkout number
     * @return
     */
    @Override
    public int getTotalCheckIn() {
        return totalCheckInNoTicket;   
    }

    /**
     * no ticket checkout value/amount
     * @return
     */
    @Override
    public double getTotalOfTickets() {
        return totalNoTicket;  
    }
}
    