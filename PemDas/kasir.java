import java.util.Scanner;

public class kasir {
    public static void main(String[] args) {
        int kdBarang, harga,jmlbarang;
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Masukkan kode barang: ");
        kdBarang = scn.nextInt ();
        if (kdBarang == 0) {
            System.out.println("Spidol");
            harga = 3000;
        } else if (kdBarang == 1) {
            System.out.println("Kopi");
            harga = 5000;
        } else if (kdBarang == 2) {
            System.out.println("Pop mie");
            harga = 2500;
        } else {
            harga = 0;
            System.out.println("kode barang tidak ditemukan");
        }
        

    
        }
    }

    

