package TasksN;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        Task6.factorial(n);
        sc.close();
    }
    public static void factorial(int n ){
        int fact = 1;
        for(int i = 1;i<=n;i++){
            fact *= i;
        }
        System.out.println("Factorial: "+fact);
    }
}
