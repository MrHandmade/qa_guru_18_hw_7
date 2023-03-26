package core;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import pages.RegistrationPage;
import utils.RandomDataUtils;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class BaseTest {

    @BeforeAll
    public static void setUp(){
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.screenshots = false;
        Configuration.savePageSource = false;
        baseUrl = "https://demoqa.com/";
        Configuration.holdBrowserOpen = true;

        Selenide.open(baseUrl + "automation-practice-form");
    }


    public static void removeBanner(){
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

    }

}
