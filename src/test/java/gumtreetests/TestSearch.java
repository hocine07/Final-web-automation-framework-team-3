package gumtreetests;

import base.CommonAPI;
import gumtreepages.SearchPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearch extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestSearch.class.getName());

    @Test
    public void SearchCarsForSale() {
        SearchPage searchPage = new SearchPage(getDriver());

        String expectedTitle = "Gumtree | Free classified ads from the #1 classifieds site in the UK";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        LOG.info("land gumtree webpage success");


        searchPage.clickOnSearchButton();
        searchPage.typeItemToSearch("cars for sale");

        searchPage.typeAndEnter();


        String expectedTitle2 = "Gumtree | Free classified ads from the #1 classifieds site in the UK";
        String actualTitle2 = getCurrentTitle();
        Assert.assertEquals(actualTitle2, expectedTitle2);
        LOG.info("cars for sale search title validation success");
    }
}
