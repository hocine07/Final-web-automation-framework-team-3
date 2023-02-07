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
    Logger LOG = LogManager.getLogger(AccountSetting.class.getName());

    public AccountSetting(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='right menu']/a")
    List<WebElement> accountSettingMenu;

    @FindBy(xpath = "//div[@class='ui button']")
    public WebElement addButton;

    @FindBy(xpath = "//tbody//tr//td[2]//a")
    public List<WebElement> allUsers;


    @FindBy(xpath = "//div[@class='ui vertical fluid tabular menu']")
    public List<WebElement> accountsList;


    @FindBy(xpath = "//div[@class='ui fluid input']//input")
    public WebElement phoneNumberField;


    @FindBy(xpath = "//button[@class='ui linkedin small button']")
    public WebElement updateAndVerifyNumber;


    @FindBy(xpath = "//i[@class='remove icon']")
    public WebElement deleteUserIcon;


    @FindBy(xpath = "//button[@class='ui primary button']")
    public WebElement confirmDeleteBtn;


    @FindBy(xpath = "//table[@class='ui celled selectable compact form definition table']")
    public WebElement userTable;


    @FindBy(xpath = "//i[@class='edit icon']")
    public WebElement editUserIcon;


    @FindBy(xpath = "//span[text()='Lhouhoussine Hou']")
    public WebElement lhouHoussineTitle;

    @FindBy(xpath = "//div[@class='label']")
    public WebElement verificationCode;


    public void clickOnSettingOption(String button) {
        for (WebElement element : accountSettingMenu) {
            if (element.getText().equals(button)) {
                clickOn(element);
                break;
            }
        }
    }


    public void clickOnAddBtn() {
        clickOn(addButton);
    }

    public List<String> getAllUserName() {
        List<String> usersName = new ArrayList<>();
        for (WebElement element : allUsers) {
            usersName.add(element.getText());


        }
        return usersName;
    }

    public void setAccountsList(String option) {
        for (WebElement element : accountsList) {
            if (element.getText().equals(option)) ;
            clickOn(element);
            break;
        }


    }


    public void typeOnPhoneNumberField(String phoneNumber){
        type(phoneNumberField, phoneNumber);

    }

    public void clickOnUpdateAndVerifyNumber(){
        clickOn(updateAndVerifyNumber);
    }



    public void clickOnDeleteUserIcon(){
        clickOn(deleteUserIcon);
    }


    public void clickOnConfirmDelete(){
        clickOn(confirmDeleteBtn);
    }

    public void clickOnEditUserIcon(){
        clickOn(editUserIcon);
    }
}


