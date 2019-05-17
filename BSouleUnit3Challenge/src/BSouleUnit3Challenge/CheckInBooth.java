
package BSouleUnit3Challenge;

//import statements
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Soule
 */
public class CheckInBooth {
                  
    //Variable declaration & value assignment
    private int vicId = 60; //first vehicle Id starts at 60
    private List<Vehicle> vehicles = new ArrayList();
    private List<ParkingSpot> parkingSpots = new ArrayList();
    private Random rand = new Random();
    
    //Set vehicle id & parking spot

    /**
     *
     * @param vehicles
     * @param parkingSpots
     */
    public CheckInBooth(List<Vehicle> vehicles, List<ParkingSpot> parkingSpots){
        this.vehicles = vehicles;
        this.parkingSpots = parkingSpots;
    }
    
    /**
     *
     * @param car
     * @param hour
     * @return
     */
    public static ParkingSpot getSpot(Vehicle car, LocalTime hour){
        ParkingSpot spot = new ParkingSpot(car, hour);
        return spot;
    }
    
    //Checks in new car, gets random time value 

    /**
     *
     */
    public void newCarCheckIn(){
        int hourOfDay = rand.nextInt(6);
        hourOfDay = hourOfDay + 7;
        LocalTime timeEntered = LocalTime.of(hourOfDay, 0);
        Vehicle newCar = new Vehicle(vicId);
        vehicles.add(newCar);
        parkingSpots.add(getSpot(vehicles.get(vehicles.size() - 1), timeEntered));
        System.out.println("\nCheck in successful.");
        System.out.println("Your car's id is: " + parkingSpots.get(parkingSpots.size() - 1).getCar().getId() + "\n");
        vicId++;
    }
    
}
