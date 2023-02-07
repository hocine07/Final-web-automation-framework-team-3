package com.vtiger.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SolutionsPage extends CommonAPI {

    Logger LOG = LogManager.getLogger(SolutionsPage.class.getName());
    public SolutionsPage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//body/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")
    WebElement solutionsMenu;


    @FindBy(xpath = "//body/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/div[1]/div[1]/div[3]/ul[1]/li[3]/a[1]")
    WebElement trainingPage;

    @FindBy(xpath = "//tbody/tr[1]/td[3]/a[1]")
    WebElement purchaseOption;
    //reusable steps

    public void clickOnSolutionsOption(){
        clickOn(solutionsMenu);
        LOG.info("click on solution option validation success");
    }
    public void clickOnTrainingOption(){
        clickOn(trainingPage);
        LOG.info("training page validation success");
    }
    public void clickOnPurchaseButton(){
        clickOn(purchaseOption);
        LOG.info("click on purchase button validation success");
    }
}
