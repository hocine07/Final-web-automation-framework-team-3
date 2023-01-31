package gumtreetests;

import base.CommonAPI;
import gumtreepages.HomePage;
import org.jetbrains.annotations.Nullable;
import org.testng.annotations.Test;

public class TestBrowser extends CommonAPI {




    @Test
    public void test1() throws InterruptedException {

        HomePage homePage = new HomePage (getDriver());

        Thread.sleep(300);
        System.out.println("landed on homepage success");

    }




}

   
