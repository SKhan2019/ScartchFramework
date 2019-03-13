package ScartchFramework;

public class HomePage {
    public boolean isUserLoggedin(){
        return true;
    }
    public CustomerPage gotoCustomerPage(){
        return new CustomerPage();
    }

}


