
package BSouleUnit3Challenge;

//import statements
import java.time.LocalTime;


/**
 *
 * @author Soule
 */
public class ParkingSpot {
    private Vehicle car;
    private LocalTime time;
    
    /**
     *
     * @param car
     * @param time
     */
    public ParkingSpot(Vehicle car, LocalTime time){
        this.car = car;
        this.time = time;
    }
    
    /**
     *
     * @return
     */
    public Vehicle getCar(){
        return car;
    }
    
    /**
     *
     * @return
     */
    public LocalTime getTime(){
        return time;
    }
}
