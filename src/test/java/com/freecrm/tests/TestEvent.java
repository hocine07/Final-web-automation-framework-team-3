package com.freecrm.tests;

import base.CommonAPI;
import com.freecrm.pages.CalenderPage;
import com.freecrm.pages.HomePage;
import com.freecrm.pages.MyAccountPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEvent extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestEvent.class.getName());

    String email= "houfantas@gmail.com";
    String password= "Houhouhou8";

    String eventName = "mariage";
    @Test
    public void testAddEvent() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        MyAccountPage myAccountPage= new MyAccountPage(getDriver());
        CalenderPage calenderPage=new CalenderPage(getDriver());
        String expectedTitle= "Cogmento CRM";
        homePage.typeEmailAddress(email);
        homePage.typePassword(password);
        homePage.clickOnLogin();
        LOG.info("landing on free crm account success");
        myAccountPage.clickOnCalender();
        calenderPage.clickOnCreateEventBtn();
        // application behavior problem so refresh
        getDriver().navigate().refresh();
        calenderPage.setInputEventName(eventName);
        calenderPage.clickOnSaveBtn();
        LOG.info("creating new event success");
        Assert.assertEquals(calenderPage.getEventName(),eventName);
    }
}
