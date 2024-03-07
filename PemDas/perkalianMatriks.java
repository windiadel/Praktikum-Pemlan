import java.util.Scanner;

public class perkalianMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*int baris1 = input.nextInt();
        int kolom1 = input.nextInt();
        int[][] matriks1 = new int[baris1][kolom1];

        for (int i = 0; i < baris1; i++) {
            for (int j = 0; j < kolom1; j++) {
                matriks1[i][j] = input.nextInt();
            }
        }

        int baris2 = input.nextInt();
        int kolom2 = input.nextInt();
        int[][] matriks2 = new int[baris2][kolom2];

        for (int i = 0; i < baris2; i++) {
            for (int j = 0; j < kolom2; j++) {
                matriks2[i][j] = input.nextInt();
            }
        }

        if (kolom1 != baris2) {
            System.out.println("Matriks ini tidak bisa dikalikan!");
        } else {
            int[][] hasil = new int[baris1][kolom2];

            for (int i = 0; i < baris1; i++) {
                for (int j = 0; j < kolom2; j++) {
                    for (int k = 0; k < kolom1; k++) {
                        hasil[i][j] += matriks1[i][k] * matriks2[k][j];
                    }
                }
            }

            for (int i = 0; i < baris1; i++) {
                for (int j = 0; j < kolom2; j++) {
                    System.out.print(hasil[i][j] + " ");
                }
                System.out.println();
            }
        }*/
        int [] [] satu;
        satu = new int [4] [3];
        satu [0][0] = 1;
        satu [0][1] = 2;
        satu [0][2] = 3;
        satu [1][0] = 4;
        satu [1][1] = 5;
        satu [1][2] = 6;
        satu [2][0] = 4;
        satu [2][1] = 5;
        satu [2][2] = 6;
        satu [3][0] = 1;
        satu [3][1] = 2;
        satu [3][2] = 3;
        for (int i=0; i< satu.length; i++){
            for (int j = 0; j< satu[0].length; j++){
            System.out.print(satu[i][j] + " ");
            }System.out.println();
        }

        System.out.println();

        int [] [] dua;
        dua = new int [3] [3];
        dua [0][0] = 1;
        dua [0][1] = 2;
        dua [0][2] = 3;
        dua [1][0] = 4;
        dua [1][1] = 5;
        dua [1][2] = 6;
        dua [2][0] = 4;
        dua [2][1] = 5;
        dua [2][2] = 6;
        for (int i=0; i< dua.length; i++){
            for (int j = 0; j< dua[0].length; j++){
            System.out.print(dua[i][j] + " ");
            }System.out.println();
        }
        System.out.println();

        for (int i = 0; i < satu.length; i++) {
            for (int j = 0; j < dua[0].length; j++) {
                int hasil = 0;
                for (int k = 0; k < dua.length; k++) {
                  hasil += (satu[i][k] * dua[k][j]);
                    
                }
                System.out.print(hasil + " ");
            }
            System.out.println();
        }
    }
}

