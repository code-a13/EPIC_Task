package TasksN;

import java.util.Scanner;

public class Task10 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        System.out.println("Sum of Digits: "+Task10.sod(n));
        sc.close();
    }
    public static int sod(int n){
        // stores the sum of digits
        int sod = 0;
        while(n>0){
            sod += n%10;
            n/=10;
        }
        return sod;
    }
}
