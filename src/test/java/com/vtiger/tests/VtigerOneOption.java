package com.vtiger.tests;

import base.CommonAPI;
import com.vtiger.pages.ProductsPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VtigerOneOption extends CommonAPI {

    Logger LOG = LogManager.getLogger(VtigerOneOption.class.getName());

    @Test

    public void vTigerOnePurchases(){

        ProductsPage productsPage = new ProductsPage(getDriver());

        productsPage.clickOnProductsMenuOption();

        String expectedTitle = "CRM Software: Customer Relationship Management | Vtiger CRM";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        LOG.info(" product menu  validation success");

        productsPage.clickOnVtigerOneOption();

        String expectedTitle2 = "All in One CRM | Vtiger One - The Complete CRM Solution";
        String actualTitle2 = getCurrentTitle();
        Assert.assertEquals(actualTitle2, expectedTitle2);
        LOG.info("land VtigerOne page  validation success");

        productsPage.clickOnWatchVideoFeature();

        String expectedTitle3 = "All in One CRM | Vtiger One - The Complete CRM Solution";
        String actualTitle3 = getCurrentTitle();
        Assert.assertEquals(actualTitle3, expectedTitle3);
        LOG.info("land Vtiger video validation success");



    }
}
