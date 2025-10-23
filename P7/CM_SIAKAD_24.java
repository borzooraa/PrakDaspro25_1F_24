package P7;

import java.util.Scanner;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class CM_SIAKAD_24 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner(System.in);
        String nama, nim, huruf1, huruf2, huruf3, statusSem, statusSem2; // huruf(1,2,3)=pancasila, daspro, bing
        int sks1 = 2, sks2 = 3, sks3 = 2, totSKS = sks1 + sks2 + sks3;
        double setara1, setara2, setara3, ip;

        System.out.println("==== INPUT DATA SISWA ====");
        System.out.print("Nama : ");
        nama = Kiyah.nextLine();
        System.out.print("NIM : ");
        nim = Kiyah.nextLine();
        System.out.println("Masukkan Nilai Angka (0 - 100)");
        System.out.print("1. Pancasila: ");
        double nilai1 = Kiyah.nextDouble();
        System.out.print("2. Dasar Pemrograman: ");
        double nilai2 = Kiyah.nextDouble();
        System.out.print("3. Bahasa Inggris 1: ");
        double nilai3 = Kiyah.nextDouble();

        if (nilai1 < 0 || nilai1 > 100 || nilai2 < 0 || nilai2 > 100 || nilai3 < 0 || nilai3 > 100) {
            System.out.println("[ERROR] Nilai tidak valid! Semua nilai harus berada di antara 0 - 100.");
        } else {
            if (nilai1 < 40) {
                huruf1 = "E";
                setara1 = 0;
            } else if (nilai1 < 51) {
                huruf1 = "D";
                setara1 = 1;
            } else if (nilai1 < 61) {
                huruf1 = "C";
                setara1 = 2;
            } else if (nilai1 < 66) {
                huruf1 = "C+";
                setara1 = 2.5;
            } else if (nilai1 < 74) {
                huruf1 = "B";
                setara1 = 3;
            } else if (nilai1 < 81) {
                huruf1 = "B+";
                setara1 = 3.5;
            } else {
                huruf1 = "A";
                setara1 = 4;
            }

            if (nilai2 < 40) {
                huruf2 = "E";
                setara2 = 0;
            } else if (nilai2 < 51) {
                huruf2 = "D";
                setara2 = 1;
            } else if (nilai2 < 61) {
                huruf2 = "C";
                setara2 = 2;
            } else if (nilai2 < 66) {
                huruf2 = "C+";
                setara2 = 2.5;
            } else if (nilai2 < 74) {
                huruf2 = "B";
                setara2 = 3;
            } else if (nilai2 < 81) {
                huruf2 = "B+";
                setara2 = 3.5;
            } else {
                huruf2 = "A";
                setara2 = 4;
            }

            if (nilai3 < 40) {
                huruf3 = "E";
                setara3 = 0;
            } else if (nilai3 < 51) {
                huruf3 = "D";
                setara3 = 1;
            } else if (nilai3 < 61) {
                huruf3 = "C";
                setara3 = 2;
            } else if (nilai3 < 66) {
                huruf3 = "C+";
                setara3 = 2.5;
            } else if (nilai3 < 74) {
                huruf3 = "B";
                setara3 = 3;
            } else if (nilai3 < 81) {
                huruf3 = "B+";
                setara3 = 3.5;
            } else {
                huruf3 = "A";
                setara3 = 4;

            }

            ip = ((sks1 * setara1) + (sks2 * setara2) + (sks3 * setara3)) / 7;

            if (ip < 2) {
                statusSem = "TIDAK LULUS SEMESTER (IP KURANG DARI 2)";
            } else if (nilai1 < 50) {
                statusSem = "TIDAK LULUS SEMESTER (NILAI PANCASILA D)";
            } else if (huruf2 == "E" || huruf3 == "E") {
                statusSem = "TIDAK LULUS SEMESTER (NILAI ADA YANG E)";

            } else {
                statusSem = "LULUS SEMESTER";
            }
                  

       

            System.out.print("====================================================");
            System.out.print("\n           HASIL KONVERSI NILAI MAHASISWA        ");
            System.out.println("\n====================================================");
            System.out.print("Nama : " + nama);
            System.out.println("\nNIM : " + nim);
            System.out.println("\n-----------------------------------------------------");
            System.out.println("Mata Kuliah             SKS     Nilai  Huruf   Setara");
            System.out.println("\n-----------------------------------------------------");
            System.out.print("Pancasila");
            System.out.print("\t\t " + sks1);
            System.out.print("\t" + nilai1);
            System.out.print("\t " + huruf1);
            System.out.print("\t" + setara1);
            System.out.print("\nDasar Pemrograman");
            System.out.print("\t " + sks2);
            System.out.print("\t" + nilai2);
            System.out.print("\t " + huruf2);
            System.out.print("\t" + setara2);
            System.out.print("\nBahasa Inggris 1");
            System.out.print("\t " + sks3);
            System.out.print("\t" + nilai3);
            System.out.print("\t " + huruf3);
            System.out.print("\t" + setara3);
            System.out.println("\n-----------------------------------------------------");
            System.out.println("Total SKS: 7");
            System.out.println("Total Bobot: " + ((sks1 * setara1) + (sks2 * setara2) + (sks3 * setara3)));
            System.out.println("Indeks Prestasi (IP): " + ip);
            System.out.println("Status Semester: " + statusSem);
                    

        }

    }
}