package pages.components;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class CalendarComponents {
    private static final ElementsCollection monthNYear = $$x("//select");

    public CalendarComponents setBirthdayDate(String day, String month, String year) {
        monthNYear.first().click();
        $x("//option[text()= " + "'" + month + "'" + "]").click();
        monthNYear.last().click();
        $x("//option[@value = " + year + "]").click();
        $x("//div[text() = " + day + "]").click();

        return this;

    }
}
