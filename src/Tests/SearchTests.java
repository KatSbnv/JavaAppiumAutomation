package Tests;

import lib.CoreTestCase;
import lib.ui.SearchPageObject;
import lib.ui.factories.SearchPageObjectFactory;
import org.junit.Test;

public class SearchTests extends CoreTestCase {

    @Test

    public void testSearch() {


        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);

        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine("Java");
        SearchPageObject.waitForSearchResult("Java (programming language)");
    }

    @Test

    public void testCancelSearch() {

        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);

        SearchPageObject.initSearchInput();
        SearchPageObject.waitForCancelButtonToAppear();
        SearchPageObject.clickCancelSearch();
        SearchPageObject.waitForCancelButtonToDisappear();

    }


    @Test
    public void testAmountOnNotEmptySearch() {

        SearchPageObject searchPageObject = SearchPageObjectFactory.get(driver);

        searchPageObject.initSearchInput();
        String search_line = "Linkin Park Discography";
        searchPageObject.typeSearchLine(search_line);
        searchPageObject.getAmountOfFoundArticles();

        int amount_of_search_results = searchPageObject.getAmountOfFoundArticles();

        assertTrue(
                "We found too few results!",
                amount_of_search_results > 0
        );
    }

    @Test
    public void testAmountOfEmptySearch() {

        SearchPageObject searchPageObject = SearchPageObjectFactory.get(driver);

        searchPageObject.initSearchInput();
        String search_line = "jficnlsdlvfv";
        searchPageObject.typeSearchLine(search_line);

//        String search_result_locator = "//*[@resource-id ='org.wikipedia:id/search_results_list']/*[@resource-id='org.wikipedia:id/page_list_item_container']";

        searchPageObject.waitForEmptyResultLabel();
        searchPageObject.assertThereIsNoResultOfSearch();


    }
}
