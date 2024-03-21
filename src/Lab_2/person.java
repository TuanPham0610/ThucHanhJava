package Lab_2;

import java.util.Scanner;

public class person {

    public String Name;
    public int Age;
    public String Address;

    Scanner sc = new Scanner(System.in);

    public void HovaTen(){
        
        System.out.print("Ho va ten: ");
        Name = sc.nextLine();
    }

    public void Tuoi(){
        System.out.print("Tuoi: ");
        Age = sc.nextInt();
        sc.nextLine();
    }

    public void DiaChi(){
        System.out.print("Dia chi: ");
        Address = sc.nextLine();
        sc.close();
    }


}
