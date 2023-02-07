package com.vtiger.tests;

import base.CommonAPI;
import com.vtiger.pages.HomePage;
import com.vtiger.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends CommonAPI {

    Logger LOG = LogManager.getLogger(LoginTest.class.getName());

    @Test

    public void validEmailAddress (){

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());


        homePage.clickOnLoginButton();

        String title = getCurrentTitle();
        Assert.assertEquals(title, "Login - Vtiger");
        LOG.info("login title page validation success");

        loginPage.typeEmailAddress("t.mohammedi@yahoo.com");
        LOG.info("email address validation success");

        loginPage.clickOnPasswordField("tounsiam@17");
        LOG.info("password validation success");

        loginPage.clickOnSignInButton();
        LOG.info("sign in button validation success");

    }
}
