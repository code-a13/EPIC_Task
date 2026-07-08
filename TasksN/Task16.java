package TasksN;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        if(Task16.ishappy(n)){
            System.out.println("Happy Number");
        }
        else{
            System.out.println("Not a Happy Number");
        }
        sc.close();
    }
    public static boolean ishappy(int n){
        if(n == 1){
            return true;
        }
        if(n ==4){
            return false;
        }
        int sum = 0;
        while (n>0) {
            sum += Math.pow(n%10, 2);
            n/=10;
        }
        
        return ishappy(sum);
    }
}
/**
 * Replace the number with the sum of the squares of its digits repeatedly until it becomes 1 (Happy Number) or enters a loop (Not Happy).
 */