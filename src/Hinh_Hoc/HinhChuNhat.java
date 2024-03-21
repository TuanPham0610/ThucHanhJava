package Hinh_Hoc;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc{
    public float chieuDai;
    public float chieuRong;

    public void nhapChieuDai(){
        super.nhapTen();
        Scanner sc = new Scanner(System.in);
        System.out.print("Chieu dai: ");
        chieuDai = sc.nextFloat();
        
    }

    public void nhapChieuRong(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Chieu rong: ");
        chieuRong = sc.nextFloat();
        
    }

    public void tinhChuVi(){
        chuVi= ( chieuDai + chieuRong ) * 2;
        super.inChuVi();
    }

    public void tinhDienTich(){
        dienTich = chieuDai * chieuRong;
        super.inDienTich();

    }
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat();

        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();

    }

    
    
}