package com.vtiger.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends CommonAPI {

    Logger LOG = LogManager.getLogger(SearchPage.class.getName());


    public SearchPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//span[@id='search']")

    WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"searchsub\"]/div/input[1]")

    WebElement searchBar;




    //reusable steps

    public void clickOnSearchButton(){
        clickOn(searchButton);
        LOG.info("click search success");
    }
    public  void typeItemToSearch(String item){
        type(searchBar,item);
        LOG.info("item name typed success");
    }

    public void typeAndEnter() {
    }
}
