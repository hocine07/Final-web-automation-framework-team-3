package com.freecrm.tests;

import base.CommonAPI;
import com.freecrm.pages.CalenderPage;
import com.freecrm.pages.HomePage;
import com.freecrm.pages.MyAccountPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalandar extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestLogin.class.getName());

    String email= "houfantas@gmail.com";
    String password= "Houhouhou8";

    @Test
    public void TestAddCalandar() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        MyAccountPage myAccountPage= new MyAccountPage(getDriver());
        CalenderPage calenderPage=new CalenderPage(getDriver());
        String expectedTitle= "Cogmento CRM";
        homePage.typeEmailAddress(email);
        homePage.typePassword(password);
        homePage.clickOnLogin();
        myAccountPage.clickOnCalender();
        calenderPage.clickOnManage();
        calenderPage.clickOnAddPlud();
        calenderPage.typeOnField("Birt");
        calenderPage.clickOnAddButton();
        Assert.assertTrue((calenderPage.Event).isDisplayed(),"test passed");
    }

}
