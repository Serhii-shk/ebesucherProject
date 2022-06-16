package pages.discoverWebsites;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class DiscoverWebsites extends BasePage {
    private final SelenideElement surfNowButton = $x("//a[text()='Surf now']");

    public DiscoverWebsites clickSurfNowButton() {
        surfNowButton.shouldBe(Condition.visible).click();
        return this;
    }



}
