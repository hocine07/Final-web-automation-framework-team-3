package com.freecrm.tests;

import base.CommonAPI;
import com.freecrm.pages.FormsPage;
import com.freecrm.pages.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestForms extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestLogin.class.getName());

    @Test
    public void testFormsFunction() throws InterruptedException {
        HomePage homePage= new HomePage(getDriver());
        homePage.typeEmailAddress("houfantas@gmail.com");
        homePage.typePassword("Houhouhou8");
        homePage.clickOnLogin();
        homePage.clickOnForms();
        Thread.sleep(3000);
        FormsPage formsPage=  new FormsPage(getDriver());
        formsPage.dropDownIcon("Delete");
        formsPage.clickOnConfirm();

        LOG.info("");




    }
}
