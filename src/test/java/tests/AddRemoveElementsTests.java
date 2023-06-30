package tests;

import config.TestBase;
import config.TestBase2;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.AddRemoveElementsPage;

public class AddRemoveElementsTests extends TestBase2 {

    private AddRemoveElementsPage addRemoveElementsPage;

    @Test
    public void addButtonTest(){
        addRemoveElementsPage = new AddRemoveElementsPage(TestBase.getDriver());
        TestBase.getDriver().navigate().to("https://the-internet.herokuapp.com/add_remove_elements/");
        addRemoveElementsPage.getAddElementButton().click();
        Assertions.assertTrue(addRemoveElementsPage.getDeleteButton1().isEnabled());
    }


    @Test
    public void addButtonThenDeleteTest(){
        addRemoveElementsPage = new AddRemoveElementsPage(TestBase.getDriver());
        TestBase.getDriver().navigate().to("https://the-internet.herokuapp.com/add_remove_elements/");
        addRemoveElementsPage.getAddElementButton().click();
        addRemoveElementsPage.getDeleteButton1().click();
       // Assertions.assertTrue(TestBase.getDriver().findElement(By.xpath("//*[@id=\"checkboxes\"]/input")) == null);
    }
}
