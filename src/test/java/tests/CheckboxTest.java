package tests;

import config.TestBase;
import config.TestBase2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.CheckboxPage;

public class CheckboxTest extends TestBase2 {

    private CheckboxPage checkboxPage;

  @Test
    public void selectCheckbox1() {
        checkboxPage = new CheckboxPage(TestBase.getDriver());
        TestBase.getDriver().navigate().to("https://the-internet.herokuapp.com/checkboxes");
        checkboxPage.getCheckbox1().click();
        Assertions.assertTrue(checkboxPage.getCheckbox1().isSelected());
    }

    @Test
    public void deselectCheckbox2() throws InterruptedException {
        checkboxPage = new CheckboxPage(TestBase.getDriver());
        TestBase.getDriver().navigate().to("https://the-internet.herokuapp.com/checkboxes");
        checkboxPage.getCheckbox2().click();
        Assertions.assertFalse(checkboxPage.getCheckbox2().isSelected());
        }
}
