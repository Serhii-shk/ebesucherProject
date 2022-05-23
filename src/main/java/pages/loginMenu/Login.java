package pages.loginMenu;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;
import java.time.Duration;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class Login extends BasePage {
    private final SelenideElement emailField = $x("//input[@data-qa-tag='user-email-input']");
    private final SelenideElement passwordField = $x("//input[@data-qa-tag='user-password-input']");
    private final SelenideElement loginButton = $x("//button[@type='submit']");
    private final SelenideElement emailErrorMassage = $x("//div[text()='Enter your email address']");
    private final SelenideElement passwordErrorMassage = $x("//div[text()='Enter your password']");

    /**
     * Enter the email value of the email field
     * @param email email
     */
    public Login inputEmailField(String email) {
        clearAndType(emailField.shouldBe(visible, Duration.ofSeconds(10)), email);
        return this;
    }

    /**
     * Enter the password value of the password field
     * @param pass password
     */
    public Login inputPasswordField(String pass) {
        clearAndType(passwordField, pass);
        return this;
    }

    /**
     * User authorization
     * @return
     */
    public Login clickLoginButton() {
        loginButton.shouldBe(Condition.visible).click();
        return this;
    }


    /**
     * Check display the text after authorization
     * @param text Choose text on the page
     */
    public Login checkEmailErrorMassage(String text){
        emailErrorMassage
                .shouldHave(text(text), Duration.ofSeconds(10));
        return this;
    }
}
