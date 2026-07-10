
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        if(Task15.perfect(n)){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a Perfect Number");
        }
        sc.close();
    }
    public static boolean perfect(int n){
        int perfect = 0;
        for (int i = 1; i < n; i++) {
            if(n%i==0){
                perfect += i;
            }
        }
        return perfect == n ? true : false;
    }
}
/**
 *  A Perfect Number is equal to the sum of its proper divisors 
 * (excluding the number itself).
 */
