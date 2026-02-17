package lecture;

public class Break {
    static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 8) {
                break;
            }
            System.out.println(i + " ");
        }
        for (int i = 0; i <= 6; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i + " ");
        }
    }
}