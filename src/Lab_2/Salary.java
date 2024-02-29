package Lab_2;

import java.util.Scanner;

public class Salary{

    class Infomation{
        public int Number;
        public String Name;
        public int Age;
        public String Address;
        
        Scanner sc = new Scanner(System.in);

        // Điền mã nv
        public void MaNv(){
            System.out.print("Number: ");
            Number = sc.nextInt();
            sc.nextLine();
        }
        
        // Điền tên
        public void Ten(){
            System.out.print("Name: ");
            Name = sc.nextLine();
        }

        // Điền tuổi
        public void Tuoi(){
            System.out.print("Age: ");
            Age = sc.nextInt();
            sc.nextLine();
            // Thêm sc.nextLine để có thể tiếp tục chuyển qua phần nhập Địa chỉ 
        }

        // Điền địa chỉ
        public void DiaChi(){
            System.out.print("Address: ");
            Address = sc.nextLine();
        }

    // Show ra các thông tin vừa nhập

        // Mã nhân viên
        public void ShowNumber(){
            System.out.println("Number: "+ Number);
        }

        // Tên nhân viên
        public void ShowName(){
            System.out.println("Name: "+ Name);
        }

        // Tuổi nhân viên
        public void ShowAge(){
            System.out.println("Age: "+ Age);
        }

        // Địa chỉ
        public void ShowAddress(){
            System.out.println("Address: "+ Address);
        }

    }

    class Calculate{
        public int luongCung = 10000000; //Lương cứng 10tr
        public int thuong = 1000000; //Doanh số trên 5tr thì thưởng 1tr
        final public float phantram = 0.1f; // 10%
        public int doanhso;
    
        public double l1; //Lương 1: Nv có doanh thu >= 5tr
        public double l2; //Lương 2: Nv có doanh thu > 0 và < 5tr
        public double l3; //Lương 3: Nv ko có doanh thu
    
        Scanner sc = new Scanner(System.in);
    
        public void nhapDoanhso(){
            System.out.print("Doanh so: ");
            doanhso = sc.nextInt();
        }
    
        public void Luong1(){
            l1 = luongCung + phantram * doanhso + thuong;
            System.out.print("Salary: "+ (int)l1); // chuyển double thành int để hiển thị lương 
        }
    
        public void Luong2(){
            l2 = luongCung + phantram * doanhso;
            System.out.print("Salary: "+(int)l2);
        }
    
        public void Luong3(){
            l3 = luongCung - phantram * luongCung;
            System.out.print("Salary: "+(int)l3);
        }
      
    } 

}

