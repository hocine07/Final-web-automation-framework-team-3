package com.vtiger.tests;

import base.CommonAPI;
import com.vtiger.pages.ResourcesPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CollaborationCategory extends CommonAPI {

    Logger LOG = LogManager.getLogger(CollaborationCategory.class.getName());

    @Test

    public void collaborationCategoryTest(){

        ResourcesPage resourcesPage = new ResourcesPage(getDriver());

        resourcesPage.clickOnResourcesMenu();
        resourcesPage.clickOnBlogOption();

        String expectedTitle = "Vtiger CRM Blog";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        LOG.info("land to blog page validation success");

        resourcesPage.clickOnCollaborationOption();

        String expectedTitle2 = "Vtiger CRM Blog » Collaboration";
        String actualTitle2 = getCurrentTitle();
        Assert.assertEquals(actualTitle2, expectedTitle2);
        LOG.info("collaboration page validation success");

    }

}
