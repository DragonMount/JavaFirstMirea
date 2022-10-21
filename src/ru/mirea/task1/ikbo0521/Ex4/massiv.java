package ru.mirea.task1.ikbo0521.Ex4;

import java.util.Random;
import java.util.Arrays;

public class massiv {
    public static void main(String[] args) {
        Random r = new Random(System.currentTimeMillis());
        int[] arr = new int[10];
        System.out.println("Изначальный массив:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
            System.out.println("Arr["+i+"] = " + arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Arr["+i+"] = "+arr[i]);
        }

    }
}
