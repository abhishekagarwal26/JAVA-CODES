import java.util.Scanner;

public class Temperature_check {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        if(temp<=0){
            System.out.println("Freezing");
        }
        else if(temp>=1 && temp<=15){
            System.out.println("Cold");
        }
        else{
            System.out.println("Normal");
        }
    }
}