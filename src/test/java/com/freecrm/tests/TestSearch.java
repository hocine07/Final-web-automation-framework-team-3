package com.freecrm.tests;

import base.CommonAPI;
import com.freecrm.pages.HomePage;
import com.freecrm.pages.MyAccountPage;
import com.freecrm.pages.SearchResultPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearch extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestSearch.class.getName());




    @Test
    public void TestSearch(){
        HomePage homePage= new HomePage(getDriver());
        SearchResultPage search= new SearchResultPage(getDriver());
        LOG.info("landi on free crm success");
        homePage.typeEmailAddress("houfantas@gmail.com");
        homePage.typePassword("Houhouhou8");
        homePage.clickOnLogin();
        LOG.info("login in to free crm success");
        MyAccountPage myAccountPage=new MyAccountPage(getDriver());
        myAccountPage.typeOnSearchBar("maiden");
        LOG.info("searching for maiden success");

        Assert.assertTrue(search.searchResult.getText().contains("maiden"),"");

    }
}
