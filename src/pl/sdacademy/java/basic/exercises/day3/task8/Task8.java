package pl.sdacademy.java.basic.exercises.day3.task8;

class Task8 {
    public static void main(String[] args) {
        Author wiesławaSzymborska = new Author("Szymborska", "PL");
        Author julianTuwim = new Author("Tuwim", "PL");
        Author janBrzechwa = new Author("Brzechwa", "PL");

        Poem[] poems = new Poem[3];
        poems[0] = new Poem(julianTuwim, 10);
        poems[1] = new Poem(wiesławaSzymborska, 15);
        poems[2] = new Poem(julianTuwim, 6);

        System.out.println("Max: " + getSurnameWIthMaxStropheNumbers(poems));
        System.out.println("Max: " + getAuthorWIthMaxStropheNumbers(poems));



    }
    private static String getSurnameWIthMaxStropheNumbers(Poem[] poems){
        int max = 0;
        String surname= null;
        for (Poem poem : poems) {
            int currentStropheNumbers = poem.getStropheNumbers();
            if (max < currentStropheNumbers){
                max = currentStropheNumbers;
                surname = poem.getCreator().getSurname();
            }
        }

        return surname;
    }

    private static Author getAuthorWIthMaxStropheNumbers(Poem[] poems){
        int max = 0;
        Author author= null;
        for (Poem poem : poems) {
            int currentStropheNumbers = poem.getStropheNumbers();
            if (max < currentStropheNumbers){
                max = currentStropheNumbers;
                author = poem.getCreator();
            }
        }

        return author;
    }

}
