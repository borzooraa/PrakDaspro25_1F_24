package P6;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class wifiKampus24 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner (System.in);
        String jenisPengguna;
        int JumlahSKS;
        System.out.print("Jenis Pengguna: ");
        jenisPengguna = Kiyah.nextLine();

        if (jenisPengguna.equalsIgnoreCase ("Dosen")){
            System.out.println("Akses Wifi diberikan (dosen)");
           }else if (jenisPengguna.equalsIgnoreCase("Mahasiswa")){
            System.out.print("Input jumlah SKS: ");
            JumlahSKS = Kiyah.nextInt();
            if (JumlahSKS >= 12){
            System.out.println("Akses Wifi diberikan (mahasiswa aktif)");
           }else{
           System.out.println("Akses ditolak, SKS Kurang dari 12");
           }
        }else { 
        System.out.print("Akses ditolak");    
        }
        
    

    }
}
