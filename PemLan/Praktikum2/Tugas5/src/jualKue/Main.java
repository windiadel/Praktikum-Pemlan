package jualKue;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Kue[] kueArray = new Kue[20];
        kueArray[0] = new KueJadi("Klepon", 1800, 1);
        kueArray[1] = new KuePesanan("Onde-onde", 2000, 1);
        kueArray[2] = new KueJadi("Martabak Manis", 8000, 1);
        kueArray[3] = new KuePesanan("Kue Lapis", 3000, 1);
        kueArray[4] = new KueJadi("Kue Cubit", 6000, 1);
        kueArray[5] = new KuePesanan("Kue Balok", 8000, 1);
        kueArray[6] = new KueJadi("Lumpia Semarang", 5000, 1);
        kueArray[7] = new KuePesanan("Kue Putu", 3000, 1);
        kueArray[8] = new KueJadi("Kue Rangi", 5600, 1);
        kueArray[9] = new KuePesanan("Kue Lumpur", 2500, 1);
        kueArray[10] = new KueJadi("Pastel", 9600, 1);
        kueArray[11] = new KuePesanan("Kue Ape", 1200, 1);
        kueArray[12] = new KueJadi("Kue Serabi", 7200, 1);
        kueArray[13] = new KuePesanan("Kue Clorot", 900, 1);
        kueArray[14] = new KueJadi("Kue Leker", 9400, 1);
        kueArray[15] = new KuePesanan("Kue Talam", 3300, 1);
        kueArray[16] = new KueJadi("Kue Bugis", 8000, 1);
        kueArray[17] = new KuePesanan("Kue Mangkok", 4000, 1);
        kueArray[18] = new KueJadi("Kue Dadar Gulung", 1000, 1);
        kueArray[19] = new KuePesanan("Kue Pancong", 1700, 1);

        System.out.println("=============== DAFTAR KUE ===============");
        for (Kue kue : kueArray) {
            System.out.println(kue);
            System.out.println("Jenis Kue  : " + (kue instanceof KueJadi ? "Kue Jadi" : "Kue Pesanan"));
            System.out.println();
        }

        double totalHargaSemuaKue = 0;
        double totalHargaKuePesanan = 0;
        double totalBeratKuePesanan = 0;
        double totalHargaKueJadi = 0;
        double totalJumlahKueJadi = 0;

        for (Kue kue : kueArray) {
            totalHargaSemuaKue += kue.hitungHarga();
            if (kue instanceof KuePesanan) {
                totalHargaKuePesanan += kue.hitungHarga();
                totalBeratKuePesanan += ((KuePesanan) kue).getBerat();
            } else if (kue instanceof KueJadi) {
                totalHargaKueJadi += kue.hitungHarga();
                totalJumlahKueJadi += ((KueJadi) kue).getJumlah();
            }
        }

        System.out.println("=================[S T A T S]====================");
        System.out.println("TOTAL HARGA SEMUA KUE        : Rp " + totalHargaSemuaKue);
        System.out.println("TOTAL HARGA KUE PESANAN      : Rp " + totalHargaKuePesanan);
        System.out.println("TOTAL BERAT KUE PESANAN      : " + totalBeratKuePesanan + " gram");
        System.out.println("TOTAL HARGA KUE JADI         : Rp " + totalHargaKueJadi);
        System.out.println("TOTAL JUMLAH KUE JADI        : " + totalJumlahKueJadi + " buah");

        // Kue dengan harga tertinggi
        Arrays.sort(kueArray, Comparator.comparingDouble(Kue::getHarga).reversed());
        Kue kueTertinggi = kueArray[0];
        System.out.println("Kue dengan harga tertinggi");
        System.out.println("Berdasarkan jenis : " + (kueTertinggi instanceof KuePesanan ? "kue pesanan" : "kue jadi"));
        System.out.println("Berdasarkan nama kue : " + kueTertinggi.getNama());
    }
}