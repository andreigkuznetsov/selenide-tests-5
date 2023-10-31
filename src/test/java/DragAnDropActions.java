import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class DragAnDropActions {

    @Test
    void dragAndDropActionsTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $(".example h3").shouldHave(text("Drag and Drop"));
        $("#column-a header").shouldHave(text("A"));
        $("#column-b header").shouldHave(text("B"));
        actions().dragAndDropBy($("#column-a"), 200, 0).build().perform();
        $("#column-a header").shouldHave(text("B"));
        $("#column-b header").shouldHave(text("A"));
    }
}
