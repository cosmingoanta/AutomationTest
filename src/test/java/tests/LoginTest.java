package tests;

import config.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class LoginTest extends TestBase {
    private LoginPage loginPage;

    @Test
    public void successfulLoginPage(){
        //1. Launch the app
        loginPage = new LoginPage(getDriver());
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        //2. Enter a valid username
        loginPage.getUsernameField().sendKeys("tomsmith");
        //3. Enter a valid password
        loginPage.getPasswordField().sendKeys("SuperSecretPassword!");
        //4. Click the login button
        loginPage.getLoginButton().click();
        //5. Check the returned message
        Assertions.assertEquals("You logged into a secure area!\n" + "  ×", loginPage.getMessage().getText());

    }

    @Test
    public void wrongUsernameLoginAttempt(){
        //1. Launch the app
        loginPage = new LoginPage(getDriver());
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        //2. Enter an invalid username
        loginPage.getUsernameField().sendKeys("cosmingoanta");
        //3. Enter a valid password
        loginPage.getPasswordField().sendKeys("SuperSecretPassword!");
        //4. Cick on the login button
        loginPage.getLoginButton().click();
        //5. Check the returned message
        Assertions.assertEquals("Your username is invalid!\n" + "×", loginPage.getMessage().getText());
    }

    @Test
    public void wrongPasswordLoginAttempt(){
        //1. Launch
        loginPage = new LoginPage(getDriver());
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        //2. Enter a valid username
        loginPage.getUsernameField().sendKeys("tomsmith");
        //3. Enter an invalid password
        loginPage.getPasswordField().sendKeys("randompassword");
        //4. CLick on the login button
        loginPage.getLoginButton().click();
        //5. Check the returned message
        Assertions.assertEquals("Your password is invalid!\n" + "×", loginPage.getMessage().getText());
    }
}
