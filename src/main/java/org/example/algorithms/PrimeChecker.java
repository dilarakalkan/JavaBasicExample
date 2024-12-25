package org.example.algorithms;

import java.util.Scanner;

//asal sayı kontrolü yapmak için kullanılan algoritma
public class PrimeChecker {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();

        boolean isPrime=true;
        if (num<=1) {
            isPrime = false;
        }
        else{
            for(int i=2; i<=Math.sqrt(num); i++){
                if(num% i ==0){
                    isPrime=false;
                    break;
                }
            }
        }
if(isPrime){
    System.out.println(num+ " bir asal sayıdır");

}else{
    System.out.println(num+ "asal sayı değildir");
}
    }
}
