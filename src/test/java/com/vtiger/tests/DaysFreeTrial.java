package com.vtiger.tests;

import base.CommonAPI;
import com.vtiger.pages.FreeTrialPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DaysFreeTrial extends CommonAPI {

    Logger LOG = LogManager.getLogger(DaysFreeTrial.class.getName());

    @Test
    public void freeTrialOption(){

        FreeTrialPage freeTrialPage= new FreeTrialPage(getDriver());

        freeTrialPage.clickOn15DaysFreeTrialOption();

        String expectedTitle = "Start Your Free Trial - Vtiger";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        LOG.info("15 days free trial page  validation success");

        freeTrialPage.typeYourWorkEmail();

        String expectedTitle2 = "Start Your Free Trial - Vtiger";
        String actualTitle2 = getCurrentTitle();
        Assert.assertEquals(actualTitle2, expectedTitle2);
        LOG.info("email address validation success");

        freeTrialPage.clickOnNextButton();

        String expectedTitle3 = "Start Your Free Trial - Vtiger";
        String actualTitle3 = getCurrentTitle();
        Assert.assertEquals(actualTitle3, expectedTitle3);
        LOG.info("click on next button  validation success");

    }
}
