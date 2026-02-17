package lecture;

import java.util.Scanner;

public class Lec04_sum_of_number {
    public static void main(String[] args) {
        int number = 5432;
        int sum = 0;

        for (int n = number; n > 0; n = n / 10) {
            int lastDigit = n % 10;
            sum = sum + lastDigit;
        }

        System.out.println("Sum of digits: " + sum);
    }
}