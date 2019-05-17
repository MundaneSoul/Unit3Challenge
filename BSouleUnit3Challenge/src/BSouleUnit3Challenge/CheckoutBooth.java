package BSouleUnit3Challenge;

//import statements
import java.text.NumberFormat;
import java.util.Random;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


/**
 * creates checkout booth
 * @author Soule
 */

public class CheckoutBooth {
    
    //CONSTANT declarations
    private final double minimumFee = 5.00;
    private final double hourlyRate = 1.00;
    private final double fullDayPmt = 15.00;
    private final double lostTicket = 25.00;
    
    //New Array List
    private List<ParkingSpot> parkingSpots = new ArrayList();
    
    //Random number generator (for time parked)
    Random rand = new Random();

    //Time Variable Declaration
    private Duration timeParkedDuration;
    private long timeParked;
    
    //Format output for amount paid (currency format)
    NumberFormat n = NumberFormat.getCurrencyInstance();
    
    //Declare & initialize ticket variables
    private double totalTicket = 0.00;
    private double totalNoTicket = 0.00;
    private int totalCheckInTicket = 0;
    private int totalCheckInNoTicket = 0;
    
    //Start checkout booth method

    /**
     *
     * @param parkingSpots
     */
    public CheckoutBooth(List<ParkingSpot> parkingSpots){
        this.parkingSpots = parkingSpots;
    }
    
    //Normal checkout (with ticket)

    /**
     * create checkout ticket
     */
    public void checkoutTicket(){
        //Variable declaration for ticket checkout, random time assigned
        int nightTime = rand.nextInt(11);
        nightTime = nightTime + 12;
        LocalTime timeLeft = LocalTime.of(nightTime, 0);
        double ammountDue = 0;
        //Display receipt for vehicle ID, Time parked
        System.out.println("\nReceipt for vehicle " + parkingSpots.get(0).getCar().getId() + "\n");
        timeParkedDuration = Duration.between(parkingSpots.get(0).getTime(), timeLeft);
        timeParked = (timeParkedDuration.getSeconds()/60)/60;
        if(parkingSpots.get(0).getTime().toString().equals("12:00")){
            System.out.println(timeParked + "hours parked. You parked from " + parkingSpots.get(0).getTime() + "Pm - " + (timeLeft.minusHours(12)) + "Pm");
        }
        else{
            System.out.println(timeParked + " hours parked.\nYou parked from " + parkingSpots.get(0).getTime() + "Am - " + (timeLeft.minusHours(12)) + "Pm");
        }
        //Remove car from parking spot
        parkingSpots.remove(0);
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
    
    //No ticket checkout (with fee)

    /**
     * creates checkout no ticket
     */
    public void checkoutNoTicket(){
        System.out.println("\nReceipt for vehicle " + parkingSpots.get(0).getCar().getId() + "\n");
        System.out.println("Ticket Lost -- Fee Payment Required");
        System.out.println("You paid: $25.00\n");
        parkingSpots.remove(0);
        totalNoTicket += lostTicket;
        totalCheckInNoTicket++;
    }
    
    //Calculations

    /**
     *
     * @return
     */
    public double getTotalTicket(){
        return totalTicket;
    }

    /**
     *
     * @return
     */
    public double getTotalNoTicket(){
        return totalNoTicket;
    }

    /**
     *
     * @return
     */
    public int getTotalCheckInTicket(){
        return totalCheckInTicket;
    }

    /**
     *
     * @return
     */
    public int getTotalCheckInNoTicket(){
        return totalCheckInNoTicket;
    }
}
