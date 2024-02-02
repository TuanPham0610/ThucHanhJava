
package Lab_2;

import java.util.Scanner;

public class slide95_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap so: ");
            n = scanner.nextInt();
        } while (n <= 0);

        long factorial = 1;
        for(int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Giai thua cua " + n + " la " + factorial);

        scanner.close();
    }
}
