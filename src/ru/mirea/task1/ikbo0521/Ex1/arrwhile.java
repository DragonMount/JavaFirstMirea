package ru.mirea.task1.ikbo0521.Ex1;

public class arrwhile {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        int i = 0;
        while(i < arr.length){
            sum += arr[i];
            i++;
        }
        System.out.println("Сумма равна: " + sum);
    }
}
