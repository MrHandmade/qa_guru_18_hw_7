package tests;

import core.BaseTest;
import org.junit.jupiter.api.Test;

public class DemoQaTest extends BaseTest {
    @Test
    public void registrationFormTest(){
         String name = "Maxim",
                 lastName = "Shavykin",
                 email = "test@email.com",
                 gender = "Male",
                 userNumber = "7999888322",
                 dayOfBirth = "31",
                 monthOfBirth = "December",
                 yearOfBirth = "2000",
                 subject = "English",
                 hobbiesMusic = "Music",
                 hobbiesReading = "Reading",
                 hobbiesSports = "Sports",
                 address = "Baker.st",
                 stateNcr = "NCR",
                 cityDelhi = "Delhi";


        registrationPage.setUserName(name)
                .setUserLastName(lastName)
                .setUserEmail(email)
                .setGender(gender)
                .setUserNumber(userNumber)
                .setBirthdayDate(dayOfBirth, monthOfBirth, yearOfBirth)
                .setSubject(subject)
                .setHobbiesMusic(hobbiesMusic)
                .setHobbiesReading(hobbiesReading)
                .setHobbiesSports(hobbiesSports)
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
                .registrationFormResult ("Hobbies", hobbiesMusic + ", " + hobbiesReading + ", " + hobbiesSports)
                .registrationFormResult("Address", address)
                .registrationFormResult("State and City", stateNcr + " " + cityDelhi)
                .closeModal();

                



    }

}
