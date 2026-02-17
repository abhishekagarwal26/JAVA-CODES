package lecture;

import java.util.Scanner;

public class GCD {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int lcm = 1;
        int min = 1;
        int gcd = 1;
        if(n1<n2){
            min=n1;
        }
        else{
            min=n2;
        }
        for (int i =min ; i>0 ; i--){
            if (n1%i==0 && n2%i==0){
                gcd =i;
                break;
            }
        }
        System.out.println(gcd);
    }
}
