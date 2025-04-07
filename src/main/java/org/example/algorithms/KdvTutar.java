package org.example.algorithms;

import java.util.Scanner;

public class KdvTutar {
    public static void main( String []args){
        Scanner scan=new Scanner(System.in);

        double price;
        double rate=18;

        System.out.print("Tutar giriniz: ");
        price=scan.nextDouble();
        System.out.println(price);
        double kdvPrice=price+(rate/100);
        double total=price+kdvPrice;

    }
}
