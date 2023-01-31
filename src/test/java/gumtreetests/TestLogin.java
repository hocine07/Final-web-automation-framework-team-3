package gumtreetests;

import base.CommonAPI;
import gumtreepages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestLogin extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestSearch.class.getName());

    @Test

    public void validEmailAddress (String emailAdress, String clickOnPasswordField){

        LoginPage loginPage = new LoginPage(getDriver());


        loginPage.clickOnLoginButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Gumtree | Free classified ads from the #1 classifieds site in the UK");
        LOG.info("login title page validation success");


        loginPage.typeEmailAddress(emailAdress);
        loginPage.clickOnPasswordField(clickOnPasswordField);
        loginPage.clickOnLoginButton();



    }


}