import java.util.Scanner;

public class ganjilgenap {
    
public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    int x;
    System.out.println("masukan angka: ");
    x = scn.nextInt ();
    int h = x / 2 ;
    int y = x - (2*h) ;
    if (y==0){
        System.out.println("genap");
    } else {
        System.out.println("ganjil");

    }
}
}  