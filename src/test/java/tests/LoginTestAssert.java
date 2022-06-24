package tests;

import manager.Configuration;
import org.testng.annotations.Test;
import screens.LoginScreen;

public class LoginTestAssert extends Configuration {

    @Test
    public void loginSuccess(){
        new LoginScreen(driver)
                .fillEmail("taiki@gmail.com")
                .fillPassword("Tt12345$")
                .clickLoginButton()
                .isPlusButtonPresentAssert()
                .openMenu()
                .logout();
    }


    @Test
    public void loginSuccessSecond(){
        new LoginScreen(driver)
                .fillEmail("taiki@gmail.com")
                .fillPassword("Tt12345$")
                .clickLoginButton()
                .isPlusButtonPresentAssert()
                .openMenu()
                .logout();
    }
}
