package pl.sdacademy.java.basic.exercises.day1;

import java.util.Random;
import java.util.Scanner;

class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random guess = new Random();

        int guesser = guess.nextInt(100);
        int digitFromUser = 0;
        System.out.println(guesser);
        System.out.println("Welcome to guesser!");

        while (digitFromUser != guesser){
            System.out.print("Please insert digit: ");
            digitFromUser = scanner.nextInt();
            if(digitFromUser < guesser) {
                System.out.println("Not enough");
            } else if(digitFromUser > guesser){
                System.out.println("Too much");
            } else
            System.out.println("Bingo!");
        }

//        for (int i = 0; i < 1;) {
//            int digitFromUser = 0;
//            System.out.print("Please insert digit: ");
//            digitFromUser = scanner.nextInt();
//            if(guesser < digitFromUser){
//                System.out.println("Too much");
//            } else if(guesser > digitFromUser) {
//                System.out.println("Not enough");
//            } else if (guesser == digitFromUser) {
//                System.out.println("Bingo!");
//                i++;
//            }
//        }
        scanner.close();
    }
}
