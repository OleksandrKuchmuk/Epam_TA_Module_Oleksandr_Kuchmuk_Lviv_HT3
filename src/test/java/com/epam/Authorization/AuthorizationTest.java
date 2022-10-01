package com.epam.Authorization;

import com.epam.TestsBase.BaseTest;
import org.junit.Test;
import org.testng.Assert;

import static com.epam.Constants.Constant.AlertsMessages.ALERT_MESSAGE_AUTHORISATION_OK;
import static com.epam.Constants.Constant.Urls.AVIC_HOME_PAGE;

public class AuthorizationTest extends BaseTest {

    @Test
    public void authorization() {
        basePage.open(AVIC_HOME_PAGE);
        authorizationPage
                .clickToUserButton()
                .enterPhoneNumberInTheForm()
                .enterPasswordInTheForm()
                .pressSubmitButton();
        String actualResult = authorizationPage.alertMessage();
        Assert.assertEquals(actualResult, ALERT_MESSAGE_AUTHORISATION_OK);
        driver.quit();
    }
}