package tests.loginMenu.positive;

import common.Listener;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import tests.base.BaseTest;

import static com.codeborne.selenide.Selenide.switchTo;
import static constans.Constants.BUTTONS.surfNowButton;
import static constans.Constants.DOMAINS_URL.LOGIN_URL;
import static constans.Constants.EMAILS_AND_PASSWORDS.*;

@Link(name = "check-list", url = "")
@Feature("Login menu form validation tests")
@Story("A positive scenario")
@ExtendWith(Listener.class)
@Execution(ExecutionMode.CONCURRENT)
public class LoginFormMenuPositiveTest extends BaseTest {
    @Test
    @DisplayName("Authorization by registered user")
    public void successfulAuthorization() {
        basePage.goToURL(LOGIN_URL);
        loginForm
                .inputEmailField(USERNAME)
                .inputPasswordField(PASS)
                .clickLoginButton();
        loginPage
                .checkModalContent()
                .clickAreaLoginPage()
                .clickOnAcceptAllCookiesButton()
                .checkMessage("Your personal referral link");
    }


    @Test
    @DisplayName("Surfing pay Websites")
    public void surfingWebsites() {
        basePage.goToURL(LOGIN_URL);
        loginForm
                .inputEmailField(USERNAME)
                .inputPasswordField(PASS)
                .clickLoginButton();
        loginPage
                .checkModalContent()
                .clickAreaLoginPage()
                .clickOnAcceptAllCookiesButton()
                .checkMessage("Your personal referral link");
        loginPage
                .clickSurfbarClicksDropdown()
                .selectDiscoverWebsitesField()
                .checkMessage("Surf now");
        discoverWebsites
                .clickSurfNowButton();

        switchTo().window(1);

        surfbar
                .checkNotVisibleElementOnPage(surfNowButton)
                .clickSurfNowButton();

    }



}
