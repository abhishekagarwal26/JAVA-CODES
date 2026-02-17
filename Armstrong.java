package lecture;

import java.util.Scanner;

public class Armstrong {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
        int armstrongNum=0;
        int temp=num;
        while (temp!=0){
            int digit = temp%10;
            count++;
            temp/=10;
        }int temp1=num;
        while(temp1!=0){
            int digit = temp1%10;
            armstrongNum+=Math.pow(digit,count);
            temp1/=10;
        }
        if(num==armstrongNum){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}
