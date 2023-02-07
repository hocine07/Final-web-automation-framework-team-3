package com.freecrm.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyAccountPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(MyAccountPage.class.getName());

    public MyAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }





    @FindBy(xpath = "//div[@class='ui basic button floating item dropdown']")
    public WebElement settingBtn;



    @FindBy(xpath = "//div[@class='ui inverted transparent left icon input']/input")
    public WebElement searchBar;



    @FindBy(xpath = "//a[@role='option']")
    List<WebElement> settingMenuList;



    @FindBy(xpath = "//div[@id='main-nav']//a")
    public List<WebElement>  listMenu;


    @FindBy(xpath = "//a/span[text()='Calendar']")
    public WebElement calendarBtn;


    @FindBy(xpath = "//div[@class='ui left fixed vertical  icon menu sidebar-dark left-to-right']")
    public List<WebElement> homeMenu;



    @FindBy(xpath ="//span[text()='Contacts']")
    public WebElement contactBtn;











    public void clickOnSettingBtn() {
        clickOn(settingBtn);
    }

    public void clickOnMenu(String option){
        for(WebElement element: listMenu){
            if(element.getText().equals(option)){

                clickOn(element);
                break;
            };
        }

    }

    public void clickOnCalender() throws InterruptedException {
        Thread.sleep(3000);
        clickOnMenu("Calendar");

    }





    public void clickOnSettingMenuList(String list){
        for(WebElement element: settingMenuList){
            if(element.getText().equals(list));
            clickOn(element);
            break;
        }
    }



    public void typeOnSearchBar(String name){
        typeAndEnter(searchBar,name);
    }




//        public void clickOnContactsFromHomeMenu(String button){
//        for(WebElement element: homeMenu){
//                    if(element.getText().equals(button));
//                    clickOn(element);
//                    break;
//                }


    public void clickOnContacts(){
        clickOn(contactBtn);
    }
}












