package utils;

import com.github.javafaker.Faker;


public class RandomDataUtils {

    public static String monthsValue = new Faker().options().option("January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December");
    public static String subjectsValue = new Faker().options().option("Accounting", "Maths", "Arts", "English", "Physics", "Chemistry",
            "Computer Science", "Economics", "Social Studies", "History", "Civics", "Commerce", "Hindi", "Biology");
    public static String hobbiesValue = new Faker().options().option("Sports", "Music", "Reading");
    public static String stateValue = new Faker().options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
    public static String[] ncrCityValue = {"Delhi", "Gurgaon", "Noida"};
    public static String[] uttarPradeshCityValue = {"Agra", "Lucknow", "Merrut"};
    public static String[] haryanaCityValue = {"Karnal", "Panipat"};
    public static String[] rajasthanCityValue = {"Jaipur", "Jaiselmer"};


    public static String setCity() {
        switch (stateValue) {
            case "NCR":
                return new Faker().options().option(ncrCityValue);

            case "Uttar Pradesh":
                return new Faker().options().option(uttarPradeshCityValue);

            case "Haryana":
                return new Faker().options().option(haryanaCityValue);

            case "Rajasthan":
                return new Faker().options().option(rajasthanCityValue);
        }

        return null;

    }


    public static String getRandomName() {
        return new Faker().name().firstName();
    }

    public static String getRandomLastName() {
        return new Faker().name().lastName();
    }

    public static String getRandomEmail() {

        return new Faker().internet().emailAddress();
    }

    public static String getRandomGender() {

        return new Faker().demographic().sex();
    }

    public static String getRandomPhoneNumber() {
        return "8" + new Faker().phoneNumber().subscriberNumber(9);
    }

    public static int getRandomDay() {
        return new Faker().number().numberBetween(1, 28);
    }

    public static int getRandomYear() {
        return new Faker().number().numberBetween(1900, 2023);
    }

    public static String getRandomAddress() {
        return new Faker().address().fullAddress();
    }

}
