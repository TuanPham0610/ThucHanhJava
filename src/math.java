//Thực hiện các phép toán cơ bản 

import java.util.Scanner; //Khai báo thư viện cho phép nhập đầu vào

public class math {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //tạo đối tượng để nhập

        System.out.print("Number 1: "); //Nhập số thứ nhất
        double number_a = sc.nextDouble(); 
   
        System.out.print("Number 2:  "); //Nhập số thứ hai
        double number_b = sc.nextDouble();

        double number_c = number_a + number_b; //Cộng
        double number_d = number_a - number_b; //Trừ
        double number_e = number_a * number_b; //Nhân
        double number_f = number_a / number_b; //Chia
        double number_g = number_a % number_b; //Chia lấy phần dư

        System.out.println("____________________"); //Đầu ra kết quả
        System.out.println("Sum: "+number_c);           //Tổng
        System.out.println("Difference: "+ number_d);   //Hiệu
        System.out.println("Multiplication: "+ number_e);//Tích
        System.out.println("Product: "+ number_f);  //Thương
        System.out.println("Remainder: "+ number_g);    //Phần dư


        System.out.println("____________________");
        System.out.println("Compare two numbers");

        if (number_a > number_b)
        {System.out.println(number_a+" > "+number_b);}

        if (number_a < number_b)
        {System.out.println(number_a+" < "+number_b);}

        if (number_a == number_b)
        {System.out.println(number_a+" = "+number_b);}

        
     
        sc.close();//Đóng nhập
    }
}
