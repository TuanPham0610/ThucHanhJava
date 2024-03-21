package Person;

import java.util.Scanner;

public class Employee extends Person{
    public int maNV;
    public float luong;

    public void nhapMaNV(){
        super.nhapHoTen();
        super.nhapTuoi();

        Scanner sc = new Scanner(System.in);
        System.out.print("Ma nhan vien: ");
        maNV = sc.nextInt();

        System.out.println("Thong tin");
        System.out.println("Ma nhan vien: " + maNV);
        super.inTT();
    }

    public void luongPT(){
        System.out.print("Luong PT: " + luong);
    }

    public void luongFT(){
        System.out.print("Luong FT: " + luong);
    }

    public static void main(String[] args) {
        Employee ep = new Employee();
        ep.nhapMaNV();
        
    }
   
    
}