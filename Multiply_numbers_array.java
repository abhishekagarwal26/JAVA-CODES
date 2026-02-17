package lecture;

import java.util.Scanner;

public class Multiply_numbers_array {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        int Multiply = 1;
        for(int i = 0;i<len;i++) {
            Multiply *= arr[i];
        }
        System.out.print(Multiply);
    }
}
