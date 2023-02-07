package com.vtiger.tests;

import base.CommonAPI;
import com.vtiger.pages.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExploreAllFeature extends CommonAPI {

    Logger LOG = LogManager.getLogger(ExploreAllFeature.class.getName());

    @Test
    public void exploreAllFeature(){

        HomePage homePage = new HomePage(getDriver());

        homePage.clickOnFeatureButton();


        String expectedTitle = "Vtiger Features List | CRM Tools, Functionalities and Capabilities";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        LOG.info(" feature menu validation success");


        homePage.clickOnExploreAllFeatures();

        String expectedTitle2 = "Vtiger Features List | CRM Tools, Functionalities and Capabilities";
        String actualTitle2 = getCurrentTitle();
        Assert.assertEquals(actualTitle2, expectedTitle2);
        LOG.info("land to explore all features page  validation success");




    }
}

