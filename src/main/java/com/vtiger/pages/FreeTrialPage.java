package com.vtiger.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FreeTrialPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(FreeTrialPage.class.getName());
    public FreeTrialPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@id='nav_button_main']")
    WebElement freeTrialOption;

    @FindBy(xpath = "//body/div[@id='page']/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/input[1]")
    WebElement yourWorkEmail;

    @FindBy(xpath = "//button[contains(text(),'Next →')]")
    WebElement nextButton;


    //reusable steps
    public void clickOn15DaysFreeTrialOption() {
        clickOn(freeTrialOption);
        LOG.info("click on 15 days free trial button success");
    }

    public void typeYourWorkEmail() {
        clickOn(yourWorkEmail);
        LOG.info("click on 15 days free trial button success");
    }

    public void clickOnNextButton() {
        clickOn(nextButton);
        LOG.info("click on next button success");
    }

}
