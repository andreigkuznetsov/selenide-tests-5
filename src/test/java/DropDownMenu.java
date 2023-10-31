import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DropDownMenu {

    @Test
    void dropDawnMenuHoverTest() {
        open("https://github.com/");
        $("ul.d-lg-flex.list-style-none").$(byText("Solutions")).hover();
        $("[href='/enterprise']").click();
        $("#js-global-screen-reader-notice").shouldHave(text("The AI Powered Developer Platform."));
    }
}

