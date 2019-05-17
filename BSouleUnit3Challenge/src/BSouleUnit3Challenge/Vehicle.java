
package BSouleUnit3Challenge;

/**
 *
 * @author Soule
 */

//Creates instance of vehicle in garage, assigns an ID
class Vehicle {
    private int vicId;
    
    public Vehicle(int id){
        this.vicId = id;
    }
    
    public int getId(){
        return vicId;
    }
}
