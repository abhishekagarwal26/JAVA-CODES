import java.util.Scanner;

public class sum_from_1_to_that_number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=num;i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
