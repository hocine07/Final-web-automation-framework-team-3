package gumtreepages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SellPage extends CommonAPI {


    Logger LOG = LogManager.getLogger(SellPage.class.getName());

    public SellPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[@id=\"content\"]/header/nav/div/div/div/div[2]/button[2]/span")
    WebElement SellButton;


    //reusable steps
    public void SellButton(){
        clickOn(SellButton);
        LOG.info("item name typed success");
    }








}