package ru.mirea.lab1;
import java.util.Arrays;
import java.util.Random;
public class class_3 {
    public static void main(String[] args) {
        int[] ar = new int[10];
        double[] am = new double[10];
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            ar[i] = rnd.nextInt();
            am[i] = Math.random();
        }
        System.out.println("Not sorted Random array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        System.out.println("Not sorted Math.random array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(am[i] + " ");
        }
        System.out.println();
        Arrays.sort(ar);
        Arrays.sort(am);
        System.out.println("Sorted Random array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        System.out.println("Sorted Math.random array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(am[i] + " ");
        }
        System.out.println();
    }
}
