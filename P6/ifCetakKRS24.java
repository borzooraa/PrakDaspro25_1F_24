package P6;

import java.util.Scanner;

public class ifCetakKRS24 {
    public static void main(String[] args) {
      Scanner Kiyah = new Scanner (System.in);
    
    System.out.println("--- Cetak KRS SIAKAD ---");
    System.out.print ("Apakah UKT sudah lunas? (true/false): ");
    boolean uktLunas = Kiyah.nextBoolean();
    String output;

    System.out.print(output = (uktLunas) ? "Pembayaran UKT terverivikasi \nSilakan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");


    }
}
