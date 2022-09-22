package pl.sdacademy.java.basic.exercises.day2;

import java.util.Scanner;

class Task9 {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String input;
        String longestWord = null;
        int lenghtOfTheLongestWord = 0;


        do {
            System.out.print("Please insert your text: ");
            input = scanner.nextLine();
            if (input.isBlank()) {
                System.out.println("No input");
            } else if(!"Enough".equals(input)){
                if (lenghtOfTheLongestWord < input.length()){
                    longestWord = input;
                    lenghtOfTheLongestWord = input.length();
                }
            }
        } while (!"Enough".equals(input));
        System.out.println("The longest word is: " + longestWord);
    }
}
