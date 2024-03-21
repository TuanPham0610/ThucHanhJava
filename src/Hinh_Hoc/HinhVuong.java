package Hinh_Hoc;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat{
    public float canh;

    public void nhapCanh(){
        super.nhapTen();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh: ");
        canh = sc.nextFloat();
    }

    public void tinhDienTich(){
        dienTich = canh * canh;
        super.inDienTich();
    }

    public void tinhChuVi(){
        chuVi = canh * 4;
        super.inChuVi();
    }

    public static void main(String[] args) {
        HinhVuong hv = new HinhVuong();
        hv.nhapCanh();
        hv.tinhDienTich();
        hv.tinhChuVi();
    }

    
    

}