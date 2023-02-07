package com.vtiger.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends CommonAPI {

    Logger LOG = LogManager.getLogger(ProductsPage.class.getName());
    public ProductsPage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement productMenu;

    @FindBy(xpath = "//body/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[3]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/div[1]/p[1]")
    WebElement vTigerOne;

    @FindBy(xpath = "//a[@id='landscape_video']")
    WebElement watchVideo;

    @FindBy(xpath = "//body/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[3]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/p[1]")
    WebElement oneViewOption;

    @FindBy(xpath = "//a[contains(text(),'Get started for free')]")
    WebElement getStartedForFree;




    public void clickOnProductsMenuOption(){
        clickOn(productMenu);
        LOG.info("click on products menu validation success");
    }
    public void clickOnVtigerOneOption(){
        clickOn(vTigerOne);
        LOG.info("click on VtigerOne option validation success");
    }
    public void clickOnWatchVideoFeature(){
        clickOn(watchVideo);
        LOG.info("click on watch video validation success");
    }

    public void clickOnOneViewOption(){
        clickOn(oneViewOption);
        LOG.info("click on OneView option  validation success");
    }

    public void clickOnGetStartedForFreeButton(){
        clickOn(getStartedForFree);
        LOG.info("click on get started for free validation success");
    }
}
