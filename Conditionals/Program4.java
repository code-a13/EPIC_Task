package Conditionals;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args){
        //Swap two number using 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();
        System.out.println("Number 1 :"+ num1 );
        System.out.println("Number 2 :"+num2);
        System.out.println("After Swap");
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Number 1 :"+num1);
        System.out.println("Number 2 :"+num2);
        sc.close();
    }
}
