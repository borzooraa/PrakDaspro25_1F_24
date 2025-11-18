package P12;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner (System.in); //i = responnden, j = pertanyaan (ini saya indeksnya menyesuaikan bu)
        int[][] nilai = new int[6][10];
        int rataResp, rataPert, totResp;
        double rata, total = 0;

        System.out.println("Input nilai survei (1-5):");

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            totResp = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("  Pertanyaan " + (j + 1) + ": ");
                nilai[i][j] = Kiyah.nextInt();
                totResp += nilai[i][j];
            }

            rataResp = totResp / 10;
            System.out.println("Rata-rata nilai responden ke-" + (i + 1) + ": " + rataResp);
            System.out.println();
        }

        System.out.println("Rata-rata setiap pertanyaan:");
        for (int j = 0; j < nilai[0].length; j++) {
            rataPert = 0;

            for (int i = 0; i < nilai.length; i++) {
                rataPert += nilai[i][j];
            }

            rataPert /= nilai.length;
            System.out.println("Pertanyaan " + (j + 1) + " = " + rataPert);
        }

        System.out.println();
        total = 0;

        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                total += nilai[i][j];
            }
        }

        rata = total / 60; 
        System.out.println("Rata-rata keseluruhan: " + rata);
    }
}
