package pl.sdacademy.java.basic.exercises.day2;

import java.util.Scanner;

class Task10 {
    private static Scanner input;
    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("How many words would you like insert? ");
        int howManyWords = input.nextInt();
        input.nextLine();
        System.out.println("result: " + getLastCharsFromWord(howManyWords));

        input.close();

    }
    private static String getLastCharsFromWord (int howManyWords) {
        StringBuilder result = new StringBuilder();
        while ((howManyWords-- > 0)){
            String word = input.nextLine();
            result.append(word.charAt(word.length() - 1));
        }
        return result.toString();
    }
}
