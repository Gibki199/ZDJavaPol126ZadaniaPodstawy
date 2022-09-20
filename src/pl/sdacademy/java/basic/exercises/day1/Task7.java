package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;
import java.util.regex.Pattern;

class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 1; i++) {
            System.out.print("Please insert first digit: ");
            float firstDigit = input.nextFloat();
            System.out.print("Please insert a mathematical operator: ");
            String operator = input.next();
            if (!Pattern.matches("[+*/-]", operator)) {
                System.out.println("Operator not exist");
                break;
            }
            System.out.print("Please insert second digit: ");
            float secondDigit = input.nextFloat();
            System.out.println(firstDigit + " " + operator + " " + secondDigit + " = " + result(firstDigit, operator, secondDigit));
            System.out.println("Are we done?");
            System.out.print("for continue type \"go\", for exit type \"stop\": ");
            String exit = input.next();
            if (Pattern.matches("stop", exit)) {
                break;
            }
            if (Pattern.matches("go", exit)) {
                i--;
            }
        }
        input.close();
    }

    private static float result(float firstDigit, String operator, float secondDigit) {
        float sum = 0;
        if (operator.equals("+")) {
            sum = firstDigit + secondDigit;
        }
        if (operator.equals("-")) {
            sum = firstDigit - secondDigit;
        }
        if (operator.equals("*")) {
            sum = firstDigit * secondDigit;
        }
        if (operator.equals("/")) {
            sum = firstDigit / secondDigit;
        }
        return sum;
    }
}
