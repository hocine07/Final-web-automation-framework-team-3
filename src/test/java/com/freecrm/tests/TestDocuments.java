package com.freecrm.tests;

import base.CommonAPI;
import com.freecrm.pages.DocumentsPage;
import com.freecrm.pages.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDocuments extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestDocuments.class.getName());


    @Test
    public void TestAddingDocuments() throws InterruptedException {
        HomePage homePage= new HomePage(getDriver());
        homePage.typeEmailAddress("houfantas@gmail.com");
        homePage.typePassword("Houhouhou8");
        homePage.clickOnLogin();
        LOG.info("landing on free crm account success");
        homePage.clickOnDocuments();
        Thread.sleep(3000);

        DocumentsPage addDocumentsPage=new DocumentsPage(getDriver());
        addDocumentsPage.clickOnNewFolder();
        Thread.sleep(300);
        addDocumentsPage.typeOnNameField("lhou");
        Thread.sleep(300);
        addDocumentsPage.clickOnSave();
        Thread.sleep(300);
        LOG.info("creating new document success");
        Assert.assertTrue(addDocumentsPage.lhouDocument.isDisplayed(),"");


    }


    @Test
    public void deleteDocument() throws InterruptedException {
        HomePage homePage= new HomePage(getDriver());
        homePage.typeEmailAddress("houfantas@gmail.com");
        homePage.typePassword("Houhouhou8");
        homePage.clickOnLogin();
        LOG.info("landing on free crm account success");
        homePage.clickOnDocuments();
        Thread.sleep(3000);

        DocumentsPage documentsPage=new DocumentsPage(getDriver());
        documentsPage.clickOnLhouFolder();

        documentsPage.clickOnDeleteFolderOption();
        Thread.sleep(300);
        documentsPage.clickOnRedDeleteFolderBtn();
        Thread.sleep(300);
        LOG.info("deleting document success");
        Assert.assertFalse(documentsPage.lhouDocument.isDisplayed(),"no document was found");


    }
}
