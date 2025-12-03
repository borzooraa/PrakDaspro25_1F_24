import java.util.Scanner;

public class hitungBalok24 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.print("Masukkan panjang: ");
        p = Kiyah.nextInt();
        System.out.print("Masukkan lebar: ");
        l = Kiyah.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = Kiyah.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah: " + L);
        vol = hitungVolume(t, p, l);
        System.out.println("Volume balok adalah: " + vol);

        Kiyah.close();
    }

    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int Volume = hitungLuas(a, b) * tinggi;
        return Volume;
    }
}
