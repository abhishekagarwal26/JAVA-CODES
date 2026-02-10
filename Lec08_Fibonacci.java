package lecture;

import java.util.Scanner;

public class Lec08_Fibonacci {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        for(int i=0; i<n ; i++){
            System.out.print(first + " " );
            int sum = first + second;
            first = second;
            second = sum;
        }
    }
}

 /* LEETCODE

class Solution {
    public int fib(int n) {
        int first=0;
        int second=1;

        for(int i=0;i<n;i++){
            int sum = first+second;
            first=second;
            second=sum;
        }
        return first;
    }
}

 */
