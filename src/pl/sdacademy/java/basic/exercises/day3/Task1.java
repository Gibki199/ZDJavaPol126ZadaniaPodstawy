package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Task1 {
    private static final String EMAIL_REGEX = "[A-Za-z0-9._]+@[a-z]+(.[a-z]+)*";
//    private static final String EMAIL_REGEX = "[\\w\\d._]+@+[\\w]+(.[\\w]+)*";

    public static void main(String[] args) {
        System.out.println(isCorrectEmailFormat("gibki199@gmail"));
        System.out.println(isCorrectEmailFormat("gibki199@gmail.com"));
        System.out.println(isCorrectEmailFormat("gibki199@gmail.com.pl"));
        System.out.println(isCorrectEmailFormat("gibki199@gmail.com."));
        System.out.println(isCorrectEmailFormat("gibki199@"));

    }

    private static boolean isCorrectEmailFormat (String emailAddress) {
        //#Option1
//        Pattern pattern = Pattern.compile("");
//        Matcher matcher = pattern.matcher(emailAddress);
//        return matcher.matches();
        //#Option2
//        return Pattern.compile("").matcher(emailAddress).matches();
        //#Option3
        return Pattern.matches(EMAIL_REGEX, emailAddress);
    }
}
