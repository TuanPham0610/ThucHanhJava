//Check số chẵn lẻ

import java.util.Scanner; //Khai báo thư viện cho phép nhập đầu vào

public class math2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //tạo đối tượng của lớp

        System.out.print("Number: "); //Nhập số
        int number_a = input.nextInt();

        //Chia hết cho 2 thì là chẵn và ngược lại
        if (number_a % 2 == 0)
        {System.out.println("Even number");}

        else 
        {System.out.println("Odd number");}

        input.close(); //Kết thúc nhập
   
        
    }

}