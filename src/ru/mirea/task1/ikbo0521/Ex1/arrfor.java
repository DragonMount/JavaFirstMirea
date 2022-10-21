package ru.mirea.task1.ikbo0521.Ex1;

public class arrfor {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for(int i = 0; i < arr1.length; i++){
            sum += arr1[i];
        }
        System.out.println("Сумма равна: " + sum);
    }
}
