package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import pages.AddRemoveElementsPage;

public class AddRemoveElementsPageStepDefinition {

    AddRemoveElementsPage addRemoveElementsPage = new AddRemoveElementsPage();

    @Given("the user opens the Add Remove Elements page")
    public void userOpenAddRemoveElementsPage(){
        addRemoveElementsPage.getDriver().navigate().to("https://the-internet.herokuapp.com/add_remove_elements/");
    }

    @When("the user clicks on the Add Element button")
    public void userClickOnAddElementButton(){
        addRemoveElementsPage.getAddElementButton().click();
    }

    @Then("the first delete button is displayed")
    public void firstDeleteButtonIsDisplayed(){
        Assertions.assertTrue(addRemoveElementsPage.getDeleteButton1().isDisplayed());
    }

    @Then("the first delete button is not displayed")
    public void deleteButtonIsNotDisplayed(){
        Assertions.assertFalse(addRemoveElementsPage.getDeleteButton1().isDisplayed());
    }

    @Then("the second delete button is displayed")
    public void secondDeleteButtonIsDIsplayed(){
        Assertions.assertTrue(addRemoveElementsPage.getDeleteButton2().isDisplayed());
    }

    @Then("the second delete button is not displayed")
    public void secondDeleteButtonIsNotDIsplayed(){
        addRemoveElementsPage.getDriver().findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
    }

    @When("the user clicks on the first delete button")
    public void userClicksOnFirstDeleteButton(){
        addRemoveElementsPage.getDeleteButton1().click();
    }

    @When("the user clicks on the second delete button")
    public void userClicksOnSecondDeleteButton(){
        addRemoveElementsPage.getDeleteButton2().click();
    }
}
