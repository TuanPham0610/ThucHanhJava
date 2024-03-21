package Hinh_Hoc;

import java.util.Scanner;

public class Hinhtron extends HinhHoc{
    public float banKinh;

    public void nhapBanKinh(){
        
        super.nhapTen();

        Scanner sc = new Scanner(System.in);        
        System.out.print("Nhap ban kinh: ");
        banKinh = sc.nextFloat();         
        


    }

    public void tinhChuVi() {
        chuVi = 2 * pi * banKinh;
        super.inChuVi();
        
    }

    public void tinhDienTich() {
        dienTich = pi * banKinh * banKinh;
        super.inDienTich();
    }

    public static void main(String[] args) {
        Hinhtron hinhtron = new Hinhtron();
        hinhtron.nhapBanKinh();
        hinhtron.tinhChuVi();
        hinhtron.tinhDienTich();
    }
    
}