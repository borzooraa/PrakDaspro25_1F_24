package P9;

import java.util.Scanner;

public class tarifParkir24 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner(System.in);
        int durasi = 0, total = 0, jenis;

        while (true) {
            System.out.print("\nMasukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): ");
            jenis = Kiyah.nextInt();

            if (jenis == 0) {
                break;
            }

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir: ");
                durasi = Kiyah.nextInt();
                if (durasi > 5) {
                    total += 12500;
                } else {
                    if (jenis == 1) {
                        total += durasi * 3000;
                    } else {
                        total += durasi * 2000;
                    }
                }
            } else {
                System.out.print("Jenis kendaraan tidak valid, masukkan ulang jenis kendaraan!");
                continue;
            }
        } System.out.print("Total pendapatan hari ini: Rp" + total);
    }
}
