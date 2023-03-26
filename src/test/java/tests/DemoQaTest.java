package tests;


import core.BaseTest;
import org.junit.jupiter.api.Test;

import pages.RegistrationPage;
import utils.RandomDataUtils;

import static utils.RandomDataUtils.*;


public class DemoQaTest extends BaseTest {
    public RegistrationPage registrationPage = new RegistrationPage();
    @Test
    public void registrationFormTest(){
         String name = RandomDataUtils.getRandomName(),
                 lastName = RandomDataUtils.getRandomLastName(),
                 email = RandomDataUtils.getRandomEmail(),
                 gender = RandomDataUtils.getRandomGender(),
                 userNumber = RandomDataUtils.getRandomPhoneNumber(),
                 dayOfBirth = String.valueOf(RandomDataUtils.getRandomDay()),
                 monthOfBirth = RandomDataUtils.getRandomDataFromArray(monthsValue),
                 yearOfBirth = String.valueOf(RandomDataUtils.getRandomYear()),
                 subject = RandomDataUtils.getRandomDataFromArray(subjectsValue),
                 hobbies = RandomDataUtils.getRandomDataFromArray(hobbiesValue),
                 address = RandomDataUtils.getRandomAddress(),
                 stateNcr = "NCR",
                 cityDelhi = RandomDataUtils.getRandomDataFromArray(cityValue) ;


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
                .setState(stateNcr)
                .setCity(cityDelhi)
                .submitRegistrationForm()

                .registrationResult()
                .registrationFormResult("Student Name", name + " " + lastName)
                .registrationFormResult("Student Email", email)
                .registrationFormResult("Gender", gender)
                .registrationFormResult("Mobile", userNumber)
                .registrationFormResult("Date of Birth", dayOfBirth + " " + monthOfBirth + "," + yearOfBirth)
                .registrationFormResult("Subjects", subject)
                .registrationFormResult ("Hobbies", hobbies)
                .registrationFormResult("Address", address)
                .registrationFormResult("State and City", stateNcr + " " + cityDelhi)
                .closeModal();

                



    }

}
