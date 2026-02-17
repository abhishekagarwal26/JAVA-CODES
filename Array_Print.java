package lecture;

import java.util.Scanner;

public class Array_Print {
    static void main(String[] args) {
        int arrInt[] = new int[3];
        Scanner sc = new Scanner(System.in);

       // int num = sc.nextInt();
        // arrInt[0] = sc.nextInt();
        // arrInt[1] = sc.nextInt();
        // arrInt[2] = sc.nextInt();

        for(int i =0;i<3;i++){
            arrInt[i] = sc.nextInt();
        }
        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);
    }
}
