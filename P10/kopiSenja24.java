package P10;

import java.util.Scanner;

public class kopiSenja24 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner(System.in);
        int jmlCabang, totCustomer=0, customer, totJual=0, jual=0, itemPelanggan;
        System.out.print("Jumlah cabang kafe: ");
        jmlCabang = Kiyah.nextInt();
        System.out.println("\n=== Input Penjualan Per Cabang ===\n");
        for (int i = 1; i <= jmlCabang; i++) {
            System.out.println("\n---Cabang"+i+"---");
            System.out.print("Jumlah Pelanggan: ");
            customer = Kiyah.nextInt();
            totCustomer += customer;
            jual = 0;
            for (int j = 1; j <= customer; j++) {
                System.out.print("-Pelanggan: "+j+" memesan berapa item? ");
                itemPelanggan=Kiyah.nextInt();
                jual += itemPelanggan;
                totJual += itemPelanggan; 
            }
            System.out.println("Cabang"+i+":");
            System.out.println("-Pelannggan:"+customer+" orang");
            System.out.println("-Item terjual:"+jual);
        }
        System.out.println("\nTotal seluruh Cabang:");
        System.out.println("Pelanggan: "+totCustomer+" orang");
        System.out.println("Item terjual: "+totJual+" item");
    }
}
