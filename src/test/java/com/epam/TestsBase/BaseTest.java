package com.epam.TestsBase;

import com.epam.Common.CommonActions;
import com.epam.Pages.Authorization.AuthorizationPage;
import com.epam.Pages.AvicHome.AvicHomePage;
import com.epam.Pages.Base.BasePage;
import com.epam.Pages.CableAsndAdapters.CableAndAdaptersPage;
import com.epam.Pages.Listing.AvicListingPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import static com.epam.Common.Config.CLEAR_COOKIES_AND_STORAGE;
import static com.epam.Common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected Actions action = new Actions(driver);
    protected BasePage basePage = new BasePage(driver);
    protected AvicHomePage avicHomePage = new AvicHomePage(driver);
    protected AvicListingPage avicListingPage = new AvicListingPage(driver);
    protected AuthorizationPage authorizationPage = new AuthorizationPage(driver);
    protected CableAndAdaptersPage cableAndAdaptersPage = new CableAndAdaptersPage(driver);

    @AfterTest
    public void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKIES_AND_STORAGE) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterSuite(alwaysRun = true)
    public void close() {
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }
}
