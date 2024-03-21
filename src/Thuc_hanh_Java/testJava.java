package Thuc_hanh_Java;

import java.util.Scanner;

public class testJava{
    public static void main(String[]agrs){
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int number = sc.nextInt();

        System.out.print(number);

        sc.close();
    }
}
