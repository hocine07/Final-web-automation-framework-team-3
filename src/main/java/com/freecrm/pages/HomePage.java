package com.freecrm.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {
    Logger LOG = LogManager.getLogger(HomePage.class.getName());

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='header item']")
    public WebElement pageLogo;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailField;


    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordField;


    @FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
    public WebElement loginButton;


    @FindBy(xpath = "//div[@class='ui negative message']/div")
    public WebElement invalidLogin;


    @FindBy(xpath = "//i[@class='wpforms icon']")
    public WebElement formsButton;


    @FindBy(xpath ="//i[@class='file icon']")
    public WebElement documentsBtn;









    public void typeEmailAddress(String EmailAddress) {
        type(emailField, EmailAddress);
        LOG.info("");

    }


    public void typePassword(String Password) {
        type(passwordField, Password);
        LOG.info("");

    }


    public void clickOnLogin() {
        clickOn(loginButton);
    }


    public String getErrorLogin() {
        return getTextFromElement(invalidLogin);


    }


    public void clickOnForms(){
        clickOn(formsButton);
    }



    public void clickOnDocuments(){
        clickOn(documentsBtn);
    }





}







