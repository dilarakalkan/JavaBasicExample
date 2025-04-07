package org.example.algorithms;

import java.util.Scanner;
//80-100 arası A
//60-80 arası B
//50-60 arası c

public class NotGırıs {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Notunuzu giriniz:");
        int not=scanner.nextInt();

        if(not>=80 && not<=100){
            System.out.println("Notunuz: a");
    }
        else if(not>=60 && not<80){
        System.out.println("Notunuz: b");
    }
        else if(not>0 && not<50){
            System.out.println("Notunuz: F");
        }
        else{
        System.out.println("Geçersiz not girdiniz");
    }
scanner.close();
}

    }


