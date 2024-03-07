       /*int[] firstArray[];
        String secondArray[];

        //inisialisasi
        firstArray = new int[5]; //5 itu panjang array
        secondArray = new String[5];

        //deklarasi dan inisialisasi 
        int[] array = new int[5];
        String array2[] = new String[5];

    }
    
}*/
// satu satu
    // for (int i = 0; i < umur.length; i++); // berapa banyak barisnya
    //     for (int j = 0; j< umur [i].length; j++){
    //     System.out.print(umur[i][j] + " ");
    //     }
    // System.out.println();

    import java.util.Scanner;
    public class array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int hasil = scn.nextInt();
        
        int[][] matriks = new int[x][y];

        // for buat masukin
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                matriks[i][j] = scn.nextInt();
            }
        }


        // for buat check
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                int satu = matriks[i][j];
                int dua = hasil - satu;
                
                for (int k = 0; k < x; k++){
                    for (int m = 0; m < y; m++){
                        if (k!= i || m != j){
                            if (matriks[k][m] == dua){
                                
                                System.out.println("Indeks pertama adalah " + satu + " di " + i + ", " +j);
                                System.out.println("Indeks kedua adalah " + dua + " di " + k + ", " +m);
                                
                                i = x;
                                j = y;
                            }
                        }
                    }
                }
            }
        }
        
    }
    }


