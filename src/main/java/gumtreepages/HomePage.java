package gumtreepages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {

    Logger LOG = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//header/nav[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[2]/*[1]")
    WebElement LogoIcon;

    @FindBy (xpath = "//header/nav[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[2]/button[1]/span[1]")
    WebElement loginButton;

    @FindBy (xpath = "/html")
    WebElement scrollBox;


    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[1]/a[1]")
    WebElement NavigationBar;

    public HomePage(Object hetDriver) {
        super();
    }


    //reusable steps

    public void clickOnLogoIcon(){
        clickOn(LogoIcon);
        LOG.info("HomePage popup success");
    }


    public void clickOnLoginButton(){
        clickOn(loginButton);
        LOG.info("click on login button success");
    }

    public void clickOnScrollBox(){
        clickOn(scrollBox);
        LOG.info("ScrollBox scroll down success");
    }


    public void hoverOverNavigationBar(){
        hoverOver(driver, NavigationBar);
        LOG.info("hover over NavigationBar success");
    }


    public void clickOnJobs() {
    }
}
