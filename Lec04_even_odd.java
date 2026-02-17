package lecture;

import java.util.Scanner;

public class Lec04_even_odd {
    public static void main(String[] args) {
        //for(int st=1 ; st<=10 ; st=st+1) {
            //System.out.println(st);
        //}
        //Scanner sc = new Scanner(System.in);
        //int number = sc.nextInt();
        //for(int i=0; i<=number; i=i+2) {
            //System.out.println(i+" ");
        //}
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i=1; i<=number; i=i+2) {
            System.out.println(i + " ");
        }
    }
}
