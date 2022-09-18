package pl.sdacademy.java.basic.exercises.day2;

class Task3 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        String word = "ma";
        System.out.println("Sentence: " + input);
        System.out.println("Word: " + word);
        System.out.println(getIndexOf(input, word));

        word = "nie";
        System.out.println("Sentence: " + input);
        System.out.println("Word: " + word);
        System.out.println(getIndexOf(input, word));

        word = null;
        System.out.println("Sentence: " + input);
        System.out.println("Word: " + word);
        System.out.println(getIndexOf(input, word));

    }
    private static int getIndexOf (String input, String word) {
        if (StringValidator.isValid(input) && StringValidator.isValid(word)){
            return input.indexOf(word);
        }
        return  -1;
    }
}
