// Nama anggota :
// - Pandu Panatagama Ariyadi Putra (235150400111026)
// - Muhammad Haikal Al Faiz Ritonga (235150400111023)
// - Windi Adelia Sari (235150401111040)

import java.util.Scanner;

public class SK01_12_235150400111026_PanduPanatagamaAP {
    public static void main (String[] args) {
              Scanner input = new Scanner (System.in);
              int kdBarang;
              int harga = 0;
              int jmlBarang;
              int totHarga = 0;
              int totJmlBarang = 0;
              int jenisBarang;
              String tambah;

              System.out.println("Selamat datang di sistem kasir AlfaMuda.");
              System.out.println("Berikut adalah list barang yang tersedia beserta kode barangnya masing-masing : ");
              System.out.println("1. Pisau (kode barang = 0)");
              System.out.println("2. Mangkuk (kode barang = 1)");
              System.out.println("3. Piring (kode barang = 2)");
              System.out.println("4. Sendok (kode barang = 3)");
              System.out.println("5. Garpu (kode barang = 4)");
              System.out.println("6. Gelas (kode barang = 5)");
        
              do {
                     System.out.print("Masukkan berapa jenis barang yang dibeli : ");
                     jenisBarang = input.nextInt();

                     for (int i = 0; i < jenisBarang; i++) {
                            System.out.print("Masukkan kode barang : ");
                            kdBarang = input.nextInt();
                            
                            if (kdBarang <= 5 && kdBarang >= 0) {
                                   if (kdBarang == 0) {
                                          System.out.println("Pisau = Rp 50000");
                                          harga = 50000;
                                   } else if (kdBarang == 1){
                                          System.out.println("Mangkuk = Rp 40000");
                                          harga = 40000;
                                   } else if (kdBarang == 2) {
                                          System.out.println("Piring = Rp 35000");
                                          harga = 35000;
                                   } else if (kdBarang == 3) {
                                          System.out.println("Sendok = Rp 20000");
                                          harga = 20000;
                                   } else if (kdBarang == 4) {
                                          System.out.println("Garpu = Rp 15000");
                                          harga = 15000;
                                   } else if (kdBarang == 5) {
                                          System.out.println("Gelas = Rp 25000");
                                          harga = 15000;
                                   } 
                                          System.out.print("Masukkan jumlah barang : ");
                                                 jmlBarang = input.nextInt();
                                          int subTotal = jmlBarang * harga;
                                                 System.out.println("Subtotal = " + subTotal);
                                          totHarga += subTotal;
                                          totJmlBarang += jmlBarang;
                            }
                                   else {
                                          System.out.println("Kode barang tidak valid. Coba masukkan kode barang lagi.");
                                          i--;
                                          continue;
                                   }
                            
                     }
                     System.out.println("Apakah Anda ingin menambah barang lagi?(y untuk ya / t untuk tidak)");
                            tambah = input.next();
                            while (!tambah.equalsIgnoreCase("y") && !tambah.equalsIgnoreCase("t")){
                                   System.out.println("Maaf, input yang Anda masukkan tidak valid. Mohon masukkan (y untuk ya/t untuk tidak)");
                                          tambah = input.next();
                            }
              } while (tambah.equalsIgnoreCase("y"));

            
              System.out.println("Total harga dari semua barang yang dibeli = Rp " + totHarga);
              System.out.println("Total jumlah barang yang dibeli : " + totJmlBarang);
       }
}