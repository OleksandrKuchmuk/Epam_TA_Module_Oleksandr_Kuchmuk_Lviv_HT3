package com.epam.Pages.Authorization;

import com.epam.Pages.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.epam.Constants.Constant.LoginsAndPasswords.USER_PASSWORD;
import static com.epam.Constants.Constant.LoginsAndPasswords.USER_PHONE_NUMBER;

public class AuthorizationPage extends BasePage {

    private final By authorizationButtonOnMainPage = By.xpath("//div[@class='header-bottom__right-icon']/i[@class='icon icon-user-big']");
    private final By phoneNumberBar = By.xpath("//main//input[@placeholder='+38 (XXX) XXX-XX-XX']");
    private final By passwordBar = By.xpath("//input[@class='validate show-password']");
    private final By submitButton = By.xpath("//button[contains(text(), 'Увійти')]");
    public AuthorizationPage(WebDriver driver) {
        super(driver);
    }

    public AuthorizationPage clickToUserButton() {
        driver.findElement(authorizationButtonOnMainPage).click();
        return this;
    }

    public AuthorizationPage enterPhoneNumberInTheForm() {
        driver.findElement(phoneNumberBar).sendKeys(USER_PHONE_NUMBER);
        return this;
    }

    public AuthorizationPage enterPasswordInTheForm() {
        driver.findElement(passwordBar).sendKeys(USER_PASSWORD);
        return this;
    }

    public AuthorizationPage pressSubmitButton() {
        driver.findElement(submitButton).click();
        return this;
    }

    public String alertMessage() {
        return driver.switchTo().activeElement().getText();
    }
}