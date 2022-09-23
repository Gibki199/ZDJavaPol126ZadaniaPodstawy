package pl.sdacademy.java.basic.exercises.day2;

import java.util.Arrays;

class Task16 {
    public static void main(String[] args) {
        int[] inputArray = {12, 7, 9};
        System.out.println("Array without reverse" + Arrays.toString(inputArray));
        reverseAndPrintArray(inputArray);

    }

    public static void reverseAndPrintArray(int[] inputArray) {
        for (int left = 0, right = inputArray.length -1; left < right; left++, right--) {
            int temp = inputArray[left];
            inputArray[left] = inputArray[right];
            inputArray[right] = temp;
        }
        System.out.print("Reverse array: ");
        for (int val : inputArray)
            System.out.println("" + val);
    }
}
