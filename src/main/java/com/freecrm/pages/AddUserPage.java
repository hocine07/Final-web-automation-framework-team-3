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



    @FindBy(className = "first_name")
    public WebElement firstNameField;





    @FindBy(className = "last_name")
    public WebElement lastNameField;




    @FindBy (className = "email")
    public WebElement emailField;



    @FindBy(className = "divider text")
    public WebElement countryNumber;






}





