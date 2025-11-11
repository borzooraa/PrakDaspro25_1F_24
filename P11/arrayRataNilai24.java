package P11;

import java.util.Scanner;

public class arrayRataNilai24 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        double total = 0, rata = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+ " : ");
            nilaiMhs[i]= Kiyah.nextInt();
        } for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        } rata = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = "+rata);

    }
}
