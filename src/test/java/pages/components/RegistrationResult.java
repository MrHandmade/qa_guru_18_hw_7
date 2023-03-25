package pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationResult {
    private static final SelenideElement modalWindow = $x("//div[@id='example-modal-sizes-title-lg']");

    public void verifyResult() {
        modalWindow.should(Condition.appear);
        modalWindow.shouldHave(text("Thanks for submitting the form"));
    }

    public void formResults (String key, String value) {
        $(".table-responsive").$(byText(key)).parent().shouldHave(text(value));
    }
}
