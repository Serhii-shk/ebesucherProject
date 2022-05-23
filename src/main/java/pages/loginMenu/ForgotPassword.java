package pages.loginMenu;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class ForgotPassword extends BasePage {

    private final SelenideElement forgotPasswordButton = $x("//button[@aria-label='Forgot password?']");
    private final SelenideElement recoveryEmailField = $x("//input[@data-qa-tag='email-input']");
    private final SelenideElement recoveryMyPassButton = $x("//button[@data-qa-tag='Recover My Password']");

    /** Clicking a Forgot password button */
    public ForgotPassword clickForgotPasswordButton() {
        forgotPasswordButton.shouldBe(Condition.visible).click();
        return this;
    }

    /**
     * Enter the email value of the email input field to reset your password
     * @param email email
     */
    public ForgotPassword inputRecoveryEmailField(String email) {
        clearAndType(recoveryEmailField,email);
        return this;
    }

    /** Clicking a recovery my password button */
    public ForgotPassword clickRecoveryMyPassButton() {
        recoveryMyPassButton.shouldBe(Condition.visible).click();
        return this;
    }



}
