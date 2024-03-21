package Hinh_Hoc;

import java.util.Scanner;

public class HinhTru extends Hinhtron{
    public float chieuCao;

    public void nhapChieuCao(){
        
        super.nhapBanKinh();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu cao: ");
        chieuCao = sc.nextFloat();
    }

    public void tinhTheTich(){
        theTich = pi * banKinh * banKinh * chieuCao;
        super.inTheTich();
    }

    public static void main(String[] args) {
        
        HinhTru hinhtru = new HinhTru();
        hinhtru.nhapChieuCao();
        hinhtru.tinhTheTich();
    }

    
}