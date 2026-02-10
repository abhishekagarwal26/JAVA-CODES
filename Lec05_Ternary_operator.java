package lecture;

import java.util.Scanner;

public class Lec05_Ternary_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int res = num1>num2 ? num1 : num2;
        System.out.println(res);
        System.out.println(num2%2 == 0? "Even" : "Odd");
        System.out.println(num1>=num2 && num1>=num3 ? num1:
                (num2>=num1 && num2>=num3)? num2 : num3 );
    }
}