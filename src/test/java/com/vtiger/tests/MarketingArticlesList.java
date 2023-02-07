package com.vtiger.tests;

import base.CommonAPI;
import com.vtiger.pages.ResourcesPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MarketingArticlesList extends CommonAPI {

    Logger LOG = LogManager.getLogger(MarketingArticlesList.class.getName());

    @Test

    public void marketingLists(){

        ResourcesPage resourcesPage = new ResourcesPage(getDriver());

        resourcesPage.clickOnResourcesMenu();
        resourcesPage.clickOnaArticleOption();

        String expectedTitle = "Articles | Knowledge Base";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        LOG.info("click on resources menu validation success");
        LOG.info("click articles  menu validation success");

        resourcesPage.clickOnMarketingListsOption();

        String expectedTitle2 = "Creating Marketing Lists | Knowledge Base";
        String actualTitle2 = getCurrentTitle();
        Assert.assertEquals(actualTitle2, expectedTitle2);
        LOG.info("click on marketing option validation success");

        resourcesPage.clickOnIntroductionOption();

        String expectedTitle3 = "Creating Marketing Lists | Knowledge Base";
        String actualTitle3 = getCurrentTitle();
        Assert.assertEquals(actualTitle3, expectedTitle3);
        LOG.info("introduction page validation success");

    }
}
