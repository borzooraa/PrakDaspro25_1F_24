package P11;

import java.util.Scanner;

public class mencariMaMiDiMenu {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner(System.in);

        String[] menu = {
                "Nasi Goreng", "Mie Goreng", "Roti Bakar",
                "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };

        System.out.println("=== Daftar Menu Kafe 24 ===");
        for (String item : menu) {
            System.out.println("- " + item);
        }

        System.out.print("\nMasukkan nama makanan yang ingin dicari: ");
        String cari = Kiyah.nextLine();

        
        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) { 
                ditemukan = true;
                System.out.println("\n " + menu[i] + " tersedia di menu kami.");
                break; 
            }
        }

        if (!ditemukan) {
            System.out.println("\n Maaf, " + cari + " tidak tersedia di menu kami.");
        }

    }
}
