package pl.sdacademy.java.basic.exercises.day1;

class Task10 {
    public static void main(String[] args) {
        int input = 123;
        System.out.println(getAndAddSumOfDigits(input));
    }

    private static int getAndAddSumOfDigits(int digit) {
        int sum = String.valueOf(digit).chars().map((Character::getNumericValue)).sum();
        return sum;
    }
}
