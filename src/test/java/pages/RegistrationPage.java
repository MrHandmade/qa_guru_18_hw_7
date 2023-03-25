package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponents;
import pages.components.RegistrationResult;

import java.io.File;

import static com.codeborne.selenide.Selenide.$x;

public class RegistrationPage {
    private final CalendarComponents calendarComponents = new CalendarComponents();
    private final RegistrationResult registrationResult = new RegistrationResult();


    private static final SelenideElement userName = $x("//input[@id='firstName']"),
            userLastname = $x("//input[@id='lastName']"),
            userEmail = $x("//input[@id='userEmail']"),
            userNumber = $x("//input[@id='userNumber']"),
            calendar = $x("//input[@id = 'dateOfBirthInput']"),
            subject = $x("//input[@id='subjectsInput']"),
            uploadPicture = $x("//input[@id='uploadPicture']"),
            currentAddress = $x("//textarea[@id='currentAddress']"),
            city = $x("//div[@id='city']"),
            state = $x("//div[@id='state']"),
            submit = $x("//button[@id='submit']"),
            closeButton = $x("//button[@id='closeLargeModal']");



    public RegistrationPage setUserName(String valueName){
        userName.setValue(valueName);
        return this;
    }

    public RegistrationPage setUserLastName(String valueLastName){
        userLastname.setValue(valueLastName);
        return this;
    }

    public RegistrationPage setUserEmail(String valueUserEmail){
        userEmail.setValue(valueUserEmail);
        return this;
    }

    public RegistrationPage setUserNumber(String valueUserNumber){
        userNumber.setValue(valueUserNumber);
        return this;
    }

    public RegistrationPage setGender(String gender){
        $x("//label[text()=" + "'" + gender + "'" + "]").click();
        return this;
    }

    public RegistrationPage setBirthdayDate(String day, String month, String year){
        calendar.click();
        calendarComponents.setBirthdayDate(day, month, year);
        return this;
    }

    public RegistrationPage setSubject(String subjectValue){
        subject.setValue(subjectValue).pressEnter();
        return this;
    }

    public RegistrationPage setHobbiesSports(String hobbiesSport){
        $x("//label[text()=" + "'" + hobbiesSport + "'" + "]").click();
        return this;
    }

    public RegistrationPage setHobbiesMusic(String hobbiesMusic){
        $x("//label[text()=" + "'" + hobbiesMusic + "'" + "]").click();
        return this;
    }

    public RegistrationPage setHobbiesReading(String hobbiesReading){
        $x("//label[text()=" + "'" + hobbiesReading + "'" + "]").click();
        return this;
    }

    public RegistrationPage setPicture(){
        File pic = new File("src/test/java/resource/pwa_vertical_1280_55d23da46a4b99f74eedbba9ec98aa80.jpg");
        uploadPicture.uploadFile(pic);
        return this;
    }

    public RegistrationPage setAddress(String currentAddressValue){
        currentAddress.setValue(currentAddressValue);
        return this;
    }

    public RegistrationPage setState(String stateNcr){
        state.click();
        $x("//div[text()=" + "'" + stateNcr + "'" + "]").click();
        return this;
    }

    public RegistrationPage setCity(String cityDelhi){
        city.click();
        $x("//div[text()=" + "'" + cityDelhi + "'" + "]").click();
        return this;
    }

    public RegistrationPage submitRegistrationForm(){
        submit.click();
        return this;

    }

    public RegistrationPage registrationResult(){
        registrationResult.verifyResult();
        return this;
    }

    public RegistrationPage registrationFormResult(String value, String key){
        registrationResult.formResults(value, key);
        return this;
    }

    public RegistrationPage closeModal(){
        closeButton.click();
        return this;
    }


}





