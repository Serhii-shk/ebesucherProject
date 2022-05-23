package pages.domainSelect;

import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;

public class DomainSelect extends BasePage {
    private final SelenideElement createLaunchOrJoinField = $x("//span[@class='sl-page-header__subtitle']");

    /**
     * Check display the text after authorization
     * @param text Choose text on the page
     */
    public DomainSelect checkCreateLaunchOrJoinField(String text){
        createLaunchOrJoinField
                .shouldHave(text(text), Duration.ofSeconds(7));
        return this;
    }


}
