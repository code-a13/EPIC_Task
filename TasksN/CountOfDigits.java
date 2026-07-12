
import java.util.Scanner;

public class CountOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        System.out.println("Count of Digits: "+CountOfDigits.cod(n));
        sc.close();
    }
    public static int cod(int n){
        int count = 0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }
}
