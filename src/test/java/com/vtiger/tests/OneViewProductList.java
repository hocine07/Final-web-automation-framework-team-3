package com.vtiger.tests;

import base.CommonAPI;
import com.vtiger.pages.ProductsPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OneViewProductList extends CommonAPI {

    Logger LOG = LogManager.getLogger(OneViewProductList.class.getName());

    @Test
    public void oneViewProductFreeTrial(){

        ProductsPage productsPage = new ProductsPage(getDriver());

        productsPage.clickOnProductsMenuOption();

        String expectedTitle = "CRM Software: Customer Relationship Management | Vtiger CRM";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        LOG.info("click on product menu option success");


        productsPage.clickOnOneViewOption();


        String expectedTitle2 = "Vtiger One View | Unified Customer View in CRM";
        String actualTitle2 = getCurrentTitle();
        Assert.assertEquals(actualTitle2, expectedTitle2);
        LOG.info("land oneView page success");

        productsPage.clickOnGetStartedForFreeButton();

        String expectedTitle3 = "Start Your Free Trial - Vtiger";
        String actualTitle3 = getCurrentTitle();
        Assert.assertEquals(actualTitle3, expectedTitle3);
        LOG.info("land get started for free page success");



    }
}
