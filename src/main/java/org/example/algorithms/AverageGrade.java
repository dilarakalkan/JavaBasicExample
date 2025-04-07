package org.example.algorithms;

import java.util.Scanner;
//scanner main metodu içinde kullanılır

public class AverageGrade {
    public static void main(String[] args) {
        //kulllanıcadan değer almak için scanner sınıfı kullanmalaıyız
        Scanner input = new Scanner(System.in);
        int fizik, matematik, turkce, kimya, muzik, tarih;

      System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("Matematik notunuz");
        matematik = input.nextInt();

        System.out.print("Turkce notunuz: ");
        turkce = input.nextInt();

        System.out.print("Kimya notunuz:");
        kimya = input.nextInt();

        System.out.println("Muzik notunuz: ");
        muzik = input.nextInt();

        System.out.print("Tarih notunuz:");
        tarih = input.nextInt();

        double sonuc =(fizik+ matematik+ turkce+ kimya+ muzik+ tarih)/6;

        System.out.println("Ortalama: + sonuc");

    }
}
