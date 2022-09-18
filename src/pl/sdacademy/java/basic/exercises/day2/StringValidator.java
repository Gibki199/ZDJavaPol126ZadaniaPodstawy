package pl.sdacademy.java.basic.exercises.day2;

class StringValidator {

    public static boolean isValid (String input) {
        return input != null && !input.isBlank();
    }
}
