package org.example.algorithms;

import java.util.Scanner;

    public class Fibonacci {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Fibonacci serisi için eleman sayısı girin:");
            int n = scanner.nextInt();
            int a = 0;
            int b = 1;
            System.out.println("Fibonacci serisi:" + a + " " + b);
            for (int i = 2; i < n; i++) {
                int next = a + b;
                System.out.println(" " + next);
                a = b;
                b = next;
            }
        }
    }


