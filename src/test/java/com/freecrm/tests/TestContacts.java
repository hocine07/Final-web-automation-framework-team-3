package com.freecrm.tests;

import base.CommonAPI;
import com.freecrm.pages.ContactsPage;
import com.freecrm.pages.HomePage;
import com.freecrm.pages.MyAccountPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.GenerateData;

public class TestContacts extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestContacts.class.getName());



    @Test
    public void addContact() throws InterruptedException {
        HomePage homePage= new HomePage(getDriver());
        homePage.typeEmailAddress("houfantas@gmail.com");
        homePage.typePassword("Houhouhou8");
        homePage.clickOnLogin();
        LOG.info("landing on free crm account success");
        MyAccountPage myAccountPage=new MyAccountPage(getDriver());

        myAccountPage.clickOnContacts();
        Thread.sleep(3000);
        ContactsPage contactsPage=new ContactsPage(getDriver());
        contactsPage.clickOnCreate();
//        String firstName = GenerateData.password();
//        String lastName = GenerateData.firstName();
//        String emailAddress = GenerateData.lastName();

        contactsPage.typeFirstName("marcos");
        contactsPage.typeLastName("rach");
        contactsPage.typeEmailAddress("asdasdad");
        contactsPage.clickOnSaveContact();
        LOG.info("adding new contact success");
        Assert.assertTrue(contactsPage.marcosRach.isDisplayed(),"");







    }



}
