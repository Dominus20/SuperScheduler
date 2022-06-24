package tests;

import manager.Configuration;
import org.testng.annotations.Test;
import screens.LoginScreen;
import screens.SplashScreen;

public class RegistrationTests extends Configuration {

    @Test
    public void registrationSuccess(){

        int i = (int) System.currentTimeMillis()/1000%3600;

        new SplashScreen(driver)//10
                .checkVersion("0.0.3")//7
                .fillEmail("taiki" + i + "@gmail.com")//wait
                .fillPassword("Tt12345$")
                .clickLoginButtonForReg()
                .skipWizard()
                .openMenu()
                .logout()
        ;
    }
    @Test
    public void registrationSuccessSecond(){

        int i = (int) System.currentTimeMillis()/1000%3600;
//        new SplashScreen(driver)//10
//                .checkVersion("0.0.3")//7
        new LoginScreen(driver)
                .fillEmail("taiki" + i + "@gmail.com")//wait
                .fillPassword("Tt12345$")
                .clickLoginButtonForReg()
                .skipWizard()
        ;

    }
}
