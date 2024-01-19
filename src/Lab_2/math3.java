package Lab_2;

// Giải phương trình bậc nhất

import java.util.Scanner; 

public class math3{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Number 1 : "); //Nhập số
        double number_a = sc.nextDouble();

        
        System.out.print("Number 2: "); //Nhập số
        double number_b = sc.nextDouble();


        if (number_a == 0){
            System.out.print("Khong phai phuong trinh bac nhat");
        }
        else {
            System.out.println("Equation : "+ number_a + "X"+ " + " + number_b +"= 0");
            double number_x = -number_b / number_a;
            System.out.println("Nghiem X : " + number_x);

        }

        sc.close();
    }

}