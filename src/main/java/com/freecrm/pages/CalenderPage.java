package com.freecrm.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CalenderPage extends CommonAPI {

    Logger LOG = LogManager.getLogger(CalenderPage.class.getName());


    public CalenderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div[@class='item']//a")
    public WebElement manageCalendarBtn;


    @FindBy (xpath = "//i[@class='black edit icon']")
    public WebElement editButton;
    @FindBy(xpath = "//input[@name='calendarName']")
    public WebElement editField;
    @FindBy (xpath = "//button[@class='ui blue button']")
    public WebElement saveEditButton;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div")
    public List<WebElement> calendarsIcon;


    @FindBy(xpath = "//button[@class='ui mini icon right floated button basic']//i")
    public WebElement addCalendarPlus;


    @FindBy(xpath = "//div[@class='ui fluid action input']//input")
    public WebElement calendarNameField;



    @FindBy(xpath = "//button[text()='Add']")
    public WebElement addButton;


    @FindBy(xpath = "//button[text()='Close']")
    public WebElement closeButton;

    @FindBy(xpath = "//div[text()='Birth']")
    public WebElement event;

    @FindBy (xpath = "//div[@id='main-content']/div/div[2]/div/div[1]/div/div[3]/div[2]/div/label")
    public WebElement event2;

    @FindBy(xpath = "//label[text()='Birth']")
    public WebElement lhouCalandar;


    @FindBy(xpath = "//div[@class='ui relaxed divided list']/div[2]//a[4]")
    public WebElement deleteOption;


    @FindBy(xpath = "//button[text()='Delete']")
    public WebElement deleteBtn;

    @FindBy(xpath = "//div[@class='ui inverted transparent left icon input']/input")
    public WebElement searchBar;

    @FindBy(xpath = "//button[@class='ui linkedin button']")
    public WebElement createEventBtn;

    @FindBy(name= "title")
    public WebElement inputEventName;

    @FindBy(xpath = "//button[@class='ui linkedin button']")
    public WebElement saveEventBtn;

    @FindBy(xpath = "//div[@class='ui form segment']//p")
    public WebElement eventName;
    @FindBy(xpath = "//div[@class='actions']//button[@class='ui button']")
    public WebElement closeFrame;


//    public void doAddCalandar(String item) throws InterruptedException {
//        Thread.sleep(3000);
//        clickOn(manageCalandarBtn);
//        Thread.sleep(3000);
//        clickWithJavascript(addCalandarPlus);
//        Thread.sleep(3000);
//        type(calandarNameField, item);
//        Thread.sleep(3000);
//
//        clickWithJavascript(addButton);
//

//    }

    public void clickOnManage(WebDriver driver) {
        Actions action = new Actions(driver);
        action.moveToElement(searchBar);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", manageCalendarBtn);
    }

    public void clickOnAddPlus() throws InterruptedException {
        //waitForElementToBeVisible(getDriver(),20,addCalendarPlus);
        Thread.sleep(1000);
        clickOn(addCalendarPlus);
    }

    public void typeOnField(String item) throws InterruptedException {

        type(calendarNameField, item);
    }

    public void clickOnAddButton(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", addButton);
    }
    public void clickOnClose(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", closeButton);
    }

    public void deleteBirthEvent() {
        clickOn(deleteOption);
    }


    public void deleteBtn() {
        clickOn(deleteBtn);

    }

    public void clickOnCreateEventBtn(){
        clickOn(createEventBtn);
    }
    public void setInputEventName(String eventName){
        type(inputEventName,eventName);
    }
    public void clickOnSaveBtn(){
        clickOn(saveEventBtn);
    }
    public String getEventName(){
        return getTextFromElement(eventName);
    }
    public void editCalendar(String calendar,String newCalendarName){
        for(WebElement element : calendarsIcon){
            if(getTextFromElement(element).equals(calendar)) {
                clickOn(editButton);
                typeAndClear(editField,newCalendarName);
                clickOn(saveEditButton);
            }
        }
    }
    public void doEditCalendar(String calendar,String newCalendarName){
        clickOnManage(driver);
        editCalendar(calendar,newCalendarName);
        clickWithJavascript(closeFrame);

    }


}
