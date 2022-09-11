package ru.mirea.lab1;

import java.util.Arrays;

public class class_2 {
    public static void main(String[] args) {
        double[] d = new double[10];
        for (int i = 1; i < 10; i++) {
            d[i] = 0;
        }
        for (int i = 0; i < 10; i++) {
                d[i] = d[i] + (double) 1 / (i + 1);
                d[i] = Math.round(d[i]*100.0) / 100.0;
        }
        double s = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(d[i]);
            s = s + d[i];
        }
        System.out.println("s = " + s);
    }
}
