package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    private static Scanner in = new Scanner(System.in);

    public static void findNumbersDivisibleByThree() {
        System.out.println("Type array length:\n");
        int length = in.nextInt();
        System.out.println("Generating array of random integer numbers:\n");
        int[] arr = new int[length];
        Random rand = new Random();
        List<Integer> dividingByThree = new ArrayList<Integer>();
        for (int i = 0; i < length; i++) {
            arr[i] = rand.nextInt(100);
            if ((arr[i] % 3) == 0) {
                dividingByThree.add(arr[i]);
            }
            System.out.println(arr[i] + "\n");
        }
        if (dividingByThree.size() != 0) {
            System.out.println("Array elements divisible by 3: ");
            for (int number : dividingByThree) {
                System.out.println(number + " ");
            }
        } else {
            System.out.println("No elements divisible by 3");
        }
    }

    public static void main(String[] args) {
        findNumbersDivisibleByThree();
    }
}
