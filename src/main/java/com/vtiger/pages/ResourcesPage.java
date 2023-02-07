package com.vtiger.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResourcesPage extends CommonAPI {

    Logger LOG = LogManager.getLogger(ResourcesPage.class.getName());

    public ResourcesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]")
    WebElement resources;

    @FindBy(xpath = "//body/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/div[1]/div[1]/div[3]/ul[1]/li[3]/a[1]")
    WebElement contactUs;

    @FindBy(xpath = "//body/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]" )
    WebElement articlesPage;

    @FindBy(xpath = "//a[contains(text(),'Creating Marketing Lists')]")
    WebElement marketingListsArticle;

    @FindBy(xpath = "//h1[contains(text(),'Introduction')]")
    WebElement introduction;


    @FindBy(xpath = "//body/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]")
    WebElement blogOption;

    @FindBy(xpath = "//a[contains(text(),'Automation')]")
    WebElement automationCategoryButton;

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/article[1]/a[2]/img[1]")
    WebElement getStartedNowOption;


    @FindBy(xpath = "//a[contains(text(),'Collaboration')]")
    WebElement collaborationCategory;

    @FindBy(xpath = "//body/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/div[1]/div[1]/div[3]/ul[1]/li[2]/a[1]")
    WebElement partnersOption;

    @FindBy(xpath = "//a[contains(text(),'Find a Partner')]")
    WebElement findPartnersOption;

    @FindBy(xpath = "//body/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")
    WebElement videoTutorials;

    @FindBy(xpath = "//p[contains(text(),'Overview of Vtiger Sales CRM')]")
    WebElement overViewProduct;

    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    WebElement signInButton;

    @FindBy(xpath = "//a[contains(text(),'Forgot Password?')]")
    WebElement forgotPasswordButton;

    @FindBy(xpath = "//body/div[@id='app']/div[@id='forgotPasswordModal']/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")
    WebElement userNameField;

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    WebElement submitButton;


    //reusable steps

    public void clickOnResourcesMenu(){
        clickOn(resources);
        LOG.info("click resources menu validation success");
    }

    public void clickOnContactsUsOption(){
        clickOn(contactUs);
        LOG.info("click resources menu validation success");
    }
    public void clickOnaArticleOption(){
        clickOn(articlesPage);
        LOG.info("click resources menu validation success");
    }

    public void clickOnMarketingListsOption(){
        clickOn(marketingListsArticle);
        LOG.info("click resources menu validation success");
    }
    public void clickOnIntroductionOption(){
        clickOn(introduction);
        LOG.info("click resources menu validation success");
    }
    public void clickOnBlogOption(){
        clickOn(blogOption);
        LOG.info("click resources menu validation success");
    }
    public void clickOnAutomationButton(){
        clickOn(automationCategoryButton);
        LOG.info("click resources menu validation success");
    }

    public void clickOnGetStartedNow(){
        clickOn(getStartedNowOption);
        LOG.info("click resources menu validation success");
    }
    public void clickOnCollaborationOption(){
        clickOn(collaborationCategory);
        LOG.info("click resources menu validation success");
    }


    public void clickOnPartnersOption(){
        clickOn(partnersOption);
        LOG.info("click resources menu validation success");
    }
    public void clickOnFindPartnerOption(){
        clickOn(findPartnersOption);
        LOG.info("click resources menu validation success");
    }

    public void clickOnVideoTutorialsOption(){
        clickOn(videoTutorials);
        LOG.info("click resources menu validation success");
    }
    public void clickOnOverViewVideoOfSales(){
        clickOn(overViewProduct);
        LOG.info("click resources menu validation success");
    }
    public void clickOnSignInButton(){
        clickOn(signInButton);
        LOG.info("click resources menu validation success");
    }
    public void clickOnCForgotPasswordButton(){
        clickOn(forgotPasswordButton);
        LOG.info("click resources menu validation success");
    }

    public void typeUsername(String username){
        clickOn(userNameField);
        LOG.info("click resources menu validation success");
    }

    public void clickOnSubmitButton(){
        clickOn(submitButton);
        LOG.info("click resources menu validation success");
    }

}
