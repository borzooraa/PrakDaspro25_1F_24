package P10;

import java.util.Scanner;

public class square24 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = Kiyah.nextInt();
        for (int iOuter = 1; iOuter <= n; iOuter++) {
            for (int i = 0; i<=n; i++) {
                System.out.print("*");  
            }
            System.out.println();    
        }
    }
}
