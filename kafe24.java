import java.util.Scanner;

public class kafe24 {
    static Scanner Kiyah = new Scanner(System.in);

    public static void Menu(String namaPel, boolean isMem) {
        System.out.println("Selamat datang, " + namaPel + "!");

        if (isMem) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappuccino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("===========================");
    }

    public static double hitungTotHrg24(int pilihanMenu, int banyakItem) {
        int[] hrgItems = { 15000, 20000, 22000, 12000, 10000, 18000 };
        double hargaTotal = hrgItems[pilihanMenu - 1] * banyakItem;

        return hargaTotal;
    }

    public static void main(String[] args) {
        Menu("Andi", true);
        int pilMenu, totItems;
        double totalBayar = 0;
        String lagi;
        double diskon;
        do {
            System.out.print("Silakan pilih menu yang anda inginkan: ");
            pilMenu = Kiyah.nextInt();
            System.out.print("Jumlah item: ");
            totItems = Kiyah.nextInt();
            totalBayar += hitungTotHrg24(pilMenu, totItems);
            System.out.println("Apakah ada menu lain yang ingin di pesan? (y/n)");
            Kiyah.nextLine();
            lagi = Kiyah.nextLine();
        } while (lagi.equalsIgnoreCase("y"));
        System.out.print("Silakan maskkan kode promo anda: ");
        String kodPromo = Kiyah.nextLine();
        if (kodPromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Selamat, anda mendapatkan diskon 50%!");
            diskon = totalBayar * 0.5;
            totalBayar -= diskon;
        } else if (kodPromo.equalsIgnoreCase("Diskon30")) {
            System.out.println("Selamat, anda mendapatkan diskon 30%!");
            diskon = totalBayar * 0.3;
            totalBayar -= diskon;
        } else {
            System.out.println("Kode invalid");
        }
        System.out.println("Total yang harus dibayarkan: " + totalBayar);
    }
}
