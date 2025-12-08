package P15;

import java.util.Scanner;

import P11.mencariMaMiDiMenu;
import P11.nilaiMahasiswa24;

public class CM2_SIAKAD_24 {
    static Scanner Kiyah = new Scanner(System.in);
    static int jlhMhs;
    static String[] namaMhs;
    static String[] NIM;
    static double[][] nilaiMhs;
    static String[] namaMK = { "Pancasila", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Bahasa Inggris 1",
            "Fisika", "Matematika Dasar", "Konsep Teknologi Informasi", "Keselamatan dan Kesehatan Kerja",
            "Critical Thinking dan Problem Solving" };
    static int[] sks = { 2, 2, 3, 2, 2, 2, 2, 2, 2 };

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mahasiwa: ");
        jlhMhs = Kiyah.nextInt();

        namaMhs = new String[jlhMhs];
        NIM = new String[jlhMhs];
        nilaiMhs = new double[jlhMhs][9];

        menu();
    }

    static void menu() {
        int pilih;
        do {

            System.out.print("========================================");
            System.out.print("\n    SISTEM SIAKAD SEDERHANA(MENU)      ");
            System.out.print("\n========================================");
            System.out.print("\n1. input nilai mata kulaih\n2. Lihat KHS (konversi & IP + status)\n3. Keluar");
            System.out.print("\n========================================");
            System.out.print("\nPilih menu (1-3): ");
            pilih = Kiyah.nextInt();

            if (pilih == 1) {
                inputData();
            } else if (pilih == 2) {
                lihatKhs();
            } else if (pilih == 3) {
            } else {
                System.out.print("Menu tidak valid. masukkan ulang menu yang ingin di pilih.");
                continue;
            }
        } while (pilih != 3);
    }
static void inputData() {
    Kiyah.nextLine();

    System.out.println("\nDaftar Mahasiswa:");
    for (int i = 0; i < jlhMhs; i++) {
        if (namaMhs[i] == null) {
            System.out.println((i + 1) + ". (belum diisi) / -");
        } else {
            System.out.println((i + 1) + ". " + namaMhs[i] + " / " + NIM[i]);
        }
    }

    System.out.print("\nPilih nomor mahasiswa yang ingin diinput: ");
    int pilih = Kiyah.nextInt();
    Kiyah.nextLine();

    if (pilih < 1 || pilih > jlhMhs) {
        System.out.println("Nomor tidak valid.");
        return;
    }

    pilih -= 1;  

    for (int i = 0; i < jlhMhs; i++) {
        if (i == pilih) {

            System.out.print("==== INPUT NILAI MAHASISWA ====");
            System.out.print("\nNama: ");
            namaMhs[i] = Kiyah.nextLine();

            System.out.print("NIM: ");
            NIM[i] = Kiyah.nextLine();

            System.out.print("\nMasukkan nilai (0 - 100) untuk mata kuliah berikut:\n");

            for (int j = 0; j < 9; j++) {
                while (true) {
                    System.out.print((j + 1) + ". " + namaMK[j] + ": ");
                    nilaiMhs[i][j] = Kiyah.nextDouble();

                    if (nilaiMhs[i][j] >= 0 && nilaiMhs[i][j] <= 100) {
                        break;
                    } else {
                        System.out.print("Nilai harus 0–100. ");
                    }
                }
                Kiyah.nextLine();
            }

            System.out.print("[OK] Semua nilai berhasil dimasukkan.\n");
            return;  
        }
    }
}


    static String nilaiHuruf(double n) {
        String huruf;

        if (n <= 39) {
            huruf = "E";
        } else if (n <= 50) {
            huruf = "D";
        } else if (n <= 60) {
            huruf = "C";
        } else if (n <= 65) {
            huruf = "C+";
        } else if (n <= 73) {
            huruf = "B";
        } else if (n < 80) {
            huruf = "B+";
        } else {
            huruf = "A";
        }
        return huruf;
    }

    static double nilaiSetara(double n) {
        double setara;
        if (n <= 39) {
            setara = 0;
        } else if (n <= 50) {
            setara = 1;
        } else if (n <= 60) {
            setara = 2;
        } else if (n <= 65) {
            setara = 2.5;
        } else if (n <= 73) {
            setara = 3;
        } else if (n < 80) {
            setara = 3.5;
        } else {
            setara = 4;
        }
        return setara;

    }

    static double bobot(double[] setara, int[] sks) {
        double total = 0;
        for (int i = 0; i < setara.length; i++) {
            total += setara[i] * sks[i];
        }
        return total;

    }

    static double ip(double total) {

        double ip = total / 19;
        return ip;
    }

    static String statusSemester(int pilih, double ip) {
        if (ip < 2) {
            return "TIDAK LULUS SEMESTER (IP KURANG DARI 2)";
        }
        if (nilaiMhs[pilih][0] <= 50) {
            return "TIDAK LULUS SEMESTER (NILAI PANCASILA D)";
        }
        for (int i = 0; i < 9; i++) {
            if (nilaiHuruf(nilaiMhs[pilih][i]).equalsIgnoreCase("E")) {
                return "TIDAK LULUS SEMESTER (ADA NILAI E)";
            }
        }

        return "LULUS SEMESTER";
    }

    static void lihatKhs() {
        System.out.println("\nDaftar Mahasiswa:");
         for (int i = 0; i < jlhMhs; i++) {
        if (namaMhs[i] == null) {
            System.out.println((i + 1) + ". (belum diisi) / -");
        } else {
            System.out.println((i + 1) + ". " + namaMhs[i] + " / " + NIM[i]);
        }
    }
    


        System.out.print("Pilih nomor mahasiswa (1-" + jlhMhs + "): ");
        int pilih = Kiyah.nextInt() - 1;

        System.out.println("\n========================================================");
        System.out.println("                HASIL KONVERSI NILAI MAHASISWA          ");
        System.out.println("========================================================");
        System.out.println("Nama : " + namaMhs[pilih]);
        System.out.println("NIM  : " + NIM[pilih]);
        System.out.println("--------------------------------------------------------");

        System.out.println("No  Mata Kuliah                          SKS  Nilai  Huruf  Setara");
        System.out.println("------------------------------------------------------------------");

        double totalBobot = 0;
        int totalSks = 19;

        for (int mk = 0; mk < 9; mk++) {

            double n = nilaiMhs[pilih][mk];
            String huruf = nilaiHuruf(n);
            double setara = nilaiSetara(n);

            totalBobot += setara * sks[mk];

            System.out.printf("%-3d %-35s %-4d %-6.1f %-6s %-5.1f\n",
                    (mk + 1), namaMK[mk], sks[mk], n, huruf, setara);
        }

        double ipAkhir = totalBobot / totalSks;

        System.out.println("------------------------------------------------------------------");
        System.out.println("Total SKS       : " + totalSks);
        System.out.println("Total Bobot     : " + totalBobot);
        System.out.printf("Indeks Prestasi : %.2f\n", ipAkhir);
        System.out.println("Status Semester : " + statusSemester(pilih, ipAkhir));
        System.out.println("------------------------------------------------------------------");
    }

}
