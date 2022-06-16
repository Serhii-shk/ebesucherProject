package pages.surfbar;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Surfbar extends BasePage {
    private final SelenideElement surfNowButton = $x("//span[text()='Surf now!']");

    public Surfbar clickSurfNowButton() {
        surfNowButton.shouldBe(Condition.visible).click();
        return this;
    }

    public Surfbar checkNotVisibleElementOnPage(String element) {
        $(byXpath(element)).shouldNotBe(Condition.visible);
//        (element).shouldNot(Condition.visible);
        return this;
    }
}
