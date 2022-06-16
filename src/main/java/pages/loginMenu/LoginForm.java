package pages.loginMenu;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;
import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class LoginForm extends BasePage {
    private final SelenideElement emailField = $x("//input[@id='LoginForm_login_name']");
    private final SelenideElement passwordField = $x("//input[@id='LoginForm_login_password']");
    private final SelenideElement loginButton = $x("//input[@type='submit']");


    /**
     * Enter the email value of the email field
     * @param email email
     */
    public LoginForm inputEmailField(String email) {
        clearAndType(emailField.shouldBe(visible, Duration.ofSeconds(10)), email);
        return this;
    }

    /**
     * Enter the password value of the password field
     * @param pass password
     */
    public LoginForm inputPasswordField(String pass) {
        clearAndType(passwordField, pass);
        return this;
    }

    /**
     * User authorization
     * @return
     */
    public LoginForm clickLoginButton() {
        loginButton.shouldBe(Condition.visible).click();
        return this;
    }



}
