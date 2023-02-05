package com.freecrm.tests;

import base.CommonAPI;
import com.freecrm.pages.DocumentsPage;
import com.freecrm.pages.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class TestDocuments extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestLogin.class.getName());


    @Test
    public void TestAddingDocuments() throws InterruptedException {
        HomePage homePage= new HomePage(getDriver());
        homePage.typeEmailAddress("houfantas@gmail.com");
        homePage.typePassword("Houhouhou8");
        homePage.clickOnLogin();

        homePage.clickOnDocuments();
        Thread.sleep(3000);

        DocumentsPage addDocumentsPage=new DocumentsPage(getDriver());
        addDocumentsPage.clickOnNewFolder();
        Thread.sleep(300);
        addDocumentsPage.typeOnNameField("lhou");
        Thread.sleep(300);
        addDocumentsPage.clickOnSave();
        Thread.sleep(300);

    }


    @Test
    public void deleteDocument() throws InterruptedException {
        HomePage homePage= new HomePage(getDriver());
        homePage.typeEmailAddress("houfantas@gmail.com");
        homePage.typePassword("Houhouhou8");
        homePage.clickOnLogin();

        homePage.clickOnDocuments();
        Thread.sleep(3000);

        DocumentsPage documentsPage=new DocumentsPage(getDriver());
        documentsPage.clickOnLhouFolder();

        documentsPage.clickOnDeleteFolderOption();
        Thread.sleep(300);
        documentsPage.clickOnRedDeleteFolderBtn();
        Thread.sleep(300);


    }
}
