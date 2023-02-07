package com.vtiger.tests;

import base.CommonAPI;
import com.vtiger.pages.ResourcesPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArticlesSignInButton extends CommonAPI {

    Logger LOG = LogManager.getLogger(ArticlesSignInButton.class.getName());

    @Test

    public void forgotPasswordButton(){

        ResourcesPage resourcesPage = new ResourcesPage(getDriver());

        resourcesPage.clickOnResourcesMenu();
        resourcesPage.clickOnaArticleOption();

        String expectedTitle = "Articles | Knowledge Base";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        LOG.info("click on resources menu validation success");

        resourcesPage.clickOnSignInButton();


        String expectedTitle2 = "Articles | Knowledge Base";
        String actualTitle2 = getCurrentTitle();
        Assert.assertEquals(actualTitle2, expectedTitle2);
        LOG.info("click on sign in button validation success");

        resourcesPage.clickOnCForgotPasswordButton();


        String expectedTitle3 = "Articles | Knowledge Base";
        String actualTitle3 = getCurrentTitle();
        Assert.assertEquals(actualTitle3, expectedTitle3);
        LOG.info("click on forgot password button validation success");


    }
}
