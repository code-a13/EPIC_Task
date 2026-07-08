package Operators;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a Number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println("Number 1 is greater "+num1);
        }
        else if(num2>num1){
            System.out.println("Number 2 is greater "+num2);
        }
        else{
            System.out.println("Both are Equal "+num1);
        }
        sc.close();
    }
}
