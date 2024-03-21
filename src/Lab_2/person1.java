package Lab_2;

public class person1{
    public static void main(String[] args) {

        person p = new person();

        p.HovaTen();
        p.Tuoi();
        p.DiaChi();

        System.out.print("Name: " + p.Name);
        System.out.println(" ");
        System.out.print("Age: " + p.Age);
        System.out.println(" ");
        System.out.print("Address: " + p.Address);
    }
}