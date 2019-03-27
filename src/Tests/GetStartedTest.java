package Tests;

import lib.CoreTestCase;
import lib.ui.WelcomePageObject;
import org.junit.Test;

public class GetStartedTest extends CoreTestCase
{

    @Test
    public void testPassTroughWelcome()
    {
        if (this.platform.isAndroid()){
            return;
        }

        WelcomePageObject welcomePage = new WelcomePageObject(driver);

        welcomePage.waitForLearnMoreLink();
        welcomePage.clickNextButton();

        welcomePage.waitForNewWayToExploreText();
        welcomePage.clickNextButton();

        welcomePage.waitForAddOrEditPreferredLangText();
        welcomePage.clickNextButton();

        welcomePage.waitForLearnMoreAboutDataCollectionText();
        welcomePage.clickGetStartedButton();

    }
}
