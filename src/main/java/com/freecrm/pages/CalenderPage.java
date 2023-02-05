package com.freecrm.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalenderPage extends CommonAPI {

    Logger LOG = LogManager.getLogger(HomePage.class.getName());


    public CalenderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//a[text()='Manage Calendars']")
    public WebElement manageCalandarBtn;



    @FindBy(xpath = "//button[@class='ui mini icon right floated button basic']//i")
    public WebElement addCalandarPlus;


    @FindBy(xpath = "//div[@class='ui fluid action input']//input")
    public WebElement calandarNameField;



    @FindBy(xpath = "//button[text()='Add']")
    public WebElement addButton;


    @FindBy(xpath = "//button[text()='Close']")
    public WebElement closeButton;

    @FindBy (xpath = "//label[text()='Birt']")
    public WebElement Event;




    public void doAddCalandar(String item) throws InterruptedException {
        Thread.sleep(3000);
        clickOn(manageCalandarBtn);
        Thread.sleep(3000);
        clickWithJavascript(addCalandarPlus);
        Thread.sleep(3000);
        type(calandarNameField, item);
        Thread.sleep(3000);

        clickWithJavascript(addButton);


    }

    public void clickOnManage() {

        clickOn(manageCalandarBtn);}
    public void clickOnAddPlud()  {

            clickOn(addCalandarPlus); }
    public void typeOnField(String item) throws InterruptedException {

                clickOn(calandarNameField);}
    public void clickOnAddButton()  {

                    clickOn(addButton);}



}
