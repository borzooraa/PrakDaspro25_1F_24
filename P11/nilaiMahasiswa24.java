package P11;

import java.util.Scanner;

public class nilaiMahasiswa24 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner(System.in);
        System.out.print("Masukkan banyaknya mahasiswa yang akan diinput: ");
        int jumlah = Kiyah.nextInt();

        int[] nilaiMhs = new int[jumlah];
        int total = 0;
        int tertinggi, terendah;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = Kiyah.nextInt();
            total += nilaiMhs[i];
        }

        tertinggi = nilaiMhs[0];
        terendah = nilaiMhs[0];

        for (int i = 1; i < jumlah; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        double rata = (double) total / jumlah;

        System.out.println();
        System.out.println("Daftar nilai mahasiswa:");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i]);
        }

        System.out.println();
        System.out.println("Nilai rata-rata = " + rata);
        System.out.println("Nilai tertinggi = " + tertinggi);
        System.out.println("Nilai terendah  = " + terendah);

    }
}
