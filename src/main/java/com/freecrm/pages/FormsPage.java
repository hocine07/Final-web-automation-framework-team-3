package com.freecrm.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormsPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(HomePage.class.getName());

    public FormsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



        @FindBy(xpath = "//i[@class='dropdown icon']")
        public WebElement dropDownBtn;

        @FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/div/div[2]/table/tfoot/tr/th[2]/span/div[1]/div[2]/div[2]")
        public WebElement deleteOption;

        @FindBy(xpath = "//i[@class='checkmark icon']")
        public WebElement confirmBtn;


        public void dropDownIcon (String option ) throws InterruptedException {
            clickOn(dropDownBtn);
            Thread.sleep(4000);
            clickOn(deleteOption);
            Thread.sleep(4000);
            selectOptionFromDropdown(deleteOption, option);
        }



    public void clickOnConfirm() {
        clickOn(confirmBtn);
    }
}

