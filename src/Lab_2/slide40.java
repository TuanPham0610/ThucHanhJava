//Tính số ngày trong tháng (slide 40)

package Lab_2;

import java.util.Scanner; 
public class slide40{

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Days:  ");
            int days = sc.nextInt();
            switch (days) {
                case 1:
                    System.out.println("Thu 2");    
                    break;
                case 2:
                    System.out.println("Thu 3");    
                    break;
                case 3:
                    System.out.println("Thu 4");    
                    break;
                case 4:
                    System.out.println("Thu 5");    
                    break;
                case 5:
                    System.out.println("Thu 6");    
                    break;
                case 6:
                    System.out.println("Thu 7");    
                    break;
                case 7:
                    System.out.println("Chu Nhat");    
                    break;
                
            
                default:
                    break;
            }


      

            
            sc.close();
        }
    }
    