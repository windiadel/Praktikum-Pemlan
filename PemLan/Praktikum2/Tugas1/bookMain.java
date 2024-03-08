package buku;

import java.util.Scanner;

public class bookMain {
    public static void main(String[] args) {
        book perpus = new book();
        
        Scanner sc = new Scanner(System.in);

        System.out.println("======================PERPUSTAKAAN SI-C======================\n");
        System.out.printf("SELAMAT DATANG DI PERPUSTAKAAN KAMI \nTerdapat beberapa kategori buku di perpustakaan ini, yaitu:\n 1. Teknologi\n 2. Filsafat\n 3. Sejarah\n 4. Agama\n 5. Psikologi\n 6. Politik\n 7. Fiksi\n \nMasukkan kode kategori buku yang ingin anda cari: ");

        int kode = sc.nextInt();

        String informasiBuku = perpus.getInformasiBuku(kode);
        System.out.println(informasiBuku);
    }
}