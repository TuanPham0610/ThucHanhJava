//Ma trận

package Lab_2;

import java.util.Scanner;

public class slide81{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("So hang: ");
        int rows = sc.nextInt();
        System.out.print("So cot: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Cac phan tu cua ma tran: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Hang " + (i+1) + " Cot " + (j+1) + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }

        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }

        System.out.println("Phan tu lon nhat: " + max);
        sc.close();
    }

     
}
