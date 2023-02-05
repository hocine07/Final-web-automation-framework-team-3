package com.freecrm.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class AccountSetting extends CommonAPI {
    Logger LOG = LogManager.getLogger(HomePage.class.getName());

    public AccountSetting(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='right menu']/a")
    List<WebElement> accountSettingMenu;

    @FindBy(xpath = "//div[@class='ui button']")
    public WebElement addButton;

    @FindBy(xpath = "//tbody//tr//td[2]//a")
    public List<WebElement> allUsers;


    public void clickOnSettingOption(String button) {
        for (WebElement element : accountSettingMenu) {
            if (element.getText().equals(button)) {
                clickOn(element);
                break;
            }
        }
    }





    public void clickOnAddBtn(){
        clickOn(addButton);
    }

    public List<String> getAllUserName(){
        List<String> usersName= new ArrayList<>();
        for(WebElement element : allUsers){
            usersName.add(element.getText());


        }
        return usersName;
    }



}


