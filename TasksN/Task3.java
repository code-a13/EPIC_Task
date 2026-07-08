package TasksN;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        Task3.armstrong(n);
        sc.close();
    }
    public static void armstrong(int n){
        int temp = n;
        int t = n;
        int count = 0;
        
        while (n > 0) {
            count++;
            n = n / 10; 
        }
        
        int result = 0;
        
        while (temp > 0) {
            int remainder = temp % 10;
            result += Math.pow(remainder, count); 
            temp = temp / 10; 
        }
        
        if (t == result) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}