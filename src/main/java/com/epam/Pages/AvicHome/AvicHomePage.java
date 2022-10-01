package com.epam.Pages.AvicHome;

import com.epam.Pages.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AvicHomePage extends BasePage {

    private final By searchBar = By.xpath("//input[@id='input_search']");
    private final By searchButton = By.xpath("//button[@class='button-reset search-btn']");
    public AvicHomePage(WebDriver driver) {
        super(driver);
    }

    public AvicHomePage chooseSearchBar() {
        driver.findElement(searchBar).click();
        return this;
    }

    public AvicHomePage enterProductToSearch(String productToSearch) {
        driver.findElement(searchBar).sendKeys(productToSearch);
        return this;
    }

    public AvicHomePage clickToSearchButton() {
        WebElement btnSearch = driver.findElement(searchButton);
        waitElementIsVisible(btnSearch).click();
        return this;
    }
}