
import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        if(StrongNumber.strong(n)){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }
        sc.close();
    }
    public static boolean strong(int n){
        int strong = 0;
        int number = n;
        while(n>0){
            strong += Factorial.factorial(n%10);
            n /=10;
        }
        return strong == number ? true :false;
    }
}
/**
 *  A Strong Number is equal to the sum of the factorials of its digits.
 */