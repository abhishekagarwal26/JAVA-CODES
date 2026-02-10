import java.util.Scanner;

public class print_whether_upper_lower_digit_symbol {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if(Character.isUpperCase(ch))
            System.out.println("UPPERCASE");
        else if(Character.isLowerCase(ch))
            System.out.println("LOWERCASE");
        else if(Character.isDigit(ch))
            System.out.println("Digit");
        else
            System.out.println("SPECIAL SYMBOL");
    }
}