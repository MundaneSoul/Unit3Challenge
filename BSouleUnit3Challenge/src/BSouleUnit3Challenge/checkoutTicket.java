
package BSouleUnit3Challenge;

import java.text.NumberFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author bsoule
 */
//Normal checkout (with ticket)
    public class checkoutTicket implements CheckoutBoothStrategy{
        
        //CONSTANT declarations
        private final double minimumFee = 5.00;
        private final double hourlyRate = 1.00;
        private final double fullDayPmt = 15.00;

        //Random number generator (for time parked)
        Random rand = new Random();

        //Time Variable Declaration
        private Duration timeParkedDuration;
        private long timeParked;

        //Format output for amount paid (currency format)
        NumberFormat n = NumberFormat.getCurrencyInstance();

        //Declare & initialize ticket variables
        private double totalTicket = 0.00;

        private int totalCheckInTicket = 0;
        
    /**
     * Creates array list of type ParkingSpot called spots
     * @param spots
     */
    @Override
    public void checkoutFunction(List<ParkingSpot> spots) {
        
        //Variable declaration for ticket checkout, random time assigned
        int nightTime = rand.nextInt(11);
        nightTime = nightTime + 12;
        LocalTime timeLeft = LocalTime.of(nightTime, 0);
        double ammountDue = 0;
        
        //Display receipt for vehicle ID, Time parked
        System.out.println("\nReceipt for vehicle " + spots.get(0).getCar().getId() + "\n");
        timeParkedDuration = Duration.between(spots.get(0).getTime(), timeLeft);
        timeParked = (timeParkedDuration.getSeconds()/60)/60;
        if(spots.get(0).getTime().toString().equals("12:00")){
            System.out.println(timeParked + "hours parked. You parked from " + spots.get(0).getTime() + "Pm - " + (timeLeft.minusHours(12)) + "Pm");
        }
        else{
            System.out.println(timeParked + " hours parked.\nYou parked from " + spots.get(0).getTime() + "Am - " + (timeLeft.minusHours(12)) + "Pm");
        }
        //Remove car from parking spot
        spots.remove(0);
        ammountDue += minimumFee;
        if(timeParked > 3){
            //calculate the time parked if over 3 hours
            for(int i = 0; i < timeParked - 3; i++){
                if(ammountDue < fullDayPmt){
                    ammountDue += hourlyRate;
                }
            }
        }
        totalTicket += ammountDue;
        System.out.println("You paid: " + n.format(ammountDue) + "\n");
        totalCheckInTicket++;    
    }

    /**
     * get number of checkin tickets
     * @return
     */
    @Override
    public int getTotalCheckIn() {
        return totalCheckInTicket;   
    }

    /**
     * get amount from tickets
     * @return
     */
    @Override
    public double getTotalOfTickets() {
        return totalTicket;  
    }

    }
