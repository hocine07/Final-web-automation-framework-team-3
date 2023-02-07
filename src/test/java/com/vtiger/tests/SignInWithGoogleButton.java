package com.vtiger.tests;

import base.CommonAPI;
import com.vtiger.pages.HomePage;
import com.vtiger.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInWithGoogleButton extends CommonAPI {

    Logger LOG = LogManager.getLogger(SignInWithGoogleButton.class.getName());

    @Test

    public void signInWithGoogleEmailAddress (){

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());


        homePage.clickOnLoginButton();

        String title = getCurrentTitle();
        Assert.assertEquals(title, "Login - Vtiger");
        LOG.info("login title page validation success");

        loginPage.clickOnSignInButtonWithGoogle();
        String title2 = getCurrentTitle();
        Assert.assertEquals(title2, "Login - Vtiger");
        LOG.info("sign in with google page validation success");

    }
}
