package com.vtiger.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {

    Logger LOG = LogManager.getLogger(HomePage.class.getName());
    public HomePage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"s-zoom\"]/a/img")
    WebElement logoIcon;

    @FindBy(xpath = "//span[@id='loginspan']")
    WebElement loginButton;

    @FindBy(xpath = "//html")
    WebElement scrollBox;

    @FindBy(xpath = "//div[@id='s-zoom']")
    WebElement navigationBar;

    @FindBy(xpath = "//body/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement productsMenuButton;

    @FindBy(xpath = "//p[contains(text(),'Pricing')]")
    WebElement pricingButton;


    @FindBy(xpath = "//body/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
    WebElement featuresButton;

    @FindBy(xpath = "//a[contains(text(),'Explore all features')]")
    WebElement exploreAllFeatures;


    //reusable steps
    public void clickOnLogoIcon() {
        clickOn(logoIcon);
        LOG.info("HomePage popup success");
    }

    public void clickOnLoginButton() {
        clickOn(loginButton);
        LOG.info("click on login button success");
    }

    public void clickOnScrollBox() {
        clickOn(scrollBox);
        LOG.info("ScrollBox scroll down success");
    }


    public void clickOnNavigationBar() {
        clickOn(navigationBar);
        LOG.info("hover over NavigationBar success");
    }

    public void clickOnTakeProductTour() {
        clickOn(navigationBar);
        LOG.info("take product tour NavigationBar success");
    }

    public void typeAndEnter() {
    }

    public void clickOnProductsButton() {
        clickOn(productsMenuButton);
        LOG.info("product page validation success");
    }

    public void clickOnPricingButton() {
        clickOn(pricingButton);
        LOG.info("pricing page validation success");
    }

    public void clickOnFeatureButton() {
        clickOn(featuresButton);
        LOG.info(" features menu validation success");
    }

    public void clickOnExploreAllFeatures() {
        clickOn(exploreAllFeatures);
        LOG.info("explore all features page validation success");
    }
}
