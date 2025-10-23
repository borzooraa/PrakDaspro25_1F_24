package P9;

import java.util.Scanner;

public class KafeDoWhile24 {
    public static void main(String[] args) {
       Scanner Kiyah = new Scanner(System.in);
       int kopi, teh, roti, hKopi=12000, Hteh=7000, Hroti=20000, totHrg;
       String namaPelanggan; 

       do{
        System.out.print("\nMasukkan nama pelanggan (ketik 'batal' untuk keluar): ");
        namaPelanggan=Kiyah.nextLine();
        if (namaPelanggan.equalsIgnoreCase("batal")){
            System.out.println("Transaksi dibatalkan.");
            break;
        }
        System.out.print("Jumlah Kopi: ");
        kopi = Kiyah.nextInt();
        System.out.print("Jumlah Teh: ");
        teh=Kiyah.nextInt();
        System.out.print("Jumlah roti: ");
        roti=Kiyah.nextInt();
        totHrg=(kopi*hKopi)+(teh*Hteh)+(roti*Hroti);
        System.out.print("Total harga yang harus dibayar: Rp "+totHrg);
        Kiyah.nextLine();

       }while(true);
       System.out.println("Semua transaksi selesai.");
    }
}
