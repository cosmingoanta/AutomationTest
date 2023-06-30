package pages;

import config.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxPage {

    @FindBy(xpath = "//*[@id=\"checkboxes\"]/input[1]")
    private WebElement checkbox1;

    @FindBy(xpath = "//*[@id=\"checkboxes\"]/input[2]")
    private WebElement checkbox2;

    public CheckboxPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

//    public WebDriver getDriver(){
//        return driver;
//    }

    public WebElement getCheckbox1(){
        return checkbox1;
    }

    public WebElement getCheckbox2(){
        return checkbox2;
    }
}
