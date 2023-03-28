package tests;


import core.BaseTest;
import org.junit.jupiter.api.Test;

import pages.RegistrationPage;
import static utils.RandomDataUtils.*;


public class DemoQaTest extends BaseTest {
    public RegistrationPage registrationPage = new RegistrationPage();

    @Test
    public void registrationFormTest() {
        String name = getRandomName(),
                lastName = getRandomLastName(),
                email = getRandomEmail(),
                gender = getRandomGender(),
                userNumber = getRandomPhoneNumber(),
                dayOfBirth = String.valueOf(getRandomDay()),
                monthOfBirth = getRandomDataFromArray(monthsValue),
                yearOfBirth = String.valueOf(getRandomYear()),
                subject = getRandomDataFromArray(subjectsValue),
                hobbies = getRandomDataFromArray(hobbiesValue),
                address = getRandomAddress(),
                state = stateValue,
                city = setCity() ;


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
                .submitRegistrationForm()

                .registrationResult()
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
    }

}
