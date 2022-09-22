package pl.sdacademy.java.basic.exercises.day2;

class Task7 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        char searchedChar = ' ';
        System.out.println("Input: " + input);
        System.out.println("Result " + percentOfCharsInSentence(input, searchedChar));

    }

    private static float percentOfCharsInSentence(String input, char searchedChar) {
        float counter = 0;
        float sum = 0;
        if (StringValidator.isValid(input) && input.contains(String.valueOf(searchedChar))) {
            for (int i = input.indexOf(searchedChar); i < input.length(); i++) {
                char character = input.charAt(i);
                if (character == searchedChar) {
                    counter++;
                }
            }

        }
        sum = (counter / input.length()) * 100;
        return sum;
    }
}
