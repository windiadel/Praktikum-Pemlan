 import java.util.Scanner;
 public class rata {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa dalam kelas: ");
        int jumlahSiswa = scn.nextInt();
        int[] nilaiSiswa = new int[jumlahSiswa];
        double totalNilai = 0;
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + (i+1) + ": ");
            nilaiSiswa[i] = scn.nextInt();
            totalNilai += nilaiSiswa[i];
        }
        double rataRata = totalNilai / jumlahSiswa;
        System.out.println("Nilai rata-rata siswa sebesar: " + rataRata);
    }
}

