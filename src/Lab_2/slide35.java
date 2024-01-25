//In ra số nhỏ nhất trong 2 số (slide 35)

package Lab_2;

import java.util.Scanner; 

public class slide35{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number 1 : "); //Nhập số
        int number_a = sc.nextInt();

        
        System.out.print("Number 2: "); //Nhập số
        int number_b = sc.nextInt();

        if (number_a < number_b){
            System.out.print("So nho nhat la: "+number_a);
        }
        if (number_b < number_a){
            System.out.print("So nho nhat la: "+number_b);
        }

        sc.close();

    }
}
