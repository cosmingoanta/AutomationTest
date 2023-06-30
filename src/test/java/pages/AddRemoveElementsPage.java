package pages;

import config.TestBase;
import config.TestBase2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class AddRemoveElementsPage {

    public int index = 2;
    ArrayList<WebElement> deleteButtons = new ArrayList<WebElement>();

    @FindBy(xpath = "//*[@id=\"content\"]/div/button")
    private WebElement addElementButton;

    @FindBy(xpath = "//*[@id=\"elements\"]/button")
    private WebElement deleteButton1;

    @FindBy(xpath = "//*[@id=\"elements\"]/button[2]")
    private WebElement deleteButton2;

    public AddRemoveElementsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

//    public WebDriver getDriver(){
//        return driver;
//    }

    public WebElement getAddElementButton(){
        return addElementButton;
    }

    public WebElement getDeleteButton1(){
        return deleteButton1;
    }

    public WebElement getDeleteButton2(){
        return deleteButton2;
    }
}
