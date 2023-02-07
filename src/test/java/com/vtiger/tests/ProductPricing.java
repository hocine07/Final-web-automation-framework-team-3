package com.vtiger.tests;

import base.CommonAPI;
import com.vtiger.pages.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductPricing extends CommonAPI {
    Logger LOG = LogManager.getLogger(ProductPricing.class.getName());


    @Test
    public void pricing() {

        HomePage homepage = new HomePage(getDriver());

        homepage.clickOnProductsButton();
        homepage.clickOnPricingButton();


        String expectedTitle = "Vtiger CRM Pricing - Try it for free!";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        LOG.info("click on product button validation success");
        LOG.info("land pricing page success");



    }
}
