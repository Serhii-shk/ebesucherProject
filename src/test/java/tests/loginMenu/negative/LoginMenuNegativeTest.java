package tests.loginMenu.negative;

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

import static constans.Constants.DOMAINS_URL.LOGIN_URL;
import static constans.Constants.EMAILS_AND_PASSWORDS.*;

@Link(name = "check-list", url = "https://docs.google.com/spreadsheets/d/1WarfhO3dS0bptidZ4g1Y6uMxDFad1dqCydcBjGLPok0/edit?usp=sharing")
@Feature("Login menu form validation tests")
@Story("A negative scenario")
@ExtendWith(Listener.class)
@Execution(ExecutionMode.CONCURRENT)
public class LoginMenuNegativeTest extends BaseTest {
    @Test
    @DisplayName("Authorization with empty fields")
    public void validationOfRequiredFields() {
        basePage.goToURL(LOGIN_URL);
        login
                .clickLoginButton()
                .checkEmailErrorMassage("Enter your email address")
                .checkMessage("Enter your password");
    }

    @Test
    @DisplayName("Authorization without '@' in the emaill")
    public void validationEmailFieldWithoutDogCharacter() {
        basePage.goToURL(LOGIN_URL);
        login
                .inputEmailField(EMAIL_WITHOUT_DOG_CHARACTER)
                .inputPasswordField(SERJIOS_PASS)
                .clickLoginButton()
                .checkMessage("Enter a valid email address using the following format: myname@mail.com");
    }

    @Test
    @DisplayName("Authorization with wrong emaill")
    public void validationEmailField() {
        basePage.goToURL(LOGIN_URL);
        login
                .inputEmailField(SERJIOS_WRONG_EMAIL)
                .inputPasswordField(SERJIOS_PASS)
                .clickLoginButton()
                .checkMessage("Enter a valid email or reset your password.");
    }

    @Test
    @DisplayName("Authorization with wrong password")
    public void validationPasswordField() {
        basePage.goToURL(LOGIN_URL);
        login
                .inputEmailField(SERJIOS_EMAIL)
                .inputPasswordField(SERJIOS_WRONG_PASS)
                .clickLoginButton()
                .checkMessage("Enter a valid email or reset your password.");
    }


}
