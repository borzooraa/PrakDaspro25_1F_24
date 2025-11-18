package P12;

import java.util.Scanner;

public class bioskopWithScanner24 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner(System.in);
        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            nama=Kiyah.nextLine();
            System.out.print("Masukkan baris: ");
            baris= Kiyah.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom= Kiyah.nextInt();
            Kiyah.nextLine();

            penonton[baris-1][kolom-1]=nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = Kiyah.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
