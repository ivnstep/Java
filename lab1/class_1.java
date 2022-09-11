package ru.mirea.lab1;

import java.util.Scanner;
public class class_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a length of array: \n");
        int num = in.nextInt();
        int a[] = new int[num];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Input a number: \n");
            int num_a = in.nextInt();
            a[i] = num_a;
        }
        in.close();
        int s_for = 0;
        int s_while = 0;
        int s_dowhile = 0;
        for (int i = 0; i < a.length; i++) {
            s_for = s_for + a[i];
        }
        System.out.println("s_for = " + s_for);
        int i = 0;
        while (i < a.length) {
            s_while = s_while + a[i];
            i++;
        }

        System.out.println("s_while = " + s_while);
        i = 0;
        do {
            s_dowhile = s_dowhile + a[i];
            ++i;
        } while (i < a.length);
        System.out.println("s_dowhile = " + s_dowhile);
    }
}
