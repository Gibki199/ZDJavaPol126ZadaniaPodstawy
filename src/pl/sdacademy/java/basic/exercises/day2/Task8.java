package pl.sdacademy.java.basic.exercises.day2;

import java.util.Locale;

class Task8 {
    private static final int VALUE_UPPER_A_IN_ASCII = 65;
    private static final int VALUE_UPPER_Z_IN_ASCII = 90;
    private static final int VALUE_LOWER_A_IN_ASCII = 97;
    private static final int VALUE_LOWER_Z_IN_ASCII = 122;
    private static final int DIFF_UPPER_AND_LOWER_IN_ASCII = 32;

    public static void main(String[] args) {
        String input = "Ala ma KOtA";
        System.out.println("Result: " + replaceChars(input));

    }
    private static String replaceChars(String input){
        if(StringValidator.isValid(input)){
            StringBuilder result = new StringBuilder();
           for(int i = 0; i < input.length(); i++){
               char currentChar = input.charAt(i);
               if(currentChar >= VALUE_UPPER_A_IN_ASCII && currentChar <= VALUE_UPPER_Z_IN_ASCII) { // wielkie litery
//                   String s = String.valueOf(currentChar).toLowerCase(Locale.ROOT); //option 1
//                   String s = String.valueOf(currentChar + 32); // option 2
//                   result = result + s;
                   result.append((char)(currentChar + 32));
               } else if (currentChar >= VALUE_LOWER_A_IN_ASCII && currentChar <= VALUE_LOWER_Z_IN_ASCII) { // małe kutery
                   result.append((char)(currentChar - DIFF_UPPER_AND_LOWER_IN_ASCII));
               } else {
                   result.append(currentChar);
               }
           }
           return result.toString();
        }
        return input;
    }
}
