import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class SelenideSearchTest {
    @Test
    void shouldFindJunit5Example(){
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".markdown-body ul").shouldHave(text("Soft assertions"));
        $$(".markdown-body").findBy(visible)
                .$$("ul li a").findBy(text("Soft assertions")).click();
        //$(byText("Soft assertions")).click();
        $("#user-content-3-using-junit5-extend-test-class").closest("h4").sibling(0)
                .$("pre").shouldBe(visible);
    }
}
