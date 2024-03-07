import java.util.Scanner;

public class angkaunik {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka: ");
        int jumlahAngka = scn.nextInt();
        int[] angkaArray = new int[jumlahAngka];
        for (int i = 0; i < jumlahAngka; i++) {
            System.out.print("Masukkan angka ke-" + (i+1) + ": ");
            angkaArray[i] = scn.nextInt();
        }
        System.out.println("Angka unik:");
        for (int i = 0; i < jumlahAngka; i++) {
            boolean isUnik = true;
            for (int j = 0; j < i; j++) {
                if (angkaArray[i] == angkaArray[j]) {
                    isUnik = false;
                    break;
                }
            }
            if (isUnik) {
                System.out.print(angkaArray[i]);
                if (i != jumlahAngka - 1){
                    System.out.print(",");
                }
            }
        }
    }
}


