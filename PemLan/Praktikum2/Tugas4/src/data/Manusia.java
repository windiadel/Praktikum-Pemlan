package data;
class Manusia {
    private String nama;
    private boolean jenisKelamin; 
    private boolean menikah;
    private String nik;

    public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean getJenisKelamin(){
        return jenisKelamin;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public Boolean getMenikah(){
        return menikah;
    }

    public double getTunjangan(){
        if ( menikah == true && jenisKelamin == true ){
            return 25.0;
        } else if ( menikah == true && jenisKelamin == false ){
            return 20.0;
        } else {
            return 15.0;
        }
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    @Override
    public String toString() {
        return "nama : " + nama + "\nnik : " + nik + "\njenisKelamin : " +
               (jenisKelamin ? "Laki-laki" : "Perempuan") + "\npendapatan : " + getPendapatan();
    }
}
