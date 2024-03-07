import java.util.Scanner;

public class puluhansatuan {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x;
        System.out.println("Masukkan nilai x yang akan di konversi ");
        x = scn.nextInt ();
        int Puluhan = x / 10 ;
        int Satuan = x - (Puluhan*10) ;
        System.out.println("Puluhannya adalah "+Puluhan+0); 
        System.out.println("Satuannya adalah "+Satuan);
        } 

    }
    




