package tests;

import com.codeborne.selenide.Condition;
import io.appium.java_client.MobileBy;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

public class AndroidWikiTests extends TestBase {

    @Owner("QA_Guru")
    @DisplayName("Search in wiki")
    @Tag("selenide")
    @Test
    void searchTextxTest() {
        step("Type search", () -> {
            $(MobileBy.AccessibilityId("Search Wikipedia")).click();
            $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).setValue("Browserstack");
        });
        step("Verify content found", () ->
                $$(byClassName("android.widget.TextView")).shouldHave(sizeGreaterThan(0)));
    }

    @Owner("QA_Guru")
    @DisplayName("Verify wiki")
    @Tag("selenide")
    @Test
    void verifyNewsTest() {
        step("Verify news page", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/view_card_header_title"))
                    .shouldHave(Condition.text("In the news"));
        });
    }
}


