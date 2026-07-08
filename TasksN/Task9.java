package TasksN;

import java.util.Scanner;

public class Task9{
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter a Number: ");
        int n2 = sc.nextInt();
        System.out.println("LCM :"+Task9.lcm(n1,n2));
        sc.close();
    }
    //Formula : product of two numbers / gcd of two numbers
    public static int lcm(int n1,int n2){
        return n1*n2/(Task8.gcd(n1, n2));
    }
}