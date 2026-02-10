package lecture;

import java.util.Scanner;

public class Lec05_Reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to reverse: ");
        int num = sc.nextInt();

        int reversed = 0;
        for (;num>0;) {
            int digit = num % 10;
            num/=10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}