package P6;

import java.util.Scanner;

public class ganjilGenap24 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner (System.in);
        int angka;
        System.out.print("Angka: ");
        angka =  Kiyah.nextInt();


        if (angka %2 == 0){
            System.out.print("Genap");
        }else { 
            System.out.print("Ganjil");
        }
    }
}
