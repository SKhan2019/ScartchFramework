package ScartchFramework;

import com.sun.istack.internal.logging.Logger;

public class CustomerPage {

    Logger logger = Logger.getLogger(CustomerPage.class);
    public void addCustomerWithDefaultDetails(){
            logger.info("I am adding the consumer...");
    }

    public boolean isCustomerCreated() {
        logger.info("Getting is consumer created...");
            return true;
    }
}
