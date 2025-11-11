package P11;

import java.util.Scanner;

public class arrayRataNilai24 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner(System.in);
        double totLulus = 0, totTdkLul=0, rataLulus, rataTdkLulus;
        int jlhLulus = 0, jlhTdkLulus= 0;
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jlhMhs = Kiyah.nextInt();
        int[] nilaiMhs = new int[jlhMhs]; 
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+ " : ");
            nilaiMhs[i]= Kiyah.nextInt();
           if (nilaiMhs[i] > 70) {
            totLulus += nilaiMhs[i];
            jlhLulus++;
          }else {
            totTdkLul += nilaiMhs[i];
            jlhTdkLulus++;
          }
        }
        
        rataLulus=(jlhLulus > 0)? totLulus/jlhLulus:0;
        rataTdkLulus=(jlhTdkLulus > 0)? totTdkLul/jlhTdkLulus:0;

        System.out.println("Rata-rata nilai lulus = "+rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = "+rataTdkLulus);
        
    }
}
