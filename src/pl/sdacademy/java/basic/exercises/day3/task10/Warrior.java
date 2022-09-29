package pl.sdacademy.java.basic.exercises.day3.task10;

class Warrior {
    private final String name;
    private final int strength;
    private int hp;
    private boolean isAlive = true;

    public Warrior(String name, int strength, int hp) {
        this.name = name;
        this.strength = strength;
        this.hp = hp;
    }

    public void fight(Warrior warrior) {

        for (int i = 1; i < this.hp + 1; i++) {
            System.out.println("Round " + i);
            warrior.hp -= this.strength;
            System.out.println(this.name + " hits for: " + this.strength);
            System.out.println(this.name + " is alive: " + isAlive);
            this.hp -= warrior.strength;
            System.out.println(warrior.name + " hits for: " + warrior.strength);
            System.out.println(warrior.name + " is alive: " + isAlive);


            if (warrior.hp <= 0) {
                warrior.isAlive = false;
                System.out.println(warrior.name + " is dead");
                break;
            } else if (this.hp <= 0) {
                this.isAlive = false;
                System.out.println(this.name + " is dead");
                break;
            }

        }
    }
}
