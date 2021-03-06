package tests;
import manager.Configuration;
import manager.MyDataProvider;
import models.User;
import org.testng.annotations.Test;

import screens.LoginScreen;

public class LoginTests extends Configuration {

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
        User user = User.builder().email("noa@gmail.com").passwod("Nnoa12345$").build();
        logger.info("Test start with user---> " + user.toString());

        new LoginScreen(driver)
                .complexLogin(user)
                .isPlusButtonPresentAssert()
                .openMenu()
                .logout();

    }
    @Test(dataProvider = "loginData", dataProviderClass = MyDataProvider.class)
    public void loginSuccessDP(User user){

        logger.info("Test start with user---> " + user.toString());

        new LoginScreen(driver)
                .complexLogin(user)
                .isPlusButtonPresentAssert()
                .openMenu()
                .logout();

    }
    @Test(dataProvider = "loginDataCSV", dataProviderClass = MyDataProvider.class)
    public void loginSuccessCSV(User user){

        logger.info("Test start with user---> " + user.toString());

        new LoginScreen(driver)
                .complexLogin(user)
                .isPlusButtonPresentAssert()
                .openMenu()
                .logout();

    }



}
