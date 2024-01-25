
//Nếu tổng các số đã nhập mà lớn hơn 100 thì in ra kết quả (Slide 47 và bài 5 slide 94)

package Lab_2;
import java.util.Scanner; 

public class slide47_94{
    public static void main(String[] args) {
        
    } {
        int number, sum = 0, m=0;

        Scanner sc = new Scanner(System.in);

    do{
        System.out.print("Number "+ (m+=1) + ":"); // m là biến đếm 
        number = sc.nextInt();

        sum += number; // cộng và gán giá trị cho sum

    }while (sum <= 100); // nếu sum lớn hơn 100 thì in ra giá trị
      System.out.println("Total = "+sum);
     
 
        sc.close();
}
}


