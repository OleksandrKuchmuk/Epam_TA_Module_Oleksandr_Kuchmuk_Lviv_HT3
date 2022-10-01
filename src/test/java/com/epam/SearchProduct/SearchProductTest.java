package com.epam.SearchProduct;

import com.epam.TestsBase.BaseTest;
import org.junit.Test;

import static com.epam.Constants.Constant.Urls.AVIC_HOME_PAGE;

public class SearchProductTest extends BaseTest {

    @Test
    public void chekIsRedirectToListing() {
        basePage.open(AVIC_HOME_PAGE);
        avicHomePage
                .chooseSearchBar()
                .enterProductToSearch("Телевізор")
                .clickToSearchButton();
        avicListingPage.checkCountCards();
        driver.quit();
    }
}