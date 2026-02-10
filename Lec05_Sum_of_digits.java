package lecture;

import java.util.Scanner;

public class Lec05_Sum_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int sum_of_digits = 0;
        for(;number>0;) {
            int digit = number%10;
            number = number/10;
            sum_of_digits += digit;
        }
        System.out.println("sum of digits is " + sum_of_digits);
    }
}
