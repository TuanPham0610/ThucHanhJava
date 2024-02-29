package Lab_2;

import java.util.Scanner;

public class HinhTron {
    public float chuVi;
    public float dienTich;
    public float banKinh;
    public final float pi = 3.14f;

    public void nhapBanKinh() {
        Scanner sc = new Scanner(System.in);

        System.out.print("R = ");
        banKinh = sc.nextFloat();

        sc.close();

    }

    public void tinhChuVi() {
        chuVi = 2 * pi * banKinh;
    }

    public void tinhDienTich() {
        dienTich = pi * banKinh * banKinh;
    }

    public void inChuVi() {
        System.out.println("Chu vi = " + chuVi);
    }

    public void inDienTich() {
        System.out.println("Dien tich = " + dienTich);

    } 

}
