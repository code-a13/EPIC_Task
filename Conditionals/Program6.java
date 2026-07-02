package Conditionals;
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        //Odd or Even 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num1 = sc.nextInt();
        if(num1%2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
        sc.close();
    }
}
