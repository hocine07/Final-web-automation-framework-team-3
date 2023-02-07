package com.vtiger.pages;

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

    //objects


    @FindBy(css = "#login")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"com-form-login\"]/div[1]/input")
    WebElement userNameField;

    @FindBy (xpath = "//*[@id=\"com-form-login\"]/div[2]/input")
    WebElement passeWordField;

    @FindBy(xpath = "//*[@id=\"com-form-login\"]/div[3]/button")
    WebElement signINButton;

    @FindBy(css = "#com-form-login-error")
    WebElement errorMessage;

    @FindBy(xpath = "//span[@id='not_signed_inayoyyvuhj9i7']")
    WebElement signInWithGoogle;

    //reusable steps

    public void clickOnSignInButtonWithGoogle() {
        clickOn(signInWithGoogle);
        LOG.info("click connect button success");
    }
    public void clickOnLoginButton() {
        clickOn(loginButton);
        LOG.info("click connect button success");
    }

    public void typeEmailAddress(String emailAddress) {
        type(userNameField, emailAddress);
        LOG.info("type email address success");
    }



    public void clickOnPasswordField(String password){

        type(passeWordField, password);
        LOG.info("type password success");
    }


    public void clickOnSignInButton(){
        clickOn(signINButton);
        LOG.info("click sign in button success");
    }

    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }


}

