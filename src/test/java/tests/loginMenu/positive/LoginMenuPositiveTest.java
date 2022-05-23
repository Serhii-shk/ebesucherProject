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

import static constans.Constants.DOMAINS_URL.LOGIN_URL;
import static constans.Constants.EMAILS_AND_PASSWORDS.*;

@Link(name = "check-list", url = "https://docs.google.com/spreadsheets/d/1WarfhO3dS0bptidZ4g1Y6uMxDFad1dqCydcBjGLPok0/edit?usp=sharing")
@Feature("Login menu form validation tests")
@Story("A positive scenario")
@ExtendWith(Listener.class)
@Execution(ExecutionMode.CONCURRENT)
public class LoginMenuPositiveTest extends BaseTest {
    @Test
    @DisplayName("Authorization by registered user")
    public void successfulAuthorization() {
        basePage.goToURL(LOGIN_URL);
        login
                .inputEmailField(SERJIOS_EMAIL)
                .inputPasswordField(SERJIOS_PASS)
                .clickLoginButton();
        domainSelect
                .checkCreateLaunchOrJoinField("Create, launch, or join a Workspace.");
    }

    @Test
    @DisplayName("Forgot password")
    public void checkPasswordRecoveryForm() {
        basePage.goToURL(LOGIN_URL);
        forgotPassword
                .clickForgotPasswordButton()
                .inputRecoveryEmailField(SERJIOS_EMAIL)
                .clickRecoveryMyPassButton()
                .checkMessage("Check your serjios@ukr.net inbox for password reset instructions.");
    }

    @Test
    @DisplayName("Successful authorization with spaces before and after email")
    public void successfulAuthorizationWithSpaces() {
        basePage.goToURL(LOGIN_URL);
        login
                .inputEmailField(EMAIL_WITH_SPACES_BEFORE_AND_AFTER)
                .inputPasswordField(SERJIOS_PASS)
                .clickLoginButton();
        domainSelect
                .checkCreateLaunchOrJoinField("Create, launch, or join a Workspace.");
    }



}
