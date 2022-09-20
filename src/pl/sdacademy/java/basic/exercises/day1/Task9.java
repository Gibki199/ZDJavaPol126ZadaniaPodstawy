package pl.sdacademy.java.basic.exercises.day1;

class Task9 {
    public static void main(String[] args) {

        for (int i = 1; i <= 15; i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    private static String fizzBuzz(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
