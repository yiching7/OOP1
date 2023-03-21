import java.util.*;
public class A1103360_0317_1{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int n;
        System.out.println("請輸入n:");
        n=input.nextInt();

        int m;
        System.out.println("請輸入m:");
        m=input.nextInt();

        int[][] secondArray = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                secondArray[i][j] = (i + 1) * (j + 1);
            }
        }

        // for (int i = 0; i < secondArray.length; i++) {
        //     for (int j = 0; j < secondArray[i].length; j++) {
        //         System.out.print(secondArray[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        System.out.println();

        for (int[] a : secondArray) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
