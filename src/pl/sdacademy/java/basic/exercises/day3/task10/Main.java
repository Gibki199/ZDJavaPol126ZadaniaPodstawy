package pl.sdacademy.java.basic.exercises.day3.task10;

class Main {
    public static void main(String[] args) {
        Warrior andrzej = new Warrior("Andrzej", 2, 20);
        Warrior mietek = new Warrior("Mietek", 10, 20);


        andrzej.fight(mietek);
    }
}
