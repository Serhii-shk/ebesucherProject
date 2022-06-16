package pages.loginMenu;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.actions;

public class LoginPage extends BasePage {

    private final SelenideElement acceptAllCookiesButton = $x("//button[@id='btn-cookies-accept-all']");
    private final SelenideElement areaLoginPage = $x("//body[@class='modal-open']");
    private final SelenideElement modalContent = $x("//div[@class='modal-content']");
    private final SelenideElement surfbarClicksDropdown = $x("//a[text()='Surfbar & Clicks']");
    private final SelenideElement discoverWebsitesField = $x("(//a[@href='/punkteverdienen'])[1]");
    

    /** Check the text on Modal window*/
    public LoginPage checkModalContent() {
        modalContent.shouldBe(visible, Duration.ofSeconds(10));
        return this;
    }

    /** Click on area to login page menu */
    public LoginPage clickAreaLoginPage() {
        actions().moveToElement(areaLoginPage,156,300).click().build().perform();
        return this;
    }

    /** Click on accept all cookies button */
    public LoginPage clickOnAcceptAllCookiesButton() {
        acceptAllCookiesButton.shouldBe(visible).click();
        return this;
    }

    /** Click on "Surfbar & Clicks" dropdown menu */
    public LoginPage clickSurfbarClicksDropdown() {
        //actions().moveToElement(surfbarClicksDropdown,1,3).click().build().perform();
        surfbarClicksDropdown.shouldBe(visible, Duration.ofSeconds(10)).click();
        return this;
    }

    /** Choose "Discover Websites" field in the"Surfbar & Clicks" dropdown menu */
    public LoginPage selectDiscoverWebsitesField() {
        discoverWebsitesField.shouldBe(visible).click();
        return this;
    }

}
