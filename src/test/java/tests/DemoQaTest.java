package tests;


import com.codeborne.selenide.logevents.SelenideLogger;
import core.BaseTest;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import pages.RegistrationPage;

import static io.qameta.allure.Allure.step;
import static utils.RandomDataUtils.*;


public class DemoQaTest extends BaseTest {
    public RegistrationPage registrationPage = new RegistrationPage();

    @Test
    public void registrationFormTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        String name = getRandomName(),
                lastName = getRandomLastName(),
                email = getRandomEmail(),
                gender = getRandomGender(),
                userNumber = getRandomPhoneNumber(),
                dayOfBirth = String.valueOf(getRandomDay()),
                monthOfBirth = monthsValue,
                yearOfBirth = String.valueOf(getRandomYear()),
                subject = subjectsValue,
                hobbies = hobbiesValue,
                address = getRandomAddress(),
                state = stateValue,
                city = setCity();

        step("Заполнеяем форму", () -> {
            registrationPage.removeBanner()
                    .setUserName(name)
                    .setUserLastName(lastName)
                    .setUserEmail(email)
                    .setGender(gender)
                    .setUserNumber(userNumber)
                    .setBirthdayDate(dayOfBirth, monthOfBirth, yearOfBirth)
                    .setSubject(subject)
                    .setHobbies(hobbies)
                    .setPicture()
                    .setAddress(address)
                    .setState(state)
                    .setCity(city)
                    .submitRegistrationForm();
        });

        step("Заполнеяем форму", () -> {
            registrationPage.registrationResult()
                    .registrationFormResult("Student Name", name + " " + lastName)
                    .registrationFormResult("Student Email", email)
                    .registrationFormResult("Gender", gender)
                    .registrationFormResult("Mobile", userNumber)
                    .registrationFormResult("Date of Birth", dayOfBirth + " " + monthOfBirth + "," + yearOfBirth)
                    .registrationFormResult("Subjects", subject)
                    .registrationFormResult("Hobbies", hobbies)
                    .registrationFormResult("Address", address)
                    .registrationFormResult("State and City", state + " " + city)
                    .closeModal();
        });
    }

}
