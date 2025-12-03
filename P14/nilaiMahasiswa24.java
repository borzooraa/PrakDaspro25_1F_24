package P14;

import java.util.Scanner;

public class nilaiMahasiswa24 {
    Scanner Kiyah = new Scanner(System.in);
     static void isianArray(int[] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
    }

    static void tampilArray(int[] arr) {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Mahasiswa " + (i + 1) + " = " + arr[i]);
        }
    }

    static int hitTot(int[] arr) {
        int total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        int[] nilai = new int[jumlah];
        isianArray(nilai);
        tampilArray(nilai);
        int total = hitTot(nilai);
        System.out.println("\nTotal nilai seluruh mahasiswa: " + total);
        input.close();
    }
}
