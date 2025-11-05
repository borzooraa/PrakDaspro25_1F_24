package P10;

import java.util.Scanner;

public class nilaiKelompok24 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner(System.in);
        int   i=1, nilai;
        float totNilai, rataNilai;

        while (i<=6) {
            System.out.println("Kelompok "+i);
            
                totNilai=0;
                    for (int j = 1; j <= 5; j++) {
                        System.out.print("Nilai dari Kelompok Penilai" +j+": ");
                        nilai = Kiyah.nextInt();
                        totNilai+=nilai;
                    }
                    rataNilai=totNilai/5;
                    System.out.println("Kelompok 5: nilai rata-rata= "+rataNilai);
                    i++;
        }
    }
}
