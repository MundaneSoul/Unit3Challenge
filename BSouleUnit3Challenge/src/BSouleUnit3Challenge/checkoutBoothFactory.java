
package BSouleUnit3Challenge;

/**
 * create checkout booth factory
 * @author bsoule
 */
public interface checkoutBoothFactory {

    /**
     * get booth strategy (String type)
     * @param strategyType
     * @return
     */
    CheckoutBoothStrategy getCheckoutBoothStrategy(String strategyType);
}
