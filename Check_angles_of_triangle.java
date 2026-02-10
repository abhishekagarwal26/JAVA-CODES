import java.util.Scanner;

public class Check_angles_of_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st angle -: ");
        int angle1 = sc.nextInt();
        System.out.println("Enter the 2nd angle -: ");
        int angle2 = sc.nextInt();
        System.out.println("Enter the 3rd angle -: ");
        int angle3 = sc.nextInt();

        int sum = angle1 + angle2 + angle3;

        if (sum != 180) {
            System.out.println("Not a valid triangle");
        } else {
            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("Right-angled triangle");
            } else if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
                System.out.println("Acute-angled triangle");
            } else {
                System.out.println("Obtuse-angled triangle");
            }
        }
    }
}