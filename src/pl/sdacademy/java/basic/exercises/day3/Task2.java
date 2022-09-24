package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Pattern;

class Task2 {
    private static final String IBAN_REGEX = "PL[0-9]{26}";
    public static void main(String[] args) {
        String iban = "PL10105678998765432198654762";
        System.out.println("If PL IBAN " + iban + " has correct format: " + isIbanCorrect(iban));
        iban = "AA10105678998765432198654762";
        System.out.println("If PL IBAN " + iban + " has correct format: " + isIbanCorrect(iban));
        iban = "AA1010567899876543219865476233";
        System.out.println("If PL IBAN " + iban + " has correct format: " + isIbanCorrect(iban));
        iban = "AA1";
        System.out.println("If PL IBAN " + iban + " has correct format: " + isIbanCorrect(iban));

    }
    private static boolean isIbanCorrect (String iban){
        return Pattern.matches(IBAN_REGEX, iban);
    }
}
