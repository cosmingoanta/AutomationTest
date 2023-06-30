package stepDefinitions;

import config.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.LoginPage;


public class LoginStepDefinitions {
    private LoginPage loginPage = new LoginPage(TestBase.getDriver());

    @Given("the user opens the Login page")
    public void theUserOpensTheApplication(){
        TestBase.getDriver().navigate().to("https://the-internet.herokuapp.com/login");
    }

    @When("the user enters a username {string}")
    public void enterUsername(String username) {
        loginPage.getUsernameField().sendKeys(username);
    }

    @And("the user enters a valid password {string}")
    public void enterValidPassword(String password) {
        loginPage.getPasswordField().sendKeys(password);
    }

    @And("the user clicks on the Login button")
    public void clickOnTheLoginButton() {
        loginPage.getLoginButton().click();
    }

    @Then("the user is successfully logged in")
    public void userIsLoggedIn() {
        Assertions.assertEquals("You logged into a secure area!\n" + "×", loginPage.getMessage().getText());
    }
}
