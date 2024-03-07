import java.util.Scanner;
public class kasirarray {

   public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
        System.out.println("Selamat Datang di KASIR KELOMPOK 6"); 
        System.out.println(); 
        System.out.println("Daftar Kode Barcode Barang"); 
        String[] barang = {"Buku", "Teh", "Aqua", "Sikat Gigi", "Fanta", "Pensil", "Stipo", "Kerupuk", "Sabun", "Shampoo"}; 
        int[] harga = {3000, 2000, 2500, 5000, 6000, 3000, 4000, 2000, 4000, 1500}; 
        for (int i = 0; i < barang.length; i++) { 
            System.out.println(barang[i] + " : " + i); 
        }
        int total = 0; 
        String jenisBarangLain = "Ya";
        int jenisBarangCounter = 0; 
        while (jenisBarangLain.equalsIgnoreCase("Ya")) { 
            System.out.println(); 
            System.out.print("Masukkan Kode Barcode Barang : "); 
            int kodeBarcode = input.nextInt();
            System.out.println("Nama Barang : " + barang[kodeBarcode]); 
            int hargaBarang = harga[kodeBarcode];
            System.out.println("Harga : " + hargaBarang);

            System.out.print("Masukkan jumlah barang : "); 
            int jmlBarang = input.nextInt();
            input.nextLine(); 
            System.out.println("Harga sub total = " + jmlBarang * hargaBarang);
            total += jmlBarang * hargaBarang; 
            jenisBarangCounter++; 
            System.out.println(); 
            System.out.println("Apakah ingin menambah jenis barang lain? (Ya/Tidak) "); 
            jenisBarangLain = input.next(); 
        }
        System.out.println(); 
        System.out.println("Jumlah jenis barang yang dibeli: " + jenisBarangCounter + " jenis barang"); 
        System.out.println("Total belanja yaitu : " + total); 
        System.out.println(); 
        System.out.println("Terima kasih telah berbelanja di KASIR KELOMPOK 6"); 
    }
}