
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter a Number: ");
        int n2 = sc.nextInt();
        System.out.println("GCD :"+GCD.gcd(n1,n2));
        sc.close();
    }
    public static int gcd(int n1,int n2){

        for(int i = Math.max(n1, n2);i>0;i--){
            if(n1%i == 0 && n2%i == 0){
                return i;
            }
        }

        return -1;
    }
}
