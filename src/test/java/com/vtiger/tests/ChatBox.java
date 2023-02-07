package com.vtiger.tests;

import base.CommonAPI;
import com.vtiger.pages.ChatBoxPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChatBox extends CommonAPI {
    Logger LOG = LogManager.getLogger(ChatBoxPage.class.getName());
    @Test
    public void chatBoxWithEmailAddress() {
        ChatBoxPage chatBoxPage = new ChatBoxPage(getDriver());

        String expectedTitle = "CRM Software: Customer Relationship Management | Vtiger CRM";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        LOG.info("chat box validation success");

        chatBoxPage.clickOnChatBoxButton();
        String message = "hello";
        chatBoxPage.typeMessage(message);
        String name = "tounsia";
        chatBoxPage.enterName(name);
        String emailAddress = "t.mohgammedi@yahoo.com";
        chatBoxPage.typeEmailAddress(emailAddress);
    }

}
