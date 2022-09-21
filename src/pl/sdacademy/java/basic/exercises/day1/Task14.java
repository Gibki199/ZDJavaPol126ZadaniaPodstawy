package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

class Task14 {
    private static final double AMOUNT_MAX_VALUE = 10_000;
    private static final double AMOUNT_MIN_VALUE = 100;
    private static final double LOWER_DEFAULT_AMOUNT_VALUE = 1000;
    private static final double UPPER_DEFAULT_AMOUNT_VALUE = 5000;
    private static final int INSTALMENT_MAX_VALUE = 48;
    private static final int INSTALMENT_MIN_VALUE = 6;
    private static final int UPPER_DEFAULT_INSTALMENT_VALUE = 36;
    private static final int LOWER_DEFAULT_INSTALMENT_VALUE = 18;
    private static final double FIRST_THRESHOLD = 2.5;
    private static final double SECOND_THRESHOLD = 5;
    private static final double THIRD_THRESHOLD = 10;
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        double amount = setAndVerifyAmount();
        int installments = setAndVerifyNumbersOfInstallments();
        double singleInstalment = getAndSingleInstalments(installments, amount);
        System.out.println("Single instalment: " + singleInstalment);

    }

    private static double setAndVerifyAmount() {
        System.out.print("Please insert amount: ");
        double amount = scanner.nextDouble();
        if (amount < AMOUNT_MIN_VALUE) {
            System.out.println("Amount is to small. Default value " + LOWER_DEFAULT_AMOUNT_VALUE + " was set");
            return LOWER_DEFAULT_AMOUNT_VALUE;
        } else if (amount > AMOUNT_MAX_VALUE) {
            System.out.println("Amount is to big. Default value " + UPPER_DEFAULT_AMOUNT_VALUE + " was set");
            return UPPER_DEFAULT_AMOUNT_VALUE;
        }
        return amount;
    }

    private static int setAndVerifyNumbersOfInstallments() {
        System.out.print("Please insert number of installments: ");
        int instalment = scanner.nextInt();
        if (instalment < INSTALMENT_MIN_VALUE) {
            System.out.println("Number of installments is too small. Default value" + LOWER_DEFAULT_INSTALMENT_VALUE + " was set");
            return LOWER_DEFAULT_INSTALMENT_VALUE;
        } else if (instalment > INSTALMENT_MAX_VALUE) {
            System.out.println("Number of installments is too big. Default value " + UPPER_DEFAULT_INSTALMENT_VALUE + " was set");
            return UPPER_DEFAULT_INSTALMENT_VALUE;
        }
        return instalment;
    }

    private static double getAndSingleInstalments(int numberOfInstalments, double amount) {
        double singleAmountOfInstallment;
        if (numberOfInstalments <= 12 && numberOfInstalments >= 6) {
            singleAmountOfInstallment = calculateThreshold(FIRST_THRESHOLD, amount) / numberOfInstalments;
        } else if (numberOfInstalments <= 24 && numberOfInstalments >= 13) {
            singleAmountOfInstallment = calculateThreshold(SECOND_THRESHOLD, amount) / numberOfInstalments;
        } else {
            singleAmountOfInstallment = calculateThreshold(THIRD_THRESHOLD, amount) / numberOfInstalments;
        }
        singleAmountOfInstallment = Math.round(singleAmountOfInstallment * 100);
        return singleAmountOfInstallment / 100;
    }

    private static double calculateThreshold(double currentPercent, double amount) {
        return ((currentPercent / 100) + 1) * amount;
    }
}