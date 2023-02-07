package com.vtiger.tests;

import base.CommonAPI;
import com.vtiger.pages.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationBar extends CommonAPI {

    Logger LOG = LogManager.getLogger(NavigationBar.class.getName());
    @Test
    public void navigationBar() {
        HomePage homePage = new HomePage(getDriver());

        String expectedTitle = "CRM Software: Customer Relationship Management | Vtiger CRM";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        LOG.info("land vtiger webpage success");

        homePage.clickOnNavigationBar();
        LOG.info("navigation bar validation success");

        homePage.clickOnTakeProductTour();
        LOG.info("take product tour video  validation success");

    }

}
