package gumtreepages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(RegistrationPage.class.getName());

    public RegistrationPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"is-being-refined\"]/div[3]/div/div[3]/main/div/div[2]/ul/li[2]/a")
    WebElement RegisterButton;


    @FindBy(css = "#form.firstName")
    WebElement FirstNameField;


    //reusable steps
    public void clickOnRegisterButton(){
        clickOn(RegisterButton);
        LOG.info("click register button success");
    }


    public void clickOnFirstName(String FirstName){
        type(FirstNameField, FirstName);
        LOG.info("type passwordFirstName");

    }




}



