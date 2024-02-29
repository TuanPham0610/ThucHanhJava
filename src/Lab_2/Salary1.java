package Lab_2;

import Lab_2.Salary.Calculate;
import Lab_2.Salary.Infomation;

public class Salary1{

    public static void main(String[]agrs){
        Salary salary = new Salary();

        Infomation s1 = salary.new Infomation();

        Calculate c1 = salary.new Calculate();

        System.out.println("__Information__");
        s1.MaNv();
        s1.Ten();
        s1.Tuoi();
        s1.DiaChi();
        c1.nhapDoanhso();

        System.out.println(" ");

        System.out.println("__Result__" );
        s1.ShowNumber();
        s1.ShowName();
        s1.ShowAge();
        s1.ShowAddress();  

        if(c1.doanhso >= 5000000){
            c1.Luong1();
        }
        if(c1.doanhso < 5000000 & c1.doanhso > 0){
            c1.Luong2();
        }
        if(c1.doanhso == 0){
            c1.Luong3();

        }

}
}
