package pages;

import config.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "username")
    private WebElement usernameField;
    @FindBy(id = "password")
    private WebElement passwordField;
    @FindBy(className = "radius")
    private WebElement loginButton;
    @FindBy(id = "flash")
    private WebElement message;


    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

//    public WebDriver getDriver() {
//        return driver;
//    }

    public WebElement getUsernameField(){
        return this.usernameField;
    }

    public WebElement getPasswordField(){
        return this.passwordField;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getMessage() {
        return message;
    }


}
