package gumtreetests;

import base.CommonAPI;
import gumtreepages.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNavigationBar extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestSearch.class.getName());
    @Test
    public void navigationBar() {
        HomePage homePage = new HomePage(getDriver());

        String expectedTitle = "Gumtree | Free classified ads from the #1 classifieds site in the UK";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        LOG.info("land on gumtree webpage success");

        homePage.hoverOverNavigationBar();
        homePage.clickOnJobs();

    }


}



