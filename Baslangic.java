package Giris;

import java.util.Scanner;
//2146
public class Baslangic {
    static boolean ispalindrom(int sayi){
        int temp=sayi ,lastNumber,tersi=0;
        while (temp!=0) {
            lastNumber = sayi % 10;
            //System.out.println(lastNumber);
            tersi = (tersi * 10) + lastNumber;
            //System.out.println(tersi);
            temp/=10;
            //System.out.println(tersi);
        }
        if(sayi==tersi){
            return true;
        }
        else{
            return false;
        }


        }

    public static void main(String[] args) {
        System.out.println(ispalindrom(99));


    }
}















































