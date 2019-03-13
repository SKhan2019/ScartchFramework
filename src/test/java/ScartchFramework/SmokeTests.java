package ScartchFramework;

import org.junit.Assert;
import org.junit.Test;

public class SmokeTests {

    @Test
    public void verifyLogin() {

        LoginPage loginpage = new LoginPage();
        HomePage homePage = loginpage.login("Admin", "Password");

        Assert.assertTrue(homePage.isUserLoggedin());
    }

    @Test
    public void verifyCreateCustomer() {

        LoginPage loginpage = new LoginPage();
        HomePage homePage = loginpage.login("Admin", "Password");
        CustomerPage custmerPage = homePage.gotoCustomerPage();


        custmerPage.addCustomerWithDefaultDetails();
        Assert.assertTrue(custmerPage.isCustomerCreated());
    }
}
