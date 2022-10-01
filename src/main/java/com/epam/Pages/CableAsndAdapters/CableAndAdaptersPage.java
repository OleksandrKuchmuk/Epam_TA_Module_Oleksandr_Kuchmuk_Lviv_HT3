package com.epam.Pages.CableAsndAdapters;

import com.epam.Pages.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CableAndAdaptersPage extends BasePage {

    private final By searchBar = By.xpath("//*[@id=\"input_search\"]");
    private final By searchButton = By.xpath("//button[@class='button-reset search-btn']");
    private final By checkboxCablesAndAdapters = By.xpath("//label[@for='fltr-category-733']");
    private final By chooseSpecificCable = By.xpath("//div[contains(text(), 'CATYS')]");
    private final By buyButton = By.xpath("//a[@class='main-btn main-btn--green main-btn--large']");
    private final By plusButtonOnAlertWindow = By.xpath("//span[@class='js_plus btn-count btn-count--plus ']");
    private final By toOrderButtonInAlertWindow = By.xpath("//a[@class='main-btn  main-btn--green']");
    private final By totalPriceField = By.xpath("//span[@id='total-price']");
    public CableAndAdaptersPage(WebDriver driver) {
        super(driver);
    }

    public CableAndAdaptersPage clickSearchbar() {
        driver.findElement(searchBar).click();
        return this;
    }

    public CableAndAdaptersPage inputTextToSearchBar(String search) {
        driver.findElement(searchBar).sendKeys(search);
        return this;
    }

    public CableAndAdaptersPage clickSearchButton() {
        driver.findElement(searchButton).click();
        return this;
    }

    public CableAndAdaptersPage chooseCategoryOfProduct() {
        driver.findElement(checkboxCablesAndAdapters).click();
        return this;
    }

    public CableAndAdaptersPage chooseSpecificCable() {
        driver.findElement(chooseSpecificCable).click();
        return this;
    }

    public CableAndAdaptersPage clickBuyButton() {
        driver.findElement(buyButton).click();
        return this;
    }

    public CableAndAdaptersPage clickBuPlusButtonInAlertWindow() {
        driver.switchTo().activeElement().findElement(plusButtonOnAlertWindow).click();
        return this;
    }

    public CableAndAdaptersPage clickToOrderButtonInAlertWindow() {
        driver.findElement(toOrderButtonInAlertWindow).click();
        return this;
    }

    public String getTotalPrice() {
        return driver.findElement(totalPriceField).getText();
    }
}