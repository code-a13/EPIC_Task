import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        ReverseNumber.reverseNumber(n);
        sc.close();
    }
    public static void reverseNumber(int n){
        int rev = 0;
        while (n>0) {
            rev = (rev)*10 + n%10;
            n /=10;
        }
        System.out.println("Reverse: "+rev);
    }
}
