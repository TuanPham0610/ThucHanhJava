
package Thuc_hanh_Java;

import java.util.Scanner;

public class testJava{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int number = sc.nextInt();
        
        if (number % 2 ==0){
            System.out.print("So chan");
        }
        else{
            System.out.print("So le");
        }

        sc.close();
    }
}