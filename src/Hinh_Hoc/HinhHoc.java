package Hinh_Hoc;

import java.util.Scanner;

public class HinhHoc{
    
    public final float pi = 3.14f;
    public String name;
    public float chuVi;
    public float dienTich;
    public float theTich;

    public void nhapTen(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten hinh: ");
        name = sc.nextLine();
       
    }

    public void xuatTen(){
        System.out.println("Ten hinh: " + name);
       
    }

    public void inChuVi() {
        System.out.println("Chu vi = " + chuVi);
    }

    
    public void inDienTich() {
        System.out.println("Dien tich = " + dienTich);

    }
    
    public void inTheTich() {
        System.out.println("The tich = " + theTich);

    }

    
    public static void main(String[] args) {
        HinhHoc hinh = new HinhHoc();
        hinh.nhapTen();
        hinh.xuatTen();
        hinh.inChuVi();
        hinh.inDienTich();
        hinh.inTheTich();
        
    }

}