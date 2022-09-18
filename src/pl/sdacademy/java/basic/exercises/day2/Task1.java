package pl.sdacademy.java.basic.exercises.day2;

class Task1 {
    private static final char DEFAULT_CHAR = '\u0000';
    public static void main(String[] args) {
        String input = "ala";
        System.out.println("Original word: " + input);
        System.out.println("Last char: " + getLastChar(input));

        input = "domek";
        System.out.println("Original word: " + input);
        System.out.println("Last char: " + getLastChar(input));

        input = "java       ";
        System.out.println("Original word: " + input);
        System.out.println("Last char: " + getLastChar(input));

        input = null;
        System.out.println("Original word: " + input);
        System.out.println("Last char: " + getLastChar(input));

        input = "       ";
        System.out.println("Original word: " + input);
        System.out.println("Last char: " + getLastChar(input));

    }

    private static char getLastChar(String input) {
        if (input != null && !input.isBlank()) {
            String trimmedText = input.trim();
            int lastPosition = trimmedText.length() - 1;
            return input.charAt(lastPosition);
        }
        return DEFAULT_CHAR;
    }
}
