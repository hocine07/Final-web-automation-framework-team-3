package com.freecrm.tests;

import base.CommonAPI;
import com.freecrm.pages.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ReadFromExcel;

import java.io.File;

public class TestPayment extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestPayment.class.getName());


    String path = System.getProperty("user.dir")+ File.separator +"data" + File.separator + "titles.xlsx";
    ReadFromExcel read = new ReadFromExcel(path, "pay info");

    String name= read.getDataFromCell(1,0);
    String cardNum = read.getDataFromCell(1,1);

    String expDate= read.getDataFromCell(1,2);

    String cvv= read.getDataFromCell(1,3);
    String address= read.getDataFromCell(1,4);
    String city= read.getDataFromCell(1,5);

    String country= read.getDataFromCell(1,6);

   String postCode=read.getDataFromCell(1,7);



    String email= "houfantas@gmail.com";
    String password= "Houhouhou8";
    @Test
    public void testPayingWithDebitCard(){
        HomePage homePage = new HomePage(getDriver());
        MyAccountPage myAccountPage= new MyAccountPage(getDriver());

        String expectedTitle= "Cogmento CRM";
        homePage.typeEmailAddress(email);
        homePage.typePassword(password);
        homePage.clickOnLogin();
        LOG.info("land on free crm home page success");
        myAccountPage.clickOnSettingBtn();
        myAccountPage.clickOnSettingMenuList("Settings");
        AccountSetting accountSetting=new AccountSetting(getDriver());
        accountSetting.clickOnSettingOption("Billing Manager");
        LOG.info("clicking on billing manager success");

        BillingManagerPage billingManagerPage=new BillingManagerPage(getDriver());
        billingManagerPage.clickOnPayWithDebitOrCredit();
        LOG.info("landig on debit card form success");

        billingManagerPage.typeOnCardName(name);
        billingManagerPage.typeOnCardNum(cardNum);
        billingManagerPage.typeOnExpDate(expDate);
        billingManagerPage.typeOnCvvField(cvv);
        billingManagerPage.typeOnAddressField(address);
        billingManagerPage.typeOnCityField(city);
        billingManagerPage.typeOnStateField(country);
        billingManagerPage.typeOnPostCodeField(postCode);
        billingManagerPage.clickOnSaveBtn();
        LOG.info("invalid car information");
        Assert.assertTrue(billingManagerPage.confirmationMessage.isDisplayed(),"");



    }

}
