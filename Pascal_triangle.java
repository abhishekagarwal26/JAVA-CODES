package lecture;

public class Pascal_triangle {
    public static void main(String[] args) {
        int rows = 5;

        int[][] triangle = new int[rows][rows];

        for (int i = 0; i < rows; i++) {
            for (int s = 0; s < rows - i; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
