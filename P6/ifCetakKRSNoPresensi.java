package P6;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class ifCetakKRSNoPresensi {
    public static void main(String[] args) {
      Scanner Kiyah = new Scanner (System.in);
    
    System.out.println("--- Cetak KRS SIAKAD ---");
    System.out.print ("Apakah UKT sudah lunas? (true/false): ");
    boolean uktLunas = Kiyah.nextBoolean();

    if (uktLunas) {
        System.out.println("Pembayaran UKT terverivikasi");
        System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");

        
    }
  
    }
}
