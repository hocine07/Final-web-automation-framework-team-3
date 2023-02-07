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
        calenderPage.clickOnManage(getDriver());
        calenderPage.clickOnAddPlus();
        calenderPage.typeOnField("Birt");
        calenderPage.clickOnAddButton(getDriver());
        Assert.assertTrue((calenderPage.event).isDisplayed(),"test passed");
    }


    @Test
    public void TestDeleteCalendar() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        CalenderPage calenderPage = new CalenderPage(getDriver());
        String expectedTitle = "Cogmento CRM";
        homePage.typeEmailAddress(email);
        homePage.typePassword(password);
        homePage.clickOnLogin();
        myAccountPage.clickOnCalender();
        calenderPage.clickOnManage(getDriver());
        calenderPage.deleteBirthEvent();

        calenderPage.deleteBtn();
        Assert.assertFalse((calenderPage.event).isDisplayed(),"test passed");
    }
    @Test
    public void testEditCalendar() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        CalenderPage calenderPage = new CalenderPage(getDriver());
        String expectedTitle = "Cogmento CRM";
        homePage.typeEmailAddress(email);
        homePage.typePassword(password);
        homePage.clickOnLogin();
        myAccountPage.clickOnCalender();
        calenderPage.clickOnManage(getDriver());
        calenderPage.editCalendar("Birth","meeting");
        Assert.assertEquals(calenderPage.event2.getText(),"meeting");
    }
}
