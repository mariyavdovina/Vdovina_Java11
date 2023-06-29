package tasks;

import java.util.Scanner;

public class Task2 {
    private static Scanner in = new Scanner(System.in);

    public static void readingName() {
        System.out.println("Type your name:\n");
        String input = in.nextLine().toLowerCase().trim();
        String reference = "Вячеслав";
        if (input.equals(reference.toLowerCase())) {
            System.out.println("Привет, " + reference);
        } else {
            System.out.println("Нет такого имени");
        }
    }

    public static void main(String[] args) {
        readingName();
    }
}

