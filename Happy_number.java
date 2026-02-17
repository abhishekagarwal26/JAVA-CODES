package lecture;

import java.util.Scanner;

public class Happy_number {
    static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       while(n!=1 && n!=4) {
           int sum=0;
           while(n>0){
               int digit = n%10;
               n/=10;
               sum = sum+digit*digit;
           }
           n=sum;
       }
       if(n==1) {
           System.out.println("HAPPY NUMBER");
       }
       else{
           System.out.println("UNHAPPY NUMBER");
       }
    }
}
