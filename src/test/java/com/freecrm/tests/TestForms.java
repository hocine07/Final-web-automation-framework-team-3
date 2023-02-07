package com.freecrm.tests;

import base.CommonAPI;
import com.freecrm.pages.FormsPage;
import com.freecrm.pages.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.checkerframework.checker.lock.qual.LockHeld;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.GenerateData;

public class TestForms extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestForms.class.getName());

    @Test
    public void testAddForm() throws InterruptedException {
        HomePage homePage= new HomePage(getDriver());
        homePage.typeEmailAddress("houfantas@gmail.com");
        homePage.typePassword("Houhouhou8");
        homePage.clickOnLogin();
        LOG.info("landing on free crm account success");
        homePage.clickOnForms();
        Thread.sleep(3000);
        FormsPage formsPage=  new FormsPage(getDriver());
        formsPage.clickOnAddButton();
        String name  = GenerateData.firstName();
        formsPage.typeOnNameField(name);
        formsPage.uncheckActiveBox();
        formsPage.clickOnSaveButton();
        LOG.info("adding new form success");

        Assert.assertTrue(formsPage.textName.isDisplayed());



    }






    @Test
    public void testDeleteForm() throws InterruptedException {
        HomePage homePage= new HomePage(getDriver());
        homePage.typeEmailAddress("houfantas@gmail.com");
        homePage.typePassword("Houhouhou8");

        homePage.clickOnLogin();
        LOG.info("landing on free crm account success");
        homePage.clickOnForms();
        Thread.sleep(3000);
        FormsPage formsPage=  new FormsPage(getDriver());
        formsPage.dropDownIcon("Delete");
        LOG.info("selecting delete option success");
        formsPage.clickOnConfirm();
        LOG.info("deleting form success");
        Assert.assertFalse(formsPage.form1.isDisplayed());






    }
}
