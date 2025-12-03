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

    public static double hitungTotHrg24(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hrgItems = { 15000, 20000, 22000, 12000, 10000, 18000 };
        double diskon;
        double hargaTotal = hrgItems[pilihanMenu - 1] * banyakItem;
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Selamat, anda mendapatkan diskon 50%!");
            diskon=hargaTotal*0.5;
            hargaTotal-=diskon;
        } else if (kodePromo.equalsIgnoreCase("Diskon30")) {
            System.out.println("Selamat, anda mendapatkan diskon 30%!");
            diskon=hargaTotal*0.3;
            hargaTotal-=diskon;
        } else {
            System.out.println("Kode invalid");
        }
    
        return hargaTotal;
    }

    public static void main(String[] args) {
        Menu("Andi", true);
        int pilMenu, totItems;
        double totalBayar;
        System.out.print("Silakan pilih menu yang anda inginkan: ");
        pilMenu = Kiyah.nextInt();
        System.out.print("Jumlah item: ");
        totItems = Kiyah.nextInt();
        System.out.print("Silakan maskkan kode promo anda: ");
        Kiyah.nextLine();
        String kodPromo=Kiyah.nextLine();
        totalBayar = hitungTotHrg24(pilMenu, totItems,kodPromo);
        System.out.println("Total yang harus dibayarkan: " + totalBayar);
    }
}
