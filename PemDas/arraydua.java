import java.util.Scanner;
public class arraydua {

   public static void main(String[] args) {
     Scanner input = new Scanner(System.in); 
     /*String[][] larik;
     larik = new String [2][3];

     larik[0][0] = "00";
     larik[0][1] = "01";
     larik[0][2] = "02";
     larik[1][0] = "10";
     larik[1][1] = "11";
     larik[1][2] = "12";

     int i;
     int j;
    
     for(i =0; i< larik[0].length; i++){
        for (j=0; j< larik.length; j++)
          System.out.print(larik[j][i]+ " ");
          System.out.println(" "); //nomer 3
     }
     for(i =0; i< larik.length; i++){
        for (j=0; j< larik[0].length; j++)
          System.out.print(larik[i][j]+ " ");
          System.out.println(" "); //nomer 2
     } 
     for(i =0; i< larik.length; i++){
        for (j=0; j< larik[0].length; j++)
          System.out.println(larik[i][j]); //nomer 1
     }  */
     int[][] ar = {{1, 2, 3}, {4,5,6}};
     int[][] arr = {{1, 3, 7}, {4, 2, 5}};

     int i;
     int j;
     for(i =0; i< ar.length; i++){
        for (j=0; j< ar[0].length; j++)
     for(i =0; i< arr.length; i++){
        for (j=0; j< arr[0].length; j++)
     System.out.print(ar[i][j]+ " ");
     System.out.println("");
     System.out.print(arr[i][j]+ " ");
     System.out.println("");
     System.out.print((ar[i][j] * arr[i][j])+ " ");
     System.out.println("");
       }
       }
    }
  }

