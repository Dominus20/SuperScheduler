package tests;

import manager.Configuration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import screens.HomeScreen;
import screens.LoginScreen;

public class LoginTestAssert extends Configuration {

    @Test
    public void loginSuccess(){
        boolean isPlusPresent = new LoginScreen(driver)
                .fillEmail("taiki@gmail.com")
                .fillPassword("Tt12345$")
                .clickLoginButton()
                .isPlusButtonPresent();

        Assert.assertTrue(isPlusPresent);
    }

    @Test
    public void loginSuccessSecond(){
        boolean isPlusPresent =  new LoginScreen(driver)
                .fillEmail("taiki@gmail.com")
                .fillPassword("Tt12345$")
                .clickLoginButton()
                .isPlusButtonPresent();

        Assert.assertTrue(isPlusPresent);
    }



    @AfterMethod
    public void postCondition(){
        new HomeScreen(driver).openMenu()
                .logout();
    }
}
