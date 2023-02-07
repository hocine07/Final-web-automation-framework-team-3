package com.freecrm.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentsPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(DocumentsPage.class.getName());

    public DocumentsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//i[@class='folder icon']")
    public WebElement createFolderButton;


    @FindBy(name = "addFolderName")
    public WebElement nameField;


    @FindBy(xpath = "//button[@class='ui button']")
    public WebElement saveBtn;


    @FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/div/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/a")
    public WebElement lhouFile;


    @FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[1]")
    public WebElement deleteFolderOption;


    @FindBy(xpath = "//button[@class='ui red button']")
    public WebElement deleteBtn;


    @FindBy(xpath = "//a[text()='lhou']")
    public WebElement lhouDocument;




















    public void clickOnNewFolder(){
        clickOn(createFolderButton);
    }

    public void typeOnNameField(String name){
        type(nameField,name );
    }

    public void clickOnSave(){
        clickOn(saveBtn);
    }

    public void clickOnLhouFolder(){
        clickOn(lhouFile);
    }


    public void clickOnDeleteFolderOption(){
        clickOn(deleteFolderOption);
    }


    public void clickOnRedDeleteFolderBtn(){
        clickOn(deleteBtn);
    }

}

