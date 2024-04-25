package data;
import java.time.LocalDate;
public class Manager extends Pekerja {
    private String departemen;

    public Manager(String departemen, double gaji, LocalDate tahunMasuk, int jumlahAnak, String nama, boolean jenisKelamin, String nik, boolean menikah) {
        super(gaji, tahunMasuk, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + (0.10 * getGaji());
    }

    @Override
    public String toString() {
        return super.toString() + "\ndepartemen : " + departemen;
    }
}