
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter a Number: ");
        int n2 = sc.nextInt();
        Task7.swap(n1,n2);
        sc.close();
    }
    public static void swap(int n1,int n2){
        n1 = n1+n2;
        n2 = n1-n2;
        n1 = n1 - n2;
        System.out.println(n1);
        System.out.println(n2);
    }
}
