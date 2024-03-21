//Nhân viên full time tính lương cứng + 25k mỗi giờ tăng ca 

package Person;

import java.util.Scanner;

public class EmployeeFT extends Employee{
    public float luongCung;
    public float tangCa;

    public void nhapLuong(){

        super.nhapMaNV();

        Scanner sc = new Scanner(System.in);
        System.out.print("Luong cung: ");
        luongCung = sc.nextFloat();
    }

    public void tangCa(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tang ca: ");
        tangCa = sc.nextFloat();

    }

    public void tinhLuong(){
        luong = luongCung + tangCa * 25000;
        super.luongFT();
    }
    public static void main(String[] args) {
        EmployeeFT eft = new EmployeeFT();
        eft.nhapLuong();
        eft.tangCa();
        eft.tinhLuong();
    }
}