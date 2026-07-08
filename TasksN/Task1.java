package TasksN;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        Task1.reverseNumber(n);
        sc.close();
    }
    public static void reverseNumber(int n){
        int rev = 0;
        while (n>0) {
            rev = (rev)*10 + n%10;
            n /=10;
        }
        System.out.println("Reverse: "+rev);
    }
}
