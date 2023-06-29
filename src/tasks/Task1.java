package tasks;

import java.util.Scanner;

public class Task1 {
    private static Scanner in = new Scanner(System.in);

    public static void greetIfNumberGraterThanSeven() {
        System.out.println("Enter the number:\n");
        int input = in.nextInt();
        if (input > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("Input number is: " + input);
        }
    }

    public static void main(String[] args) {
        greetIfNumberGraterThanSeven();
    }
}