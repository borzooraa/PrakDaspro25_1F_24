package P11;

import java.util.Scanner;

public class arrayRataNilai24 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner(System.in);
        int[] nilaiMhs = new int[10]; 
        int totMhsLul=0;
        double total = 0, rata = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+ " : ");
            nilaiMhs[i]= Kiyah.nextInt();
          } for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                totMhsLul++;
            }
        } rata = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = "+rata);
        System.out.println("Jumlah mahasiswa lulus = "+totMhsLul);

    }
}
