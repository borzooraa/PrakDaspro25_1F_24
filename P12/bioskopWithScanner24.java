package P12;

import java.util.Scanner;

public class bioskopWithScanner24 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner(System.in);
        int baris, kolom;
        String nama, pilih;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton \n2. Tampilkan daftar penonton \n3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            pilih = Kiyah.nextLine();

            if (pilih.equals("1")) {
                System.out.print("Masukkan nama: ");
                nama=Kiyah.nextLine();
                System.out.print("Masukkan baris (1-4): ");
                baris= Kiyah.nextInt();
                System.out.print("Masukkan kolom (1-2): ");
                kolom= Kiyah.nextInt();
                Kiyah.nextLine();
    
                penonton[baris-1][kolom-1]=nama;
                System.out.println("Data tersimpan");
            }else if (pilih.equals("2")){
                System.out.println("\n=== DAFTAR PENONTON ===");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Baris ke-"+(i+1)+ ": ");
                    for (int j = 0; j < penonton[i].length; j++) {
                        System.out.print(penonton[i][j]+ (j == penonton[i].length - 1 ? "" : ", "));
                    }
                    Kiyah.nextLine();
                }
            }else if (pilih.equals("3")) {
                System.out.println("Keluar dari menu");
                break;
            }else {
                System.out.println("Menu tidak valid");
            }
        }
    }
}
