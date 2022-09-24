package pl.sdacademy.java.basic.exercises.day3.task7;

import java.util.Objects;

class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Miau");
    }

    public void eatMice(int mice){
        System.out.println("I ate " + mice + " mice.");
    }

    public void print(){
        /*
        oba zapisy są równoważne
         */
        System.out.println(this);
//        System.out.println(this.toString());
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
