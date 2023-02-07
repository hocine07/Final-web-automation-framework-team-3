package com.vtiger.tests;

import base.CommonAPI;
import com.vtiger.pages.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScrollBoxTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(ScrollBoxTest.class.getName());

    @Test
    public void ScrollBox (){
        HomePage homePage = new HomePage(getDriver());

        String expectedTitle = "CRM Software: Customer Relationship Management | Vtiger CRM";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        LOG.info("land vtiger webpage success");

        homePage.clickOnScrollBox();
        LOG.info("click scroll box validation  success");






    }

}
