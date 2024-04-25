package data;
import java.time.LocalDate;
public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, LocalDate tahunMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus(){
        int tahunKerja = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (tahunKerja >= 10) {
            return 0.15 * gaji;
        } else if (tahunKerja >= 5 && tahunKerja < 10) {
            return 0.10 * gaji;
        } else {
            return 0.05 * gaji;
        }
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getGaji() + getBonus() + (20 * jumlahAnak);
    }

    @Override
    public String toString() {
        return super.toString() + "\ntahun masuk : " + tahunMasuk.getDayOfMonth() + " " +
                tahunMasuk.getMonthValue() + " " + tahunMasuk.getYear() + "\njumlah anak : " + jumlahAnak +
                "\ngaji : " + gaji;
    }
}
