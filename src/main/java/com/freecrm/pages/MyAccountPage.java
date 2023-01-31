package com.freecrm.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyAccountPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(HomePage.class.getName());

    public MyAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@id=\"top-header-menu\"]/b")
    public WebElement validLogin;


    public String getValid() {
        waitForElementToBeVisible(getDriver(), 30, validLogin);
        return getTextFromElement(validLogin);
    }


    @FindBy(xpath = "//div[@class='ui inverted transparent left icon input']/input")
    public WebElement searchBar;

    public void search(String item) {
        typeAndEnter(searchBar, item);
    }


    @FindBy(xpath = "//div[@class='ui basic button floating item dropdown']")
    public WebElement settingBtn;

    public void clickOnSettingBtn() {
        clickOn(settingBtn);
    }



    @FindBy(xpath = "//a[@role='option']")
    List<WebElement> settingMenuList;

    public void clickOnSettingMenuList(String list){
        for(WebElement element: settingMenuList){
            if(element.getText().equals(list));
            clickOn(element);
            break;
            }
        }
    }




