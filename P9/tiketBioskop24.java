package P9;

import java.util.Scanner;

public class tiketBioskop24 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner(System.in);
        int tiket=50000, jmlTiket=0, totTiket=0;
        double bayar, totPenjualan=0;
        String nama, konfirmasi;
        
        
        while (true) {
            System.out.print("Masukkan nama Penonton: ");
            nama = Kiyah.nextLine();
            System.out.print("masukkan jumlah tiket yang dibeli: ");
            jmlTiket = Kiyah.nextInt();

            if (jmlTiket<0){
                System.out.println("Jumlah tiket tidak valid. Input ulang jumlah tiket!");
                Kiyah.nextLine();
                continue;
            }
            if (jmlTiket>10){
                bayar =(jmlTiket*tiket)-((jmlTiket*tiket)*0.15);
            }else if (jmlTiket>4){
                bayar = (jmlTiket*tiket)-((jmlTiket*tiket)*0.1);
            } else{
                bayar = jmlTiket*tiket;
            }
            
            totTiket += jmlTiket;
            totPenjualan += bayar;
            
            System.out.println("Total bayar untuk " + nama + ": Rp " + bayar);
            System.out.println();

            System.out.print("Apakah sudah tutup? ");
            Kiyah.nextLine();
            konfirmasi = Kiyah.nextLine();
            if (konfirmasi.equalsIgnoreCase("ya")){
                break;
            }
        } 
       System.out.println("total tiket yang terjual: "+totTiket);
       System.out.println("total penjualan hari ini: "+totPenjualan);
    }
}
