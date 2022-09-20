package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert first digit: ");
        int x = scanner.nextInt();
        System.out.print("Please insert second digit: ");
        int y = scanner.nextInt();

        System.out.println("If x is greater than y: " + xLargerThanY(x, y));
        System.out.println("If x * 3 is greater than y: " + xMultiplyBy3IsLargerThanY(x, y));
        System.out.println("If y++ is smaller than ++x and --x is smaller than y++: " + isYPlusIsSmallerThanXPlusAlsoMinusXisSmallerThanYPlus(x, y));
        System.out.println("If x * y is even: " + isXMultipliedByYEven(x, y));

        scanner.close();

    }
    private static boolean xLargerThanY (int x, int y) {
        if(x > y) {
            return true;
        }
        return false;
    }
    private static boolean xMultiplyBy3IsLargerThanY (int x, int y){
        if (x * 3 > y){
            return true;
        }
        return false;
    }
    private static boolean isYPlusIsSmallerThanXPlusAlsoMinusXisSmallerThanYPlus (int x, int y) {
        if(y++ < ++x && --x < y++){
            return true;
        }
        return false;
    }
    private static boolean isXMultipliedByYEven (int x, int y) {
        if ((x * y) %2 == 0) {
            return true;
        }
        return false;
    }
}
