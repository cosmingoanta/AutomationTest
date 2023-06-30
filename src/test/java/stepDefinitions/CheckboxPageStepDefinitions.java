package stepDefinitions;

import config.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.CheckboxPage;

public class CheckboxPageStepDefinitions {
    CheckboxPage checkboxPage = new CheckboxPage(TestBase.getDriver());

    @Given("the user opens the checkbox page")
    public void theUserOpensTheApplication() {
        TestBase.getDriver().navigate().to("https://the-internet.herokuapp.com/checkboxes");
    }

    @When("the user clicks on the first checkbox")
    public void theUserClickOnFirstCheckbox() {
        checkboxPage.getCheckbox1().click();
    }

    @Then("the first checkbox is checked")
    public void theFirstCheckboxIsChecked() {
        Assertions.assertTrue(checkboxPage.getCheckbox1().isSelected());
    }

    @When("the user clicks on the second checkbox")
    public void theUserClickOnSecondCheckbox() {
        checkboxPage.getCheckbox2().click();
    }

    @Then("the second checkbox is unchecked")
    public void theSecondCheckboxIsChecked() {
        Assertions.assertFalse(checkboxPage.getCheckbox2().isSelected());
    }

}
