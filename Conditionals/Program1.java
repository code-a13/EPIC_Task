package Conditionals;
import java.util.Scanner;

public class Program1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num 1:");
        Integer n1 = sc.nextInt();
        System.out.println("Enter Num 2:");
        int n2 = sc.nextInt();
        n2++;
        System.out.println("Enter Num 3:");
        int n3 = sc.nextInt();
        System.out.println("Enter Num 4:");
        int n4 = sc.nextInt();
        int max = ((n1>n2)?n1:n2)>((n3>n4)?n3:n4)? ((n1 > n2) ? n1 : n2) : ((n3 > n4) ? n3 : n4);;
        System.out.println("Maximum:"+ max);
        Integer i = 90;
        i.byteValue();
        sc.close();
    }
}