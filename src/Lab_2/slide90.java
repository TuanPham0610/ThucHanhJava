// m = 0
// a = input("Nhập chuỗi: ")
// for i in a:
//     m+=1
//     print("Ký tự thứ",m,": ", i)

//Duyệt ký tự

package Lab_2;

import java.util.Scanner;

public class slide90{
    public static void main(String[] args) {
        int m = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String a = sc.nextLine();

        for (char i : a.toCharArray())
        // i kiểu dữ liệu char
        // toCharArray() để đổi chuỗi a thành 1 mảng các ký tự
        {
            m++;
            System.out.println("Ky tu thu "+m+": "+i);
        }



        sc.close();
    }
}