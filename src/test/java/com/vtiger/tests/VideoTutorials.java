package com.vtiger.tests;

import base.CommonAPI;
import com.vtiger.pages.ResourcesPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VideoTutorials extends CommonAPI {
    Logger LOG = LogManager.getLogger(VideoTutorials.class.getName());

    @Test

    public void overViewSalesVideosTutorials(){

        ResourcesPage resourcesPage = new ResourcesPage(getDriver());

        resourcesPage.clickOnResourcesMenu();

        String expectedTitle = "CRM Software: Customer Relationship Management | Vtiger CRM";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        LOG.info("click on resources menu validation success");

        resourcesPage.clickOnVideoTutorialsOption();


        String expectedTitle2 = "Video Tutorials | Vtiger CRM";
        String actualTitle2 = getCurrentTitle();
        Assert.assertEquals(actualTitle2, expectedTitle2);
        LOG.info("click on video tutorials validation success");

        resourcesPage.clickOnOverViewVideoOfSales();

        String expectedTitle3 = "Video Tutorials | Vtiger CRM";
        String actualTitle3 = getCurrentTitle();
        Assert.assertEquals(actualTitle3, expectedTitle3);
        LOG.info("overView video tutorial validation success");

    }
}
