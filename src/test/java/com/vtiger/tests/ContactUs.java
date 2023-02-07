package com.vtiger.tests;

import base.CommonAPI;
import com.vtiger.pages.ResourcesPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUs extends CommonAPI {
    Logger LOG = LogManager.getLogger(ContactUs.class.getName());

    @Test

    public void contactUsOption() {

        ResourcesPage resourcesPage = new ResourcesPage(getDriver());

        resourcesPage.clickOnResourcesMenu();

        String expectedTitle = "CRM Software: Customer Relationship Management | Vtiger CRM";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        LOG.info("click on resources menu validation success");


        resourcesPage.clickOnContactsUsOption();

        String expectedTitle2 = "Contact Us | Vtiger CRM";
        String actualTitle2 = getCurrentTitle();
        Assert.assertEquals(actualTitle2, expectedTitle2);
        LOG.info("click on contact us  validation success");

    }

}
