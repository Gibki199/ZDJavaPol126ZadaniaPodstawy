package pl.sdacademy.java.basic.exercises.day2;

class Task14 {
    public static void main(String[] args) {
        int[] inputs = {12, -7, 19, -5};
        int lengthOfNewArray = countNegativeNumbersInArray(inputs);
        int[] result = createNewArrayWithNegativeValues(inputs, lengthOfNewArray);

        for(int element : result) {
            System.out.print(element + " ");
        }

    }

    private static int countNegativeNumbersInArray(int[] inputs) {
        int counter = 0;
        for (int element : inputs) {
            if (element < 0) {
                counter++;
            }
        }
        return counter;
    }

    private static int[] createNewArrayWithNegativeValues(int[] inputs, int lengthOfNewArray) {
        int[] result = new int[lengthOfNewArray];
        for (int i = 0, j = 0; i < inputs.length; i++) {
            if (inputs[i] < 0) {
                result[j] = inputs[i];
                j++;
            }
        }
        return result;
    }
}
