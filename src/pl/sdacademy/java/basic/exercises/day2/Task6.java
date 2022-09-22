package pl.sdacademy.java.basic.exercises.day2;

class Task6 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        char searchedCharacter = 'a';

        System.out.println("Input: " + input);
        System.out.println("Searched character: " + searchedCharacter);
        System.out.println("Result: " + indexOfFirstInstance(input, searchedCharacter));

        searchedCharacter = 'z';
        System.out.println("Input: " + input);
        System.out.println("Searched character: " + searchedCharacter);
        System.out.println("Result: " + indexOfFirstInstance(input, searchedCharacter));
    }
    private static int indexOfFirstInstance (String input, char searchedCharacter) {
        int counter = -1;
        if(StringValidator.isValid(input) && input.contains(String.valueOf(searchedCharacter))){
            for (int i = input.indexOf(searchedCharacter); i < input.length(); i++){
                char character = input.charAt(i);
                if(character == searchedCharacter){
                    ++counter;

                }
            }
        }
        return counter;
    }
}
