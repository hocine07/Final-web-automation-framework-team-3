package com.vtiger.tests;

import base.CommonAPI;
import com.vtiger.pages.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoIcon extends CommonAPI {

    Logger LOG = LogManager.getLogger(LogoIcon.class.getName());

    @Test
    public void LogoIcon() {
        HomePage homePage = new HomePage(getDriver());

        String expectedTitle = "CRM Software: Customer Relationship Management | Vtiger CRM";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        LOG.info("HomePage popup success");


        homePage.clickOnLogoIcon();
        homePage.typeAndEnter();


    }

}
