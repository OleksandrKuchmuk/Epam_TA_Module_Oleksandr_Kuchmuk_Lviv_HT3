package com.epam.AddToCart;

import com.epam.TestsBase.BaseTest;
import org.junit.Assert;
import org.junit.Test;

import static com.epam.Constants.Constant.Urls.USER_HOME_PAGE;

public class AddToCartTest extends BaseTest {

    @Test
    public void addToCart() {
        basePage.open(USER_HOME_PAGE);
        cableAndAdaptersPage
                .clickSearchbar()
                .inputTextToSearchBar("usb type c")
                .clickSearchButton()
                .chooseCategoryOfProduct()
                .chooseSpecificCable()
                .clickBuyButton()
                .clickBuPlusButtonInAlertWindow()
                .clickToOrderButtonInAlertWindow();
        String totalPriceExpected = "338";
        String totalPriceActual = cableAndAdaptersPage.getTotalPrice();
        Assert.assertEquals(totalPriceExpected, totalPriceActual);
        driver.quit();
    }
}