import java.util.Scanner;

public class Vowels_or_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if(ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'O' ||
        ch == 'U' || ch == 'I' ){
            System.out.println(ch + " is a vowel");
        }
        else{
            System.out.println(ch + " is a consonant");
        }
    }
}