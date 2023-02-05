package com.freecrm.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage extends CommonAPI {

    Logger LOG = LogManager.getLogger(HomePage.class.getName());


    public AddUserPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

     // WebElement region
    @FindBy(name = "first_name")
    public WebElement firstNameField;

    @FindBy(name = "last_name")
    public WebElement lastNameField;

    @FindBy (name = "email")
    public WebElement emailField;

    @FindBy(name = "password")
    public WebElement passwordField;

    @FindBy(name = "password_confirm")
    public WebElement confirmPassword;

    @FindBy(xpath = "//button[@class='ui linkedin small button']")
    public WebElement saveButton;

    // method region
    public void typeFirstName(String firstName){
        type(firstNameField, firstName );
    }


    public void typeLastName(String lastName){
        type(lastNameField,lastName);
    }

    public void typeEmail(String emailAddress){
        type(emailField, emailAddress);
    }

    public void typePassword(String password){
        type(passwordField,password);
    }

    public void typePassword2(String password2){
        type(confirmPassword, password2);
    }

    public void clickOnSaveButton(){
        clickOn(saveButton);
    }


}





