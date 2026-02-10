package lecture;

import java.util.Scanner;

public class Lec03_leapyear {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%400 == 0){
            System.out.print(year + " is leap year");
        }
        else if(year%4 == 0 && year%100 != 0 ) {
            System.out.println(year + " is leap year");
        }
        else{
            System.out.print(year + " is not a leap year");
        }
    }
}