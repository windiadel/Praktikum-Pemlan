public class tugasMethod {

    public static void main(String[] args) {
        System.out.println("luas lingkaran adalah " + luasLingkaran(7));
        System.out.println("luas persegi panjang adalah " + luasPersegiPanjang(7, 2));
        System.out.println("luas permukaan tabung adalah " + luasPermukaanTabung(7, 44, 2));
        System.out.println("volume tabung adalah " + volumeTabung(7, 2));
    }

    public static double luasLingkaran(int r) {
        return 3.14 * r * r;
    }

    public static double luasPersegiPanjang(int panjang, int lebar) {
        return panjang * lebar;
    }

    public static double luasPermukaanTabung(int r, int panjang, int lebar) {
        return 2 * luasLingkaran(r) + luasPersegiPanjang(panjang, lebar);
    }

    public static double volumeTabung(int r, int lebar) {
        return luasLingkaran(r) * lebar;
    }
}

    /*public static void main(String[] args) {
        int hasil= 1;
        int angka = 5;
        System.out.println("hasil faktorial " + angka + "adalah" + hitungFaktorial(angka));
    }
    public static int hitungFaktorial(int i) {
        if (i==1||i==0) {
            return 1;

        }

    }*/

