import java.util.Scanner;

public class Multiply_2_floating_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float Num1 = sc.nextFloat();
        Float Num2 = sc.nextFloat();
        Float Multiplication = Num1*Num2;
        System.out.println(Multiplication);
    }
}