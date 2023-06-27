package tests;

import config.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.AddRemoveElementsPage;

public class AddRemoveElementsTests extends TestBase {

    private AddRemoveElementsPage addRemoveElementsPage;

    @Test
    public void addButtonTest(){
        addRemoveElementsPage = new AddRemoveElementsPage(getDriver());
        driver.navigate().to("https://the-internet.herokuapp.com/add_remove_elements/");
        addRemoveElementsPage.getAddElementButton().click();
        Assertions.assertTrue(addRemoveElementsPage.getDeleteButton1().isEnabled());
    }
}
