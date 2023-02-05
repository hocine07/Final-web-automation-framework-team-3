package com.freecrm.tests;

import base.CommonAPI;
import com.freecrm.pages.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.sql.DriverManager.getDriver;

public class TestLogin extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestLogin.class.getName());

    String email= "houfantas@gmail.com";
    String password= "Houhouhou8";

    @Test
    public void ValidEmailAddress() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        String expectedTitle= "Cogmento CRM";
        homePage.typeEmailAddress(email);

        homePage.typePassword(password);

        homePage.clickOnLogin();
        LOG.info("login in success");
        Thread.sleep(300);


        Assert.assertEquals(getCurrentTitle(),"Cogmento CRM");



    }


    String email2 = "kasgdkagd@gmail.com";
    String password2 = "houdasjjdhlas";

    @Test
    public void InvalidLogin() {
        HomePage homePage = new HomePage(getDriver());
        homePage.typeEmailAddress(email2);

        homePage.typePassword(password2);

        homePage.clickOnLogin();
        LOG.info("login in failed");


        Assert.assertEquals(homePage.getErrorLogin(), "Something went wrong...");

    }


}
