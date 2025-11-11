package P11;

import java.util.Scanner;

public class pemesananMaMi {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner(System.in);
         System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = Kiyah.nextInt();
        Kiyah.nextLine(); 

        String[] namaPesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nama makanan/minuman ke-" + (i + 1) + ": ");
            namaPesanan[i] = Kiyah.nextLine();

            System.out.print("Masukkan harga untuk " + namaPesanan[i] + ": ");
            hargaPesanan[i] = Kiyah.nextInt();
            Kiyah.nextLine(); 
            total += hargaPesanan[i];
        }

        System.out.println();
        System.out.println("Daftar Pesanan:");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp" + hargaPesanan[i]);
        }

        System.out.println();
        System.out.println("Total biaya semua pesanan: Rp" + total);

    }
}
