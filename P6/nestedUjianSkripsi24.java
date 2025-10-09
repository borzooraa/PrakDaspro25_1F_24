package P6;

import java.util.Scanner;

public class nestedUjianSkripsi24 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner (System.in);
        String pesan;
        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = Kiyah.nextLine();

        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = Kiyah.nextInt();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = Kiyah.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")){
            if (bimbinganP1 > 8 && bimbinganP2 > 4){
                System.out.println("Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi");
            }else if (bimbinganP1 < 8 && bimbinganP2 < 4){
                System.out.println("Gagal! Log pembimbing P1 kurang dari 8 kai dan P2 kurang dari 4 kali");
            }else if (bimbinganP1 < 8){
                System.out.println("Gagal! Log pembimbing P1 belum mencapai 8 kali");
            } else {
                System.out.println("Gagal! Log bimbingan P2 belum mencapai 4 kali");
            }
     }  else{
        System.out.println("Gagal! Mahasiswa masih memiliki tanggungan kompen");
     }
    }
}
