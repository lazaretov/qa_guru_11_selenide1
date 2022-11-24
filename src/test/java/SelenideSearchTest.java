import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;


public class SelenideSearchTest {
    @Test
    void shouldFindJunit5Example(){
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();

    }
}
