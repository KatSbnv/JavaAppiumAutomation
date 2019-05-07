package lib.ui;

import io.appium.java_client.AppiumDriver;

abstract public class NavigationUI  extends MainPageObject{

     protected static  String
        MY_LISTS_LINK,
        CLOSE_SYNC_SAVED_ARTICLES_BTN;


    public  NavigationUI (AppiumDriver driver)
    {
        super(driver);
    }

    public void clickMyLists()
    {
        this.waitForElementAndClick(
                MY_LISTS_LINK,
                "Cannot find navigation button to My list",
                5
        );

    }
    public void clickToClosePopUp(){
        this.waitForElementAndClick(
                CLOSE_SYNC_SAVED_ARTICLES_BTN,
                "cannot find button to close pop up of sync articles",
                5
        );
    }
}
