package org.example.algorithms;

import java.util.Scanner;

//kn başına
//12 yaşından küçükse %12
//12-24 arasında ise %10
//65ten büyükse %30
//gidiş dönüş alanlara %20 indirim
public class UcakBileti {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int km,yas,tip;
        System.out.println("Mesafe giriniz:");
        km=scan.nextInt();

        System.out.println("Yasinizi giriniz:");
        yas=scan.nextInt();

        System.out.println("Yolculuk tipini seçiniz: ");
        tip=scan.nextInt();
        //1 sadece gidiş 2 gidiş dönüş
        double normalFiyat, yasIndirimi, tipIndirimi, toplamFiyat;
        if(km>0 && yas>0 &&(tip==1 || tip==2)){
            normalFiyat=km*0.10;

            //yas indirimi
            if(yas<12){
                yasIndirimi=normalFiyat*0.50;

            } else if (yas>=12 && yas<=24) {
                yasIndirimi=normalFiyat*0.10;

            }else if(yas>65){
                yasIndirimi=normalFiyat*0.30;
            }else{
                yasIndirimi=0;
            }
            toplamFiyat=normalFiyat-yasIndirimi;
            //yolculuk tipi inceleme
            if(tip==2){
                tipIndirimi=toplamFiyat*0.20;
                toplamFiyat=(toplamFiyat-tipIndirimi)*2;
            }
            System.out.println("Toplam bilet fiyatı:+ " +toplamFiyat+"TL");

        }else{
            System.out.println("eksik veya yanlış bilgi");
        }

    }
}
