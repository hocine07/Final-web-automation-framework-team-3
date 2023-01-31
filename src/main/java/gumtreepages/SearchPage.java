package gumtreepages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends CommonAPI {

    static Logger LOG = LogManager.getLogger(SearchPage.class.getName());

    public SearchPage(WebDriver driver){
        PageFactory.initElements(driver, this);
}



    @FindBy(xpath = "//input[@id='header-search-q']")
    WebElement searchBar;

    @FindBy (xpath = "//header/div[1]/nav[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/button[1]/span[2]")
    WebElement searchButton;








    //reusable steps
    public void typeItemToSearch(String item){
        type(searchBar, item);
        LOG.info("item name typed success");
    }

    public void clickOnSearchButton(){
        clickOn(searchButton);
        LOG.info("click search success");
    }


    public void typeAndEnter() {
    }
}
