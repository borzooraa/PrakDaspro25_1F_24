package P11;

import java.util.Scanner;

public class arrayNilai24 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner(System.in);
        int [] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i]=Kiyah.nextInt();
        } for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i]>70) {
                System.out.println("Mahasiswa ke-"+i+" lulus!");
            } else 
            System.out.println("Mahasiswa ke-"+i+" tidak lulus!");
        }
    }
}
