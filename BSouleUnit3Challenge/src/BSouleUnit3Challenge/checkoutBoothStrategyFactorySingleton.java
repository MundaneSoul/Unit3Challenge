/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BSouleUnit3Challenge;

/**
 *
 * @author bsoule
 */
public enum checkoutBoothStrategyFactorySingleton implements checkoutBoothFactory{

    /**
     *
     */
    INSTANCE;
    
    private checkoutBoothStrategyFactorySingleton(){
    try{
        Thread.currentThread().sleep(500);
    }catch (InterruptedException ex){
        }
    }

    /**
     * get Checkout booth strategy of the three types: ticket, no ticket, special event
     * @param strategyType
     * @return
     */
    @Override
    public CheckoutBoothStrategy getCheckoutBoothStrategy(String strategyType) {
        switch (strategyType){
            case "hasticket":
            return new checkoutTicket();        

            case "lostticket":
            return new checkoutNoTicket();
            
            case "specialevent":
            return new checkoutSpecialEvent();
            
            default: 
                return null;
            }
    }
}
    