package Person;

import java.util.Scanner;

public class Person{
    public String HoTen;
    public int Tuoi;

    public void nhapHoTen(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho va ten: ");
        HoTen = sc.nextLine();
    }

    public void nhapTuoi(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuoi: ");
        Tuoi = sc.nextInt();
    }

    public void inTT(){
        System.out.println("Ho va ten: " + HoTen);
        System.out.println("Tuoi: " + Tuoi);
    }
    public static void main(String[] args) {
        Person ps = new Person();
        ps.nhapHoTen();
        ps.nhapTuoi();
        ps.inTT();

        
    }
}