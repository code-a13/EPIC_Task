package Operators;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 :");
        int num1 = sc.nextInt();
        
        System.out.println("Enter Number 2 :");
        int num2 = sc.nextInt();
        
        System.out.println("Enter Number 3 :");
        int num3 = sc.nextInt();
        
        if (num1 == num2 && num2 == num3) {
            System.out.println("All are Equal " + num1);
        } 
        else if (num1 <= num2) {
            if (num1 <= num3) {
                System.out.println("Number 1 is smaller " + num1);
            } else {
                System.out.println("Number 3 is smaller " + num3);
            }
        } 
        else { 
            if (num2 <= num3) {
                System.out.println("Number 2 is smaller " + num2);
            } else {
                System.out.println("Number 3 is smaller " + num3);
            }
        }
        
        sc.close();
    }
}