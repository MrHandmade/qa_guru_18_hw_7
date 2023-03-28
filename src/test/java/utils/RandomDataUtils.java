package utils;

import com.github.javafaker.Faker;

import java.util.concurrent.ThreadLocalRandom;

public class RandomDataUtils {

    public static String[] monthsValue = {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};
    public static String[] subjectsValue = {"Accounting", "Maths", "Arts", "English", "Physics", "Chemistry",
            "Computer Science", "Economics", "Social Studies", "History", "Civics", "Commerce", "Hindi", "Biology"};
    public static String[] hobbiesValue = {"Sports", "Music", "Reading"};
    public static String stateValue = new Faker().options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
    public static String[] ncrCityValue = {"Delhi", "Gurgaon", "Noida"};
    public static String[] UttarPradeshCityValue = {"Agra", "Lucknow", "Merrut"};
    public static String[] HaryanaCityValue = {"Karnal", "Panipat"};


    public static String setCity() {
        if (stateValue.equals("NCR")) {
            return getRandomDataFromArray(ncrCityValue);
        } else if (stateValue.equals("Uttar Pradesh")) {
            return getRandomDataFromArray(UttarPradeshCityValue);
        } else if (stateValue.equals("Haryana")) {
            return getRandomDataFromArray(HaryanaCityValue);
        }

        return null;

    }

    public static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);

    }

    public static String getRandomDataFromArray(String[] values) {
        int index = getRandomInt(0, values.length - 1);
        return values[index];

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
