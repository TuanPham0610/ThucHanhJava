
//Slide 93  if else

package Lab_2;

import java.util.Scanner;

public class slide93{
    public static void main(String[]args ){
        int year = 2024;
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine(); //nextLine cho phép nhập chuỗi String

        System.out.print("Years: "); //Nhập năm
        int years = sc.nextInt();
        int old = year - years; 

        if (old < 16){
            System.out.print("Ban "+name+" nam nay "+ old + " tuoi" +" va o do tuoi vi thanh nien");
        }

        if (old >= 16 && old <18) // sử dụng && thay cho and
        {
            System.out.print("Ban "+name+" nam nay "+ old + " tuoi" +" va o do tuoi truong thanh");
        }

        if ( old >= 18){
            System.out.print("Ban "+name+" nam nay "+ old + " tuoi" +" va da gia");
        }


        sc.close();

    }

}