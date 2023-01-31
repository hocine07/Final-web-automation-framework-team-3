package com.freecrm.tests;

import base.CommonAPI;
import com.freecrm.pages.HomePage;
import com.freecrm.pages.MyAccountPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogOut extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestLogin.class.getName());


    @Test
    public void logOut(){
        HomePage homePage= new HomePage(getDriver());
        LOG.info("landing on freecrem success");
        homePage.typeEmailAddress("Lhoucoutinho@gmail.com");
        homePage.typePassword("Houhouhou8");
        homePage.clickOnLogin();
        LOG.info("login in success");
        MyAccountPage myAccountPage=new MyAccountPage(getDriver());
        myAccountPage.clickOnSettingBtn();
        myAccountPage.clickOnSettingMenuList("Log Out");
        LOG.info("login out success");
        Assert.assertEquals(getCurrentTitle(),"Cogmento CRM");


    }
}