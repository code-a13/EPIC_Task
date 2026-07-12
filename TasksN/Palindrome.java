

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        Palindrome.palindrome(n);
        sc.close();
    }
    public static void palindrome(int n ){
        int temp = n;
        int rev = 0;
        while (n>0) {
            rev = (rev)*10 + n%10;
            n /=10;
        }
        System.out.println("Reverse: "+rev);
        if(rev == temp){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
