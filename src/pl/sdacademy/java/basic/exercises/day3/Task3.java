package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Pattern;

class Task3 {
    private static final String NUMBER_FORMAT_REGEX = "-?[0-9]+(,[0-9]+)?";
    public static void main(String[] args) {
        String input = "123,123";
        System.out.println("If digit " + input + " has correct format: " + isCorrectFormat(input));
        input = "123";
        System.out.println("If digit " + input + " has correct format: " + isCorrectFormat(input));
        input = "-123,123";
        System.out.println("If digit " + input + " has correct format: " + isCorrectFormat(input));
        System.out.println();
        input = "123,";
        System.out.println("If digit " + input + " has correct format: " + isCorrectFormat(input));
        input = "123d123";
        System.out.println("If digit " + input + " has correct format: " + isCorrectFormat(input));
        input = "123,ads";
        System.out.println("If digit " + input + " has correct format: " + isCorrectFormat(input));

    }
    private static boolean isCorrectFormat(String input){
        return Pattern.matches(NUMBER_FORMAT_REGEX, input);
    }
}
