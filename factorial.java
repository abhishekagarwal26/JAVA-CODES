import java.util.Scanner;

public class factorial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 1;
        if(num<0){
            System.out.println("INVALID");
        }
        else{
            for(int i=1;i<=num;i++){
                result = result * i;
        }
            System.out.println(result);

        }
    }
}
