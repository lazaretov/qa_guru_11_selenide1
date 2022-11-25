import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class SelenideSearchTest {
    @Test
    void shouldFindJunit5Example() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".markdown-body ul").shouldHave(text("Soft assertions"));
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $("#wiki-pages-box").$$("ul").findBy(text("SoftAssertions")).click();
        $("#user-content-3-using-junit5-extend-test-class").closest("h4").sibling(0)
                .$("pre").shouldHave(text("{SoftAssertsExtension.class}"));
    }
}
