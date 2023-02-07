package com.freecrm.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingManagerPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(BillingManagerPage.class.getName());


    public BillingManagerPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[text()='Pay using a Debit or Credit Card.']")
    public WebElement payWithDebitOrCreditLink;


    @FindBy(xpath = "//div[@class='ui fluid input']//input")
    public WebElement cardNameField;


    @FindBy(name = "number")
    public WebElement cardNumber;


    @FindBy(name = "expiration")
    public WebElement expirationDate;


    @FindBy(xpath = "//*[@id=\"cvc\"]")
    public WebElement cvvField;


    @FindBy(name = "address")
    public WebElement addressField;


    @FindBy(name = "city")
    public WebElement cityField;


    @FindBy(name = "state")
    public WebElement stateField;

    @FindBy(name = "zipcode")
    public WebElement postCodeField;


    @FindBy(xpath = "//button[@class='ui linkedin small button']")
    public WebElement saveBtn;
    @FindBy(xpath = "//div[text()='The card number is not a valid credit card number.']")
    public WebElement errorMessage;


    @FindBy(xpath = "//h4[text()]")
    public WebElement confirmationMessage;



    public void clickOnPayWithDebitOrCredit() {
        clickOn(payWithDebitOrCreditLink);

    }


    public void typeOnCardName(String name) {
        type(cardNameField, name);
    }

    public void typeOnCardNum(String cardNum) {
        type(cardNumber, cardNum);
    }

    public void typeOnExpDate(String expDate) {
        type(expirationDate,expDate);

    }


    public void typeOnCvvField(String cvv) {
        type(cvvField, cvv);
    }


    public void typeOnAddressField(String address){
        type(addressField,address);
    }


    public void typeOnCityField(String city){
        type(cityField, city);
    }

    public void typeOnStateField(String country){
        type(stateField, country);

    }


    public void typeOnPostCodeField(String postCode){
        type(postCodeField, postCode);
    }

    public void clickOnSaveBtn(){
        clickOn(saveBtn);
    }



}



