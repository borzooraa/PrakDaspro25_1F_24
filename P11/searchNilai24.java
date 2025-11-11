package P11;

import java.util.Scanner;

public class searchNilai24 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan di input: ");
        int jumlah = Kiyah.nextInt();
        int hasil = -1;
        int[] arrNilai = new int[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahsiswa ke-"+(i+1)+": ");
            arrNilai[i]=Kiyah.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = Kiyah.nextInt();


        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil=i;
                break;
            }
        }
        System.out.println();
         if (hasil != -1) {
             System.out.println("Nilai "+key+" ketemu, merupakan nilai mahasiswa ke-"+(hasil+1));
            
         }else {

             System.out.println("Nilai"+key+" tidak ditemukan dalam data.");
         }
    }
}
