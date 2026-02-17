package lecture;

import java.util.Scanner;

public class length_array {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,3,4,5,8};
        System.out.println("Length of array = " + arr.length);
        int len = arr.length;

        int sum = 0;
        for(int i = 0; i<len; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of Arrays = " + sum);
    }
}
