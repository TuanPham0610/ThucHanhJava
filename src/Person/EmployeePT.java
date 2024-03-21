//Nhân viên part time
//Nhân viên pt tính lương theo giờ. 25k* giờ làm * ngày làm trong tháng

package Person;

import java.util.Scanner;

public class EmployeePT extends Employee{
    public float ngay;
    public float thoigian;

    public void nhapGio(){

        super.nhapMaNV();

        Scanner sc = new Scanner(System.in);
        System.out.print("Gio lam: ");
        thoigian = sc.nextFloat();
    }

    public void nhapNgay(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ngay lam: ");
        ngay = sc.nextFloat();
        
    }

    public void tinhLuong(){
        luong = 25000 * ngay * thoigian;
        super.luongPT();

    }
    public static void main(String[] args) {
        EmployeePT ept = new EmployeePT();
        ept.nhapGio();
        ept.nhapNgay();
        ept.tinhLuong();
        
    }

}