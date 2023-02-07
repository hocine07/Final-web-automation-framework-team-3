package com.vtiger.tests;

import base.CommonAPI;
import com.vtiger.pages.SearchPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearch extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestSearch.class.getName());

    @Test

    public void searchJiraVideos() {
        SearchPage searchPage = new SearchPage(getDriver());

        String expectedTitle = "CRM Software: Customer Relationship Management | Vtiger CRM";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        LOG.info("land vtiger webpage success");


        searchPage.clickOnSearchButton();
        searchPage.typeItemToSearch("jira video");

        searchPage.typeAndEnter();



        String expectedTitle2 = "CRM Software: Customer Relationship Management | Vtiger CRM";
        String actualTitle2 = getCurrentTitle();
        Assert.assertEquals(actualTitle2, expectedTitle2);
        LOG.info("jira videos  search title validation success");
    }
}
