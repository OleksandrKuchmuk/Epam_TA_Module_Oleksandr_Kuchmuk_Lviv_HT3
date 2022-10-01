package com.epam.Pages.Listing;

import com.epam.Pages.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.epam.Constants.Constant.Counts.COUNT_CARDS_ON_PAGE;

public class AvicListingPage extends BasePage {

    private final By card = By.xpath("//div[@class = 'prod-cart height']");

    public AvicListingPage(WebDriver driver) {
        super(driver);
    }

    public AvicListingPage checkCountCards() {
        int countCard = driver.findElements(card).size();
        Assert.assertEquals(countCard, COUNT_CARDS_ON_PAGE);
        return this;
    }
}
