import java.util.Scanner;

public class kelulusan {
    public static void main (String[] args) {

        Scanner scn = new Scanner (System.in);
        System.out.print("Masukkan jumlah siswa dalam kelas: ");
        int jumlahSiswa = scn.nextInt();
        int[] nilaiSiswa = new int[jumlahSiswa];
        int nilaiTertinggi = 0;
        int a = 0;
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Nilai siswa ke-" + (i+1) + ": ");
            nilaiSiswa[i] = scn.nextInt();
            if (nilaiSiswa[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiSiswa[i];
                a = i+1;
            }
        }
        System.out.println("Status kelulusan siswa:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (nilaiSiswa[i] >= 70) {
                System.out.println("Siswa ke-" + (i+1) + " lulus");
            } else {
                System.out.println("Siswa ke-" + (i+1) + " gagal");
            }
        }
        System.out.println("Nilai terbaik siswa ke-" + a + " sebesar " + nilaiTertinggi);
    }
}


    

