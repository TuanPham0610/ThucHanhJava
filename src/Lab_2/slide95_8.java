package Lab_2;

import java.util.Scanner;

public class slide95_8{ 

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập số phần tử muốn tạo: ");
            int n = sc.nextInt();
            double[] numbers = new double[n];
    
            for (int i = 0; i < n; i++) {
                System.out.println("Phần tử thứ " + (i+1) + ": ");
                numbers[i] = sc.nextDouble();
            }
    
            double sum = 0;
            for (double num : numbers) {
                sum += num;
            }
            double average = sum / n;
    
            System.out.println("Trung bình cộng của dãy số: " + average);
            sc.close();
        }
    }
    
