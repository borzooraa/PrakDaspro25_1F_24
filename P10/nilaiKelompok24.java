package P10;

import java.util.Scanner;

public class nilaiKelompok24 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner(System.in);
        int   i=1, nilai, kelTinggi=0;
        float totNilai, rataNilai, rataTinggi=0;
     
        while (i<=6) {
            System.out.println("\nKelompok "+i);
            
            
            totNilai=0;
                    for (int j = 1; j <= 5; j++) {
                        System.out.print("Nilai dari Kelompok Penilai" +j+": ");
                        nilai = Kiyah.nextInt();
                        totNilai+=nilai;
                    }
                    rataNilai=totNilai/5;
                    if (rataNilai>rataTinggi){
                        rataTinggi = rataNilai;
                        kelTinggi=i;
                    }
                    System.out.print("Kelompok "+i+ ": nilai rata-rata " +rataNilai);
                    i++;
                }
                System.out.print("\nNilai rata-rata tertinggi: "+ rataTinggi);
                System.out.print("\nKelompok dengan nilai rata-rata tertinggi: "+kelTinggi);
    }
}
