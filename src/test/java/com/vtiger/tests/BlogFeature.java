package com.vtiger.tests;

import base.CommonAPI;
import com.vtiger.pages.ResourcesPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogFeature extends CommonAPI {
    Logger LOG = LogManager.getLogger(BlogFeature.class.getName());

    @Test

    public void automationBlogPage(){

        ResourcesPage resourcesPage = new ResourcesPage(getDriver());

        resourcesPage.clickOnResourcesMenu();
        resourcesPage.clickOnBlogOption();

        String expectedTitle = "Vtiger CRM Blog";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        LOG.info("land to blog page validation success");

        resourcesPage.clickOnAutomationButton();


        String expectedTitle2 = "Vtiger CRM Blog » Automation";
        String actualTitle2 = getCurrentTitle();
        Assert.assertEquals(actualTitle2, expectedTitle2);
        LOG.info("click automation category  option validation success");

        resourcesPage.clickOnGetStartedNow();

        String expectedTitle3 = "What Lead Management System? Lead Management Process";
        String actualTitle3 = getCurrentTitle();
        Assert.assertEquals(actualTitle3, expectedTitle3);
        LOG.info("get started now validation success");


    }
}
