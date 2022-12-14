package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

class Task2 {
    private static final float PI = 3.14F;

    public static void main(String[] args) {
        float radius = getDiameterFromUser() / 2;
        float circumference = calculateCircumferenceOfACircle(radius);
        float area = calculateAreaOfACircle(radius);

        System.out.println("Circumference of a circle: " + circumference);
        System.out.println("Area of circle: " + area);
    }

    private static float getDiameterFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert diameter: ");
//        float diameter = scanner.nextFloat();
//        return diameter;
        return scanner.nextFloat();
    }
    private static float calculateCircumferenceOfACircle (float radius) {
        // 2 * pi * r
//        return 2 * 3.14f * radius;
//        return 2 * PI * radius;
        return 2 * (float)Math.PI * radius;

    }
    private static float calculateAreaOfACircle(float radius) {
        //pi * r * r
//        return PI * radius * radius;
        return (float)Math.PI * (float)Math.pow(radius, 2);
    }
}
