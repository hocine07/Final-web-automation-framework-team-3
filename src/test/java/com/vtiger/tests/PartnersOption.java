package com.vtiger.tests;

import base.CommonAPI;
import com.vtiger.pages.ResourcesPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PartnersOption extends CommonAPI {

    Logger LOG = LogManager.getLogger(PartnersOption.class.getName());

    @Test

    public  void partnersCategory(){

        ResourcesPage resourcesPage = new ResourcesPage(getDriver());

        resourcesPage.clickOnResourcesMenu();

        String expectedTitle = "CRM Software: Customer Relationship Management | Vtiger CRM";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        LOG.info("click on resources menu validation success");

        resourcesPage.clickOnPartnersOption();

        String expectedTitle2 = "Partners | Vtiger CRM";
        String actualTitle2 = getCurrentTitle();
        Assert.assertEquals(actualTitle2, expectedTitle2);
        LOG.info("partners page validation success");

        resourcesPage.clickOnFindPartnerOption();


        String expectedTitle3 = "Cloud Reseller Partners | Vtiger CRM";
        String actualTitle3 = getCurrentTitle();
        Assert.assertEquals(actualTitle3, expectedTitle3);
        LOG.info("find partner page validation success");


    }
}
