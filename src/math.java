//Thực hiện các phép toán cơ bản 

import java.util.Scanner; //Khai báo thư viện cho phép nhập đầu vào

public class math {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //tạo đối tượng của lớp

        System.out.print("Number 1: "); //Nhập số thứ nhất
        int number_a = input.nextInt(); 
   
        System.out.print("Number 2:  "); //Nhập số thứ hai
        int number_b = input.nextInt();

        int number_c = number_a + number_b; //Cộng
        int number_d = number_a - number_b; //Trừ
        int number_e = number_a * number_b; //Nhân
        int number_f = number_a / number_b; //Chia
        int number_g = number_a % number_b; //Chia lấy phần dư

        System.out.println("____________________"); //Đầu ra kết quả
        System.out.println("Sum: "+number_c);           //Tổng
        System.out.println("Difference: "+ number_d);   //Hiệu
        System.out.println("Multiplication: "+ number_e);//Tích
        System.out.println("Product: "+ number_f);  //Thương
        System.out.println("Remainder: "+ number_g);    //Phần dư
     
        input.close();//Đóng nhập
    }
}
