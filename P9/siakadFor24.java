package P9;

import java.util.Scanner;

public class siakadFor24 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner (System.in);
        int cLulus=0, cTdkLulus=0;
        double nilai, nTinggi=0, nRendah=100;

        for (int i = 1; i <=10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+i+": ");
            nilai = Kiyah.nextDouble();
            if (nilai > nTinggi){
                nTinggi = nilai;
            }
            if (nilai < nRendah){
                nRendah = nilai;
            }
            if (nilai >= 60) {
                cLulus++;
            }else
             cTdkLulus++; 
        }
        
        System.out.print("Nilai tertinggi: "+nTinggi);
        System.out.print("\nNilai terendah: "+nRendah);
        System.out.print("\nJumlah mahasiswa yang lulus: "+cLulus);
        System.out.print("\nJumlah mahasiswa yang tidak lulus: "+cTdkLulus);
    }
}
