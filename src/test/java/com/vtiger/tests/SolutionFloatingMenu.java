package com.vtiger.tests;

import base.CommonAPI;
import com.vtiger.pages.SolutionsPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionFloatingMenu extends CommonAPI {
    Logger LOG = LogManager.getLogger(SolutionFloatingMenu.class.getName());

    @Test

    public void solutionOption(){
        SolutionsPage solutionsPage = new SolutionsPage(getDriver());

        solutionsPage.clickOnSolutionsOption();


        String expectedTitle = "CRM Software: Customer Relationship Management | Vtiger CRM";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        LOG.info(" solutions menu  validation success");


        solutionsPage.clickOnTrainingOption();


        String expectedTitle2 = "Training | Vtiger CRM";
        String actualTitle2 = getCurrentTitle();
        Assert.assertEquals(actualTitle2, expectedTitle2);
        LOG.info("land to training page  validation success");

        solutionsPage.clickOnPurchaseButton();

        String expectedTitle3 = "PayPal";
        String actualTitle3 = getCurrentTitle();
        Assert.assertEquals(actualTitle3, expectedTitle3);
        LOG.info(" purchase page  validation success");



    }
}
