package P10;

import java.util.Scanner;

public class persegiAngka24 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner (System.in);
        int n, i=1, j;
        System.out.print("Masukkan nilai n: ");
        n = Kiyah.nextInt();
        while (i<=n) {
            j=1;
            while (j<=n) {
                if (i > 1 && i < n && j> 1 && j < n){
                    System.out.print(" ");
                }else {
                    System.out.print(n+"");
                }
                j++;
            } 
            System.out.println();
            i++;
        }
    }
}
