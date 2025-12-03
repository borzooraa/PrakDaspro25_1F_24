package P14;

import java.util.Scanner;

public class rekapPenjualanCafe24 {
    static int penjualan[][] = {
            { 20, 20, 25, 20, 10, 60, 10 },
            { 30, 80, 40, 10, 15, 20, 25 },
            { 5, 9, 20, 25, 10, 5, 45 },
            { 50, 8, 17, 18, 10, 30, 6 },
            { 15, 10, 16, 15, 10, 10, 55 }
    };
    static String menu[] = { "Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan" };
    static Scanner Kiyah = new Scanner(System.in);

    static void input() {
        for (int i = 0; i < penjualan.length; i++) {
            System.out.print("Penjualan menu " + menu[i] + " dalam seminggu: \n");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("- Hari ke-" + (j + 1) + ":\t");
                penjualan[i][j] = Kiyah.nextInt();
            }
        }
    }

    static void tampilPenjualan() {
        System.out.print("\t\t");
        for (int j = 0; j < penjualan[0].length; j++) {
            System.out.print("Hari ke-" + (j + 1) + "\t");
        }
        System.out.println();
        for (int i = 0; i < penjualan.length; i++) {
            for (int j = 0; j < penjualan[i].length; j++) {
                if (j == 0) {
                    System.out.print(menu[i] + "\t");
                }
                if (menu[i].length() > 5) {
                    System.out.print(" " + penjualan[i][j] + "\t\t");
                } else {
                    System.out.print("\t " + penjualan[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

    static void penjualanTertinggi() {
        int menuTertinggi = 0;
        int tertinggi = 0;
        for (int i = 0; i < menu.length; i++) {
            int totalPen = 0;
            for (int j = 0; j < menu.length; j++) {
                totalPen += penjualan[i][j];
            }
            if (totalPen > tertinggi) {
                tertinggi = totalPen;
                menuTertinggi = i;
            }
        }
        System.out.println("Penjualan tertinggi:\t\t" + menu[menuTertinggi]);
        System.out.println("Total terjual minggu ini:\t" + tertinggi);
    }

    static void rataMenu() {
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            System.out.println("Penjualan menu " + menu[i] + " rata-ratanya adalah " + (total / penjualan[i].length));
        }
    }

    public static void main(String[] args) {
        input();
        tampilPenjualan();
        penjualanTertinggi();
        rataMenu();

    }
}