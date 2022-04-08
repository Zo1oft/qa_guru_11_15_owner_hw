package qa.guru;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class WebDriverTest extends TestBase{

    @Test
    public void webTest() {
        step("Открываем GitHub", () -> {
            open("https://github.com");
        });

        step("Вводим поисковый запрос", () -> {

            $("[data-test-selector='nav-search-input'").setValue("Allure").pressEnter();
            $$("ul.repo-list").first().shouldHave(text("Allure Report"));
            sleep(1000);
        });

    }
}
