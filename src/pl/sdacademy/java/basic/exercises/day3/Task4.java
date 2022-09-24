package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Pattern;

class Task4 {
    private static final String PSIK_REGEX = "a+ psik";
    public static void main(String[] args) {
        System.out.println(isApsikCorrect("a psik"));
        System.out.println(isApsikCorrect("aaaaa psik"));
        System.out.println(isApsikCorrect("psik"));
        System.out.println(isApsikCorrect("ee psik"));
        System.out.println(isApsikCorrect("aa psi"));
    }
    private static boolean isApsikCorrect(String input){
        return Pattern.matches(PSIK_REGEX, input);
    }
}
