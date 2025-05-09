package org.example.algorithms;

import java.util.Scanner;

public class FibonacciTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int input = scanner.nextInt();

        int s1 = 0;
        int s2 = 1;
        int toplam;

        System.out.print(input + " sayısının Fibonacci serisi: ");

        for (int i = 1; i <= input; i++) {
            System.out.print(s1 + ", ");
            toplam = s1 + s2;
            s1 = s2;
            s2 = toplam;
        }
        scanner.close();
    }
}

//s2'yi s1'e aktar topla gibi