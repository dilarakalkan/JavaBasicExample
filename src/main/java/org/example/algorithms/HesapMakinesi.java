package org.example.algorithms;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1, sayi2, secim;

        System.out.println("İlk sayıyı giriniz: ");
        sayi1 = scanner.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        sayi2 = scanner.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seçin:");
        System.out.println("1 - Toplama");
        System.out.println("2 - Çıkarma");
        System.out.println("3 - Çarpma");
        System.out.println("4 - Bölme");

        secim = scanner.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Toplama: " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Çarpma: " + (sayi1 * sayi2));
                break;
            case 4:
                if (sayi2 == 0) {
                    System.out.println("Hata: Sıfıra bölme yapılamaz!");
                } else {
                    System.out.println("Bölme: " + (sayi1 / sayi2));
                }
                break;
            default:
                System.out.println("Geçersiz bir işlem seçtiniz.");
        }

        scanner.close();
    }
}
