package P9;

import java.util.Scanner;

public class siakadWhile24 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner (System.in);
        int nilai, cMahasiswa, i=0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        cMahasiswa = Kiyah.nextInt();

        while (i < cMahasiswa) {
            System.out.print("\nMasukkan nilai mahasiswa ke-"+(i+1)+": ");
            nilai = Kiyah.nextInt();

            if (nilai < 0 || nilai > 100){
                System.out.print("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                continue;
            }
            if (nilai > 80 && nilai <= 100){
                System.out.print("Nilai mahaiswa ke-" + (i+1)+" adalah A");
            }else if (nilai > 73 && nilai <= 80){
                System.out.print("Nilai mahasiswa ke-"+ (i+1)+" adalah B+");
            }else if (nilai > 65 && nilai <= 73){
                System.out.print("Nilai mahasiswa ke-"+ (i+1)+ " adalah B");
            }else if (nilai > 60 && nilai <= 65){
                System.out.print("Nilai mahasiswa ke-"+ (i+1)+" adalah C+");
            }else if (nilai > 50 && nilai <= 60){
                System.out.print("Nilai mahasiswa ke-"+ (i+1)+" adalah C");
            }else if (nilai > 39 && nilai <= 50){
                System.out.print("Nilai mahasiswa ke-"+ (i+1)+" adalah D");
            }else {
                System.out.print("Nilai mahasiswa ke-"+ (i+1)+" adalah E");
            }
            i++;
        }
    }
}
