package com.freecrm.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(ContactsPage.class.getName());

    public ContactsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//button[text()='Create']")
    public WebElement createContact;


    @FindBy(name = "first_name")
    public WebElement firstNameField;

    @FindBy(name = "last_name")
    public WebElement lastNameField;


    @FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/form/div[4]/div[1]/div/div/div/div[1]/div/input")
    public WebElement emailAddressField;


    @FindBy(xpath = "//div[@class='ui active visible selection upward dropdown']")
    public WebElement statusDropdown;



    @FindBy(xpath = "//span[text()='New']")
    public WebElement newOption;


    @FindBy(xpath = "//button[@class='ui linkedin button']")
    public WebElement saveContactButton;



    @FindBy(xpath = "//div[@class='ui header item mb5 light-black']")
    public WebElement marcosRach;







    public void clickOnCreate(){
        clickOn(createContact);
    }

    public void typeFirstName(String firstName){
        type(firstNameField, firstName);

    }

    public void typeLastName(String lastName){
        type(lastNameField, lastName);
    }

    public void typeEmailAddress(String emailAddress){
        type(emailAddressField,emailAddress);
    }

    public void clickOnStatusDopdown(){
        clickOn(statusDropdown);
        clickOn(newOption);
    }

    public void clickOnSaveContact(){
        clickOn(saveContactButton);

    }
}
