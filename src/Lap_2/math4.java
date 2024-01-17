
package Lap_2;

// Giải phương trình bậc 2


import java.util.Scanner; 
import java.lang.Math;

public class math4{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Number 1 : "); //Nhập số
        double number_a = sc.nextDouble();

        
        System.out.print("Number 2: "); //Nhập số
        double number_b = sc.nextDouble();

        System.out.print("Number 3: "); //Nhập số
        double number_c = sc.nextDouble();

        if (number_a == 0){
            System.out.print("Khong phai phuong trinh bac hai");
        }
        else {
            
            double number_x = (number_b * number_b)- 4 * number_a * number_c;
            System.out.println("Delta  =  " + number_x);

            if(number_x < 0){
                System.out.print("Phuong trinh vo nghiem");
            }

            if(number_x == 0){
                System.out.print("Phuong trinh co nghiem kep");
                System.out.print("Nghiem phuong trinh: "+ -number_b/ 2*number_a);
            }

            if(number_x > 0){
                System.out.print("Nghiem 1: "+ (-number_b + Math.sqrt(number_x))/2*number_a);
                System.out.println(" ");
                System.out.print("Nghiem 2: "+ (-number_b - Math.sqrt(number_x))/2*number_a);
            }

        }


    

    sc.close();

    }
}