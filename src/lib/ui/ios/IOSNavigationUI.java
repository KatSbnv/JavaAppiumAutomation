package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.NavigationUI;

public class IOSNavigationUI extends NavigationUI {

    static {
        MY_LISTS_LINK ="xpath://XCUIElementTypeButton[@name='Saved']";
        CLOSE_SYNC_SAVED_ARTICLES_BTN = "xpath://XCUIElementTypeButton[@name='places auth close']";
    }

    public IOSNavigationUI(AppiumDriver driver){
        super(driver);
    }
}
