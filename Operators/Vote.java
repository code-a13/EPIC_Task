package Operators;
import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Vote:");
        int vote = sc.nextInt();
        if(vote>=18){
            System.out.println("Eligible to Vote");
        }
        else{
            System.out.println("Not Eligible to Vote");
        }
        sc.close();
    }
}
