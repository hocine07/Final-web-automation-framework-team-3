package com.freecrm.tests;

import base.CommonAPI;
import com.freecrm.pages.AccountSetting;
import com.freecrm.pages.AddUserPage;
import com.freecrm.pages.HomePage;
import com.freecrm.pages.MyAccountPage;
import org.apache.commons.math3.analysis.function.Add;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.GenerateData;

public class TestUser extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestUser.class.getName());

    @Test
    public void addUser() throws InterruptedException {
        HomePage homePage= new HomePage(getDriver());
        LOG.info("Land on freecrm success");
        homePage.typeEmailAddress("houfantas@gmail.com");
        homePage.typePassword("Houhouhou8");
        homePage.clickOnLogin();
        LOG.info("login success");
        MyAccountPage myAccountPage=new MyAccountPage(getDriver());
        myAccountPage.clickOnSettingBtn();
        LOG.info("getting setting menu list success");
        myAccountPage.clickOnSettingMenuList("Settings");
        Thread.sleep(300);
        LOG.info("Clicking on settings success");
        AccountSetting accountSetting=new AccountSetting(getDriver());
        accountSetting.clickOnSettingOption("User Manager");
        LOG.info("clicking on user manager button success");

        Thread.sleep(300);
        accountSetting.clickOnAddBtn();
        LOG.info("clicking on add button success");
        String password = GenerateData.password();
        String firstName = GenerateData.firstName();
        String lastName = GenerateData.lastName();
        AddUserPage addUserPage= new AddUserPage(getDriver());
        addUserPage.typeFirstName(firstName);
        addUserPage.typeLastName(lastName);
        addUserPage.typeEmail(GenerateData.email());
        addUserPage.typePassword(password+"T");
        addUserPage.typePassword2(password+"T");
        addUserPage.clickOnSaveButton();
        LOG.info("saving the new user success");

        Assert.assertTrue(accountSetting.getAllUserName().contains(firstName+ " "+lastName));

    }



    @Test
    public void deleteUser() throws InterruptedException {
        HomePage homePage= new HomePage(getDriver());
        LOG.info("Land on freecrm success");
        homePage.typeEmailAddress("houfantas@gmail.com");
        homePage.typePassword("Houhouhou8");
        homePage.clickOnLogin();
        LOG.info("login success");
        MyAccountPage myAccountPage=new MyAccountPage(getDriver());
        myAccountPage.clickOnSettingBtn();
        LOG.info("getting setting menu list success");
        myAccountPage.clickOnSettingMenuList("Settings");
        Thread.sleep(300);
        LOG.info("Clicking on settings success");
        AccountSetting accountSetting=new AccountSetting(getDriver());
        accountSetting.clickOnSettingOption("User Manager");
        LOG.info("clicking on user manager button success");
        accountSetting.clickOnDeleteUserIcon();
        accountSetting.clickOnConfirmDelete();
        LOG.info("deleting user success");
        Assert.assertFalse((accountSetting.userTable).isDisplayed(),"test passed");



    }



    @Test
    public void editUser() throws InterruptedException {
        HomePage homePage= new HomePage(getDriver());
        LOG.info("Land on freecrm success");
        homePage.typeEmailAddress("houfantas@gmail.com");
        homePage.typePassword("Houhouhou8");
        homePage.clickOnLogin();
        LOG.info("login success");
        MyAccountPage myAccountPage=new MyAccountPage(getDriver());
        myAccountPage.clickOnSettingBtn();
        LOG.info("getting setting menu list success");
        myAccountPage.clickOnSettingMenuList("Settings");
        Thread.sleep(300);
        LOG.info("Clicking on settings success");
        AccountSetting accountSetting=new AccountSetting(getDriver());
        accountSetting.clickOnSettingOption("User Manager");
        LOG.info("clicking on user manager button success");

        accountSetting.clickOnEditUserIcon();
        AddUserPage addUserPage=new AddUserPage(getDriver());
        addUserPage.typeFirstName("houssine");
        addUserPage.clickOnSaveButton();
        LOG.info("editing the user name success");
        Assert.assertEquals(addUserPage.getTextFromElement(addUserPage.lhouHoussine),"houssine Hou");


    }

}
