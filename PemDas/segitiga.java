import java.util.Scanner;

public class segitiga {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        System.out.print("masukkan jumlah baris: ");
        int rows = scn.nextInt();
        System.out.println("Nomer 1");
        System.out.println();
        for (int i = 0; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("No.3");
        System.out.println();
        for (int i = 0; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = rows; k > i; k--) {
                System.out.print("*");
            }
           System.out.println();
        }
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" ");
            }
            for (int l = rows; l >= i; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}   

   


