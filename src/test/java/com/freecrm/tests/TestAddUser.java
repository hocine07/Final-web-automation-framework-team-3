package com.freecrm.tests;

import base.CommonAPI;
import com.freecrm.pages.AccountSetting;
import com.freecrm.pages.HomePage;
import com.freecrm.pages.MyAccountPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class TestAddUser extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestLogin.class.getName());

    @Test
    public void addUser() throws InterruptedException {
        HomePage homePage= new HomePage(getDriver());
        LOG.info("Land on freecrm success");
        homePage.typeEmailAddress("Lhoucoutinho@gmail.com");
        homePage.typePassword("Houhouhou8");
        homePage.clickOnLogin();
        LOG.info("login success");
        MyAccountPage myAccountPage=new MyAccountPage(getDriver());
        myAccountPage.clickOnSettingBtn();
        myAccountPage.clickOnSettingMenuList("Settings");
        Thread.sleep(300);
        LOG.info("Clicking on settings success");
        AccountSetting accountSetting=new AccountSetting(getDriver());
        accountSetting.clickOnSettingOption("User Manager");
        LOG.info("clicking on user manager button success");

        Thread.sleep(300);
        accountSetting.clickOnAddBtn();
        LOG.info("clicking on add button success");



    }

}