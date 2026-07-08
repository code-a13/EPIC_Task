package Operators;
public class AdityaPattern {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < n; i++) {
            
            // Letter A
            for (int j = 0; j < 5; j++) {
                if (((j == 0 || j == 4) && i != 0) || (i == 0 && j > 0 && j < 4) || i == n / 2)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("  ");

            // Letter D
            for (int j = 0; j < 5; j++) {
                if (j == 0 || (j == 4 && i != 0 && i != n - 1) || ((i == 0 || i == n - 1) && j < 4))
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("  ");

            // Letter I
            for (int j = 0; j < 5; j++) {
                if (j == 2 || i == 0 || i == n - 1)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("  ");

            // Letter T
            for (int j = 0; j < 5; j++) {
                if (i == 0 || j == 2)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("  ");

            // Letter Y
            for (int j = 0; j < 5; j++) {
                if ((i == j && i <= 3) || (i + j == 4 && i <= 3) || (j == 2 && i > 3))
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("  ");

            // Letter A
            for (int j = 0; j < 5; j++) {
                if (((j == 0 || j == 4) && i != 0) || (i == 0 && j > 0 && j < 4) || i == n / 2)
                    System.out.print("*");
                else System.out.print(" ");
            }
            
            System.out.println();
        }
    }
}