import lib.CoreTestCase;

public class FirstTest extends CoreTestCase {


//private MainPageObject MainPageObject;

//protected void setUp() throws Exception
//{
//    super.setUp();
//
//    MainPageObject = new MainPageObject(driver);
//}



//        MainPageObject.waitForElementAndClick(
//                By.xpath("//*[contains(@text,'Search Wikipedia')]"),
//                "Cannot find 'Search Wikipedia' input'",
//                5
//        );
//        MainPageObject.waitForElementAndSendKeys( // вбиваем слово Java в поисковой строке
//                By.xpath("//*[contains(@text,'Search…')]"),
//                "Java",
//                "Cannot find search input",
//                5
//        );
//        MainPageObject.waitForElementAndClick(
//                By.xpath("//*[@resource-id='org.wikipedia:id/page_list_item_container']//*[@text='Object-oriented programming language']"),
//                "Cannot find 'Search Wikipedia' input'",
//                5
//        );
//        MainPageObject.waitForElementPresent(
//                By.id("org.wikipedia:id/view_page_title_text"),
//                "Cannot find article Title",
//                15
//        );
//        MainPageObject.waitForElementAndClick(
//                By.xpath("//android.widget.ImageView[@content-desc='More options']"),
//                 "Cannot find options button",
//                5
//        );
//        MainPageObject.waitForElementAndClick(
//                By.xpath("//*[@text='Add to reading list']"),
//                "Cannot find option, which adding to reading list",
//                5
//        );
//        MainPageObject.waitForElementAndClick(
//                By.id("org.wikipedia:id/onboarding_button"),
//                "Cannot find green button 'Got it' on the overlay",
//                5
//        );
//        MainPageObject.waitForElementAndClear(
//                By.id("org.wikipedia:id/text_input"),
//                "Cannot find where I should clear the text",
//                5
//        );
//
//        MainPageObject.waitForElementAndSendKeys(
//                By.id("org.wikipedia:id/text_input"),
//                name_of_folder,
//                "Cannot put the text into folder",
//                5
//        );
//
//        MainPageObject.waitForElementAndClick(
//                By.xpath("//*[@text='OK']"),
//                "Cannot click button OK",
//                5
//        );
//        MainPageObject.waitForElementAndClick(
//                By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']"),
//                "Cannot click X button",
//                5
//        );
//        MainPageObject.waitForElementAndClick(
//                By.xpath("//android.widget.FrameLayout[@content-desc='My lists']"),
//                "Cannot find navigation button to My list",
//                5
//        );
//        MainPageObject.waitForElementAndClick(
//                By.xpath("//*[@text='" + name_of_folder +  "']"),
//                "Cannot find created folder",
//                5
//        );
//
//        MainPageObject.swipeElementLeft(
//                By.xpath("//*[@text='Java (programming language)']"),
//                "Cannot find saved article"
//        );
//        MainPageObject.waitForElementNotPresent(
//                By.xpath("//*[@text='Java (programming language)']"),
//                "Cannot delete saved article",
//                5
//        );






//        MainPageObject.waitForElementAndClick(
//                By.xpath("//*[contains(@text,'Search Wikipedia')]"),
//                "Cannot find 'Search Wikipedia' input'",
//                5
//        );
//
//        String  search_line = "Linkin Park Discography";
//        MainPageObject.waitForElementAndSendKeys( // вбиваем слово Java в поисковой строке
//                By.xpath("//*[contains(@text,'Search…')]"),
//                search_line ,
//                "Cannot find search input",
//                5
//        );
//
//        String search_result_locator = "//*[@resource-id ='org.wikipedia:id/search_results_list']/*[@resource-id='org.wikipedia:id/page_list_item_container']";
//
//        MainPageObject.waitForElementPresent(
//                By.xpath(search_result_locator),
//                "Cannot find anything by the request " + search_line,
//                15
//        );
//
//        int amount_of_search_results = MainPageObject.getAmountOfElements(
//                By.xpath(search_result_locator)
//        );


//        MainPageObject.waitForElementAndClick(
//                By.xpath("//*[contains(@text,'Search Wikipedia')]"),
//                "Cannot find 'Search Wikipedia' input'",
//                5
//        );
//
//        String  search_line = "kdkjfhhohnm";
//        MainPageObject.waitForElementAndSendKeys( // вбиваем слово Java в поисковой строке
//                By.xpath("//*[contains(@text,'Search…')]"),
//                search_line ,
//                "Cannot find search input",
//                5
//        );
//
//        String search_result_locator = "//*[@resource-id ='org.wikipedia:id/search_results_list']/*[@resource-id='org.wikipedia:id/page_list_item_container']";
//        String empty_result_label = "//*[@text='No results found']";
//
//        MainPageObject.waitForElementPresent(
//                By.xpath(empty_result_label),
//                "Cannot find empty result label by the request " + search_line,
//                15
//        );
//
//        MainPageObject.assertElementNotPresent(
//                By.xpath(search_result_locator),
//                "We've found some results by request " + search_line
//        );






//        MainPageObject.waitForElementAndClick(
//                By.xpath("//*[contains(@text,'Search Wikipedia')]"),
//                "Cannot find 'Search Wikipedia' input'",
//                5
//        );
//        String  search_line = "Java";
//        MainPageObject.waitForElementAndSendKeys( // вбиваем слово Java в поисковой строке
//                By.xpath("//*[contains(@text,'Search…')]"),
//                search_line ,
//                "Cannot find search input",
//                5
//        );
//        MainPageObject.waitForElementAndClick(
//                By.xpath("//*[@resource-id='org.wikipedia:id/page_list_item_container']//*[@text='Object-oriented programming language']"),
//                "Cannot find 'Object-oriented programming language' topic searching by " + search_line,
//                15
//        );
//
//        String title_before_rotation = MainPageObject.waitForElementAndGetAttribute(
//                By.id("org.wikipedia:id/view_page_title_text"),
//                "text",
//                "cannot find title of article",
//                15
//        );
//
//        driver.rotate(ScreenOrientation.LANDSCAPE);
//
//        String title_after_rotation = MainPageObject.waitForElementAndGetAttribute(
//                By.id("org.wikipedia:id/view_page_title_text"),
//                "text",
//                "cannot find title of article",
//                15
//        );

//        assertEquals(
//                "Article title have been changed after screen rotation",
//                title_before_rotation,
//                title_after_rotation
//        );
//
//        driver.rotate(ScreenOrientation.PORTRAIT);
//
//        String title_after_second_rotation = MainPageObject.waitForElementAndGetAttribute(
//                By.id("org.wikipedia:id/view_page_title_text"),
//                "text",
//                "cannot find title of article",
//                15
//        );
//
//        Assert.assertEquals(
//                "Article title have been changed after screen rotation",
//                title_before_rotation,
//                title_after_second_rotation
//        );








//        MainPageObject.waitForElementAndClick(
//                By.xpath("//*[contains(@text,'Search Wikipedia')]"),
//                "Cannot find 'Search Wikipedia' input'",
//                5
//        );
//
//        MainPageObject.waitForElementAndSendKeys( // вбиваем слово Java в поисковой строке
//                By.xpath("//*[contains(@text,'Search…')]"),
//                "Java",
//                "Cannot find search input",
//                5
//        );
//
//        MainPageObject.waitForElementPresent(
//                By.xpath("//*[@resource-id='org.wikipedia:id/page_list_item_container']//*[@text='Object-oriented programming language']"),
//                "Cannot find 'Search Wikipedia' input",
//                5
//        );
//
//        driver.runAppInBackground(2);
//
//        MainPageObject.waitForElementPresent(
//                By.xpath("//*[@resource-id='org.wikipedia:id/page_list_item_container']//*[@text='Object-oriented programming language']"),
//                "Cannot find article",
//                5
//        );






}
