package P12;

import java.util.Scanner;

public class SIAKAD24 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner(System.in);

System.out.print("Masukkan jumlah mahasiswa: ");
int jlhMhs = Kiyah.nextInt();
System.out.print("Masukkan jumlah mata kuliah: ");
int jlhMatkul = Kiyah.nextInt();

        int[][] nilai = new int[jlhMhs][jlhMatkul];

        for (int i = 0; i < jlhMhs; i++) {
            System.out.print("\ninput nilai mahasiswa ke-" + (i + 1) + "\n");
            double totNilSiswa = 0;

            for (int j = 0; j < jlhMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = Kiyah.nextInt();
                totNilSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totNilSiswa / jlhMatkul);
        }
        System.out.println("\n===================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah");
        for (int j = 0; j < jlhMatkul; j++) {
            double totNilMatkul = 0;
            for (int i = 0; i < jlhMhs; i++) {
                totNilMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j + 1) + ": " + totNilMatkul / jlhMhs);
        }
    }
}
