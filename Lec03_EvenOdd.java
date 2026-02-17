package lecture;

import java.util.Scanner;

public class Lec03_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("User given number " + number + " is even");
        }
        else  {
            System.out.println("User given number " + number + " is odd");
        }
    }
}