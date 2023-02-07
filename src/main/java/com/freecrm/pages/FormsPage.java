package com.freecrm.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FormsPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(FormsPage.class.getName());

    public FormsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//i[@class='dropdown icon']")
    public WebElement dropDownBtn;

    @FindBy(xpath = "//button[@class='ui button']")
    public WebElement deleteOption1;

    @FindBy(xpath = "//i[@class='checkmark icon']")
    public WebElement confirmBtn;

    @FindBy(xpath = "//button[@class='ui linkedin button']")
    public WebElement addButton;

    @FindBy(xpath = "//div[@class='ui input']//input")
    public WebElement nameField;

    @FindBy(xpath = "//label[text()='Active']")
    public WebElement activeBox;

    @FindBy(xpath = "//button[@class='ui linkedin button']")
    public WebElement saveButton;
    @FindBy(xpath = "//span[@class='selectable ']")
    public WebElement textName;
//    @FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/div/div[2]/table/tbody/tr[1]")
//    public List<WebElement> listform;
    @FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/div/div[2]/table/tbody/tr[1]/td[2]/a")
    public WebElement form1;





    @FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/div/div[2]/table/tbody/tr[1]/td[7]/div/button")
    public WebElement deleteOption;



    public void dropDownIcon (String option ) throws InterruptedException {
        clickOn(deleteOption);
        Thread.sleep(4000);
        clickOn(deleteOption1);

    }



    public void clickOnConfirm() {
        clickOn(confirmBtn);
    }


    public void clickOnAddButton(){
        clickOn(addButton);
    }


    public void typeOnNameField(String name){
        type(nameField, name);

    }

    public void uncheckActiveBox(){
        clickOn(activeBox);
    }

    public void clickOnSaveButton(){
        clickOn(saveButton);
    }

//    public Boolean isExist(WebElement element1){
//        for(WebElement element : listform){
//            if(element.getText().contains((CharSequence) element1)){
//                return true;
//            }
//
//        }
//        return false;
    }


