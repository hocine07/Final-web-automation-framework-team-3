package gumtreetests;

import base.CommonAPI;
import gumtreepages.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogoIcon extends CommonAPI {
    Logger LOG = LogManager.getLogger(gumtreetests.TestLogoIcon.class.getName());

    @Test
    public void LogoIcon() {
        HomePage homePage = new HomePage();

        String expectedTitle = "TCF Locator";
        String actualTitle = "";
        Assert.assertEquals(actualTitle, expectedTitle);
        LOG.info("HomePage popup success");


        homePage.clickOnLogoIcon();



    }


}









