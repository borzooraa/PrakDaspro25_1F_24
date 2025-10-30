package P10;

import java.util.Scanner;

public class triangle24 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner (System.in);
        System.out.print("Masukkan nilai n = ");
        int n = Kiyah.nextInt();
        int i = 0;

        while (i<=n) {
            int j = 0;
            while (j < i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
