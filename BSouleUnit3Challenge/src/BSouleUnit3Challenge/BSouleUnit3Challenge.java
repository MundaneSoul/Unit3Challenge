package BSouleUnit3Challenge;

//import statements
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Soule
 */

public class BSouleUnit3Challenge {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        boolean testVal = false;
        NumberFormat n = NumberFormat.getCurrencyInstance();
        List<Vehicle> vehicles = new ArrayList();
        List<ParkingSpot> parkingSpots = new ArrayList();
        checkoutBoothStrategyFactorySingleton factory = checkoutBoothStrategyFactorySingleton.INSTANCE;
        CheckInBooth checkIn = new CheckInBooth(vehicles, parkingSpots);
        CheckoutBoothStrategy checkoutWithTicket = factory.getCheckoutBoothStrategy("hasticket");
        CheckoutBoothStrategy checkoutWithoutTicket = factory.getCheckoutBoothStrategy("lostticket");
        CheckoutBoothStrategy checkoutSpecialEvents = factory.getCheckoutBoothStrategy("specialevent");
        
        
        Scanner keyboard = new Scanner(System.in);
        //Do-while loop to allow flow of cars in and out of parking garage (multiple entries)
        do{
            System.out.println("Best Value Parking Garage");
            System.out.println("\n============================\n");
            System.out.println("1. Check In");
            System.out.println("2. Check Out");
            System.out.println("3. Close Garage");
            System.out.println("4. LOST TICKET");
            System.out.println("5. Special Event\n");
            System.out.print("=>");
            
            //Option selection for menu, catch errors & invalid input
            try{
                int userInput = keyboard.nextInt();
                switch(userInput){
                    case 1:  //check car into parking garage 
                        checkIn.newCarCheckIn();
                        for(int i = 0; i < parkingSpots.size(); i++)
                        {
                            System.out.println("This is the parking spot car " + parkingSpots.get(i).getCar().getId());
                        }
                    break;
                    case 2: //existing cars checkout (with a ticket)
                         checkoutWithTicket.checkoutFunction(parkingSpots);
                    break;
                    case 3: //closes parking garage and calls calculations for amt paid
                        System.out.println("\n");
                        if(checkoutWithTicket.getTotalCheckIn()> 0){
                            System.out.println("From " + checkoutWithTicket.getTotalCheckIn() + " Check-Ins, a total of " + n.format(checkoutWithTicket.getTotalOfTickets()) + " was acquired.\n");
                        }
                        if(checkoutWithoutTicket.getTotalCheckIn() > 0){
                            System.out.println("From " + checkoutWithoutTicket.getTotalCheckIn() + " Lost Tickets, a total of " + n.format(checkoutWithoutTicket.getTotalOfTickets()) + " was acquired.\n");
                        }
                        if(checkoutSpecialEvents.getTotalCheckIn() >0){
                            System.out.println("From " + checkoutSpecialEvents.getTotalCheckIn() + " Special Events, a total of " + n.format(checkoutSpecialEvents.getTotalOfTickets()) + " was acquired.\n");
                        }
                        System.out.println("Overall, a total of " + n.format(checkoutWithTicket.getTotalOfTickets() + checkoutWithoutTicket.getTotalOfTickets() + checkoutSpecialEvents.getTotalOfTickets()) + " was earned today.\n");
                        testVal = true;
                        //Closes garage - exit loop on testvalue
                    break; 
                    case 4: //lost ticket fee generation & remove car from garage
                        checkoutWithoutTicket.checkoutFunction(parkingSpots);
                    break;
                    case 5: //special event checkout
                        checkoutSpecialEvents.checkoutFunction(parkingSpots);
                    break;    
                    default: //catch invalid menu entry
                        System.out.println("\n==============================\n");
                        System.out.println("Please Enter Menu Option 1-5");
                        System.out.println("\n==============================\n");
                    break;
                }
            }catch(NumberFormatException  e){
                //invalid menu entry - non-number
                System.out.println("\n==============================\n");
                System.out.println("Please Enter Menu Option 1-5");
                System.out.println("\n==============================\n");
            }
            catch(IndexOutOfBoundsException e){
                //checkout attempted while no vehicles in garage
                System.out.println("\n==============================\n");
                System.out.println("No Cars In The Garage.");
                System.out.println("\n==============================\n");
            }
            catch(Exception e){
                //catches all other possible errors
                System.out.println("\n==============================\n");
                System.out.println("Please Enter Menu Option 1-5");
                System.out.println("\n==============================\n");
            }
        }while(testVal == false);
    }
    
}
