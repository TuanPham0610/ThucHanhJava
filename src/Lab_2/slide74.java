//Mảng 1 chiều 

package Lab_2;

public class slide74 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }

        System.out.println("Tong cac so chan trong mang la: " + sum);
    }
}
