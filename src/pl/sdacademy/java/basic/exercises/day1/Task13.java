package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDigits = -1;
        int numberOfEvenDigits = -1;
        int sum = 0;
        int stop = 1;

        while (stop != 0) {
            System.out.print("Please insert a digit: ");
            int input = scanner.nextInt();
            stop = input;
            numberOfDigits++;
            if(input %2 ==0) {
               numberOfEvenDigits++;
            }
            sum += input;
        }
        System.out.println("Total number of digits: " + numberOfDigits);
        System.out.println("Total number of even digits: " + numberOfEvenDigits);
        System.out.println("Arithmetic average: " + (double)sum/numberOfDigits);
        scanner.close();
    }
}
