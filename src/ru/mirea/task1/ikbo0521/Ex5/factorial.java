package ru.mirea.task1.ikbo0521.Ex5;

import java.util.Scanner;

public class factorial {
    public static void Factorial(int n) {  //Создаём метод
        int d = 1;
        for (int j = 1; j <= n;j++){
            d *= j;
        }
        System.out.println(d);
    }

    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.println("Введи число:");
        int n = f.nextInt();
        Factorial(n);  //Используем метод
    }
}
