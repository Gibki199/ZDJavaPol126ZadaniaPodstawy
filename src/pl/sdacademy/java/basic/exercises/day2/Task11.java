package pl.sdacademy.java.basic.exercises.day2;

class Task11 {
    public static void main(String[] args) {
        String input = "kajak";

        System.out.println(isPalindrome(input));
        input = "java";
        System.out.println(isPalindrome(input));
    }
    private static boolean isPalindrome(String input) {
        if (StringValidator.isValid(input)) {
            String reversedInput = new StringBuilder(input)
                    .reverse()
                    .toString();
            return input.equalsIgnoreCase(reversedInput);
            }
            return false;
        }
    }
