package Conditionals;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        //Swap two Variables without third variable
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();
        System.out.println("Number 1 :"+ num1 );
        System.out.println("Number 2 :"+num2);
        System.out.println("After Swap");
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 -num2;
        System.out.println("Number 1 :"+ num1 );
        System.out.println("Number 2 :"+num2);
        sc.close();
    }
}
