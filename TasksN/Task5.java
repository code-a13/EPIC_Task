
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        Task5.fibonacci(n);
        sc.close();
    }
    public static void fibonacci(int n){
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        
        for(int i = 2;i<n;i++){
            int c = a+b;
            System.out.print(c+" ");
            int temp = b;
            b = c;
            a = temp;
        }
    }
}
