package pl.sdacademy.java.basic.exercises.day2;


import java.util.Scanner;

class Task17 {
    public static Scanner input;

    public static void main(String[] args) {

        input = new Scanner(System.in);
        int[] array = new int[10];
        int[] sortedArray = array;
        for (int i = 0; i < array.length; i++) {
            System.out.print("Insert digit: ");
            array[i] = input.nextInt();
        }

        System.out.print("Original array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
            // nie dziala XD
//        for (int element : array) {
//            for (int sorted : sortedArray) {
//                if (sorted > element) {
//                    sortedArray[sorted] = element;
//
//                }
//            }
//        }

        System.out.print("Array sorted: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }

        input.close();
    }
//    private static int[] intArray(int[] number){
//
//        for(int i = 0; i)
//        int[] arrayFromLowestToBiggest = new int[intArray().length];
//
//        return
//    }
}
