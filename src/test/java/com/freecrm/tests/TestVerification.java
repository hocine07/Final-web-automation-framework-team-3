package com.freecrm.tests;

import base.CommonAPI;
import com.freecrm.pages.HomePage;
import com.github.javafaker.Hacker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ReadFromExcel;

import java.io.File;

public class TestVerification extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestVerification.class.getName());

    String path = System.getProperty("user.dir")+ File.separator +"data" + File.separator + "titles.xlsx";
    ReadFromExcel read = new ReadFromExcel(path, "test data");

    String email= read.getDataFromCell(1,0);
    String password= read.getDataFromCell(1,1);
    @Test
    public void testVerifyTitle(){
        Assert.assertEquals(driver.getTitle(),"Cogmento CRM");
    }

    @Test
    public void testVerifyLogo(){
        HomePage homePage = new HomePage(getDriver());
        LOG.info("land on freecrm home page success");
        String expectedTitle= "Cogmento CRM";
        homePage.typeEmailAddress(email);

        homePage.typePassword(password);

        homePage.clickOnLogin();
        LOG.info("login success");

        Assert.assertTrue(homePage.pageLogo.isDisplayed());
    }
}
