package gumtreepages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonAPI {

    Logger LOG = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;


    @FindBy (xpath = "//input[@id='fld-password']")
    WebElement PasswordField;


    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement LoginButton;


     //reusable steps
     public void typeEmailAddress(String emailAdress){
         type(emailField, emailAdress);
         LOG.info("type email address success");
    }

    public void clickOnPasswordField(String clickOnPasswordField){
        type(PasswordField, clickOnPasswordField);
         LOG.info("type password success");
    }

    public void clickOnLoginButton(){
         clickOn(LoginButton);
         LOG.info("Login process success");
    }





}
