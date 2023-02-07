package com.freecrm.tests;

import base.CommonAPI;
import com.freecrm.pages.AccountSetting;
import com.freecrm.pages.HomePage;
import com.freecrm.pages.MyAccountPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPhoneNumber extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestPhoneNumber.class.getName());



    @Test
    public void testPhoneNumberUpdate(){
        HomePage homePage= new HomePage(getDriver());
        LOG.info("Land on freecrm success");
        homePage.typeEmailAddress("houfantas@gmail.com");
        homePage.typePassword("Houhouhou8");
        homePage.clickOnLogin();
        LOG.info("login in to free crm account success");



        MyAccountPage myAccountPage=new MyAccountPage(getDriver());
        myAccountPage.clickOnSettingBtn();
        LOG.info("getting setting menu list success");
        myAccountPage.clickOnSettingMenuList("Settings");

        AccountSetting accountSetting=new AccountSetting(getDriver());
        accountSetting.clickOnSettingOption("Accounts");
        LOG.info("selecting the Accounts option success");
        accountSetting.setAccountsList("Telephony Account");
        LOG.info("clickin on Telephony Account option success");
        accountSetting.typeOnPhoneNumberField("12312312312");
        accountSetting.clickOnUpdateAndVerifyNumber();
        LOG.info("updating phone number success");
        Assert.assertTrue(accountSetting.verificationCode.isDisplayed(),"message displayed successfully");
    }



}

