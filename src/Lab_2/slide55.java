//Các số chia hết cho 5 trong phạm vi 0 - 20 (slide 55)

// for i in range(1,21):
//     if i % 5 == 0:
//         print(i)

package Lab_2;


public class slide55{
    public static void main(String[]args ){
        for (int i = 0; i <= 20; i +=5) //Tăng i lên 5 sau mỗi vòng lặp
        {
            System.out.println(i);
        }
    }

}