package pl.sdacademy.java.basic.exercises.day1;

class Task5 {
    public static void main(String[] args) {
        int firstDigit = 4;
        int secondDigit = 11;
        int sum = sumOfTheSequence(firstDigit, secondDigit);
        System.out.println("Sum: " + sum);

    }

    private static int sumOfTheSequence(final int firstDigit, final int secondDigit) {
        int sum = 0;
        //#1 Option
//        for (int i = firstDigit; i <= secondDigit; i++) {
//            sum += i;
//        }
        //#2 Option
//        int i = firstDigit;
//        while (i <= secondDigit){
//            sum += i;
//            i++;
//        }

        //#3 Option
        int i = firstDigit;
        do {
            sum += i;
            i++;
        } while (i <= secondDigit);

        return sum;
    }
}