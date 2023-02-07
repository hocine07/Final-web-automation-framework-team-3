package com.freecrm.tests;

import base.CommonAPI;
import com.freecrm.pages.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ReadFromExcel;

import java.io.File;

import static java.sql.DriverManager.getDriver;

public class TestLogin extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestLogin.class.getName());

    String path = System.getProperty("user.dir")+ File.separator +"data" + File.separator + "titles.xlsx";
    ReadFromExcel read = new ReadFromExcel(path, "test data");

    String email= read.getDataFromCell(1,0);
    String password= read.getDataFromCell(1,1);


    String email2= read.getDataFromCell(2,0);
    String password2= read.getDataFromCell(2,1);

    @Test
    public void ValidEmailAddress() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        String expectedTitle= "Cogmento CRM";
        LOG.info("land on freecrm home page success");
        homePage.typeEmailAddress(email);

        homePage.typePassword(password);

        homePage.clickOnLogin();
        LOG.info("login in success");
        Thread.sleep(300);


        Assert.assertEquals(getCurrentTitle(),"Cogmento CRM");



    }




    @Test
    public void InvalidLogin() {
        HomePage homePage = new HomePage(getDriver());
        LOG.info("land on freecrm home page success");
        homePage.typeEmailAddress(email2);

        homePage.typePassword(password2);

        homePage.clickOnLogin();
        LOG.info("login in failed");


        Assert.assertEquals(homePage.getErrorLogin(), "Something went wrong...");

    }


}
