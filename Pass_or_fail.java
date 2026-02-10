import java.util.Scanner;

public class Pass_or_fail {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if(marks>=40 && marks<=100)
            System.out.println("PASS");
        else if(marks>100 || marks<0)
            System.out.println("INVALID MARKS");
        else
            System.out.println("FAIL");
    }
}