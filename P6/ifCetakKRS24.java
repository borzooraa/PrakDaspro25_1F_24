package P6;

import java.util.Scanner;

public class ifCetakKRS24 {
    public static void main(String[] args) {
      Scanner Kiyah = new Scanner (System.in);
    
    System.out.println("--- Cetak KRS SIAKAD ---");
    System.out.print ("Apakah UKT sudah lunas? (true/false): ");
    boolean uktLunas = Kiyah.nextBoolean();

    if (uktLunas) {
        System.out.println("Pembayaran UKT terverivikasi");
        System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
    }
    else{
      System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
    
    }

  
    }
}
