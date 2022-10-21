package ru.mirea.task1.ikbo0521.Ex1;

public class arrdowhile {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int i = 0;
        int sum = 0;
        do {
            sum += arr[i];
            i++;
        } while (i < arr.length);
        System.out.println("Сумма равна: " + sum);
    }
}
