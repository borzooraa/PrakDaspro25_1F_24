import java.util.Scanner;

public class kafe24 {
    static Scanner Kiyah = new Scanner(System.in);

    public static void Menu(String namaPel, boolean isMem, String kodePromo) {
        System.out.println("Selamat datang, " + namaPel + "!");

        if (isMem) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Selamat, anda mendapatkan diskon 50%!");
        } else if (kodePromo.equalsIgnoreCase("Diskon30")) {
            System.out.println("Selamat, anda mendapatkan diskon 30%!");
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

    public static int hitungTotHrg24(int pilihanMenu, int banyakItem) {
        int[] hrgItems = { 15000, 20000, 22000, 12000, 10000, 18000 };

        int hargaTotal = hrgItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    public static void main(String[] args) {
        Menu("Andi", true, "diskon50");
        int pilMenu, totItems, totalBayar;
        System.out.print("Silahkan pilih menu yang anda inginkan: ");
        pilMenu = Kiyah.nextInt();
        System.out.print("Jumlah item: ");
        totItems = Kiyah.nextInt();
        totalBayar = hitungTotHrg24(pilMenu, totItems);
        System.out.println("Total yang harus dibayarkan: "+totalBayar);
    }
}
