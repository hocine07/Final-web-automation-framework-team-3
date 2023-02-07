package com.vtiger.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChatBoxPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(ChatBoxPage.class.getName());

    public ChatBoxPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //objects

    @FindBy(xpath = "//img[@id='websense-chat-icon']")
    WebElement chatBox;

    @FindBy(xpath = "/html")
    WebElement messageField;

    @FindBy(xpath = "//*[@id=\"visitorForm\"]/div[2]/div[2]/div[4]/div[1]/input")
    WebElement NameField;

    @FindBy(xpath = "//*[@id=\"visitorForm\"]/div[2]/div[2]/div[4]/div[2]/input")
    WebElement emailAddressField;


    //reusable steps
    public void clickOnChatBoxButton() {
        clickOn(chatBox);
        LOG.info("click on ChatBox button success");
    }

    public void typeMessage(String message) {

        type(messageField);
        LOG.info("type message success");

    }

    private void type(WebElement messageField) {
    }

    public void enterName(String name) {
        type(NameField);
        LOG.info("enter name success");
    }

    public void typeEmailAddress(String emailAddress){
        type(emailAddressField);
        LOG.info("enter email address success ");
    }
}
