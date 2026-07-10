
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        Task4.prime(n);
        sc.close();
    }
    public static void prime(int n){
        int count = 0;
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count == 0){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
}
