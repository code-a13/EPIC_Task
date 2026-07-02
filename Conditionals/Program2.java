package Conditionals;
import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int i = sc.nextInt();
        if(i<0){
            System.out.println("Number is Negative");
        }
        else if(i>0){
            System.out.println("Number is Positive");
        }
        else{
            System.out.println("Number is Zero");
        }
        sc.close();
    }
}
