import java.util.Scanner;
public class method {
    public static void main(String[] args) {
        System.out.println(luasPrisma(5,3,5));
    }
    public static float hitungLuasSegitiga(int alas, int tinggi) {
        return (float) (alas * tinggi / 2);
    }
    public static int hitungLuasPersegiPanjang(int panjang, int lebar) {
        System.out.print("luas persegi panjang adalah");
        return (panjang * lebar);
    }
    public static float luasPrisma(int panjang, int lebar, int tinggi) {
        System.out.println("luas prisma adalah : ");
        return 3 * hitungLuasPersegiPanjang(2,4) + 2 * hitungLuasSegitiga(3,6);
        
    }

}
