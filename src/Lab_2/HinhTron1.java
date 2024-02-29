package Lab_2;

public class HinhTron1{
    public static void main(String[]agrs){

        HinhTron ht1 = new HinhTron();
        HinhTron ht2 = new HinhTron();

        System.out.println("Chu vi: ");

        ht1.nhapBanKinh();
        ht1.tinhChuVi();
        ht1.inChuVi();

        System.out.println("Dien tich: ");

        ht2.nhapBanKinh();
        ht2.tinhDienTich();
        ht2.inDienTich();



    }


}