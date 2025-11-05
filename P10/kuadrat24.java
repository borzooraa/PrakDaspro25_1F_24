package P10;

import java.util.Scanner;

public class kuadrat24 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner(System.in);
        int n, hasil = 0;
        String newDeret = "";

        System.out.print("Masukkan nilai n: ");
        n = Kiyah.nextInt();

        for (int i = 1; i <= n; i++) {
            hasil += i * i;
            if (newDeret == "") {
                newDeret += 1;
            } else {
                newDeret += "+" + (i * i);
            }
            System.out.println("n= " + i + "-> jumlah kuadrat=" + newDeret + "=" + hasil);
        }

    }
}
