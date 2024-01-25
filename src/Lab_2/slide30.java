//Tổng các chữ số của 1 số nguyên ( Slide 30)

package Lab_2;

import java.util.Scanner; 


public class slide30{
    public static void main(String[]args){
        int number_a, remainder, total = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: "); //Nhập số

        number_a = sc.nextInt();
        while (number_a > 0){
            remainder = number_a % 10; //Chia số đó với 10 và lấy phần dư
            number_a = number_a / 10; //Chia số đó với 10 
            total += remainder;

            System.out.println("Phan du = "+ remainder);

        }
        
        System.out.print("Tong cac chu so: "+total);


        sc.close();
    }
}