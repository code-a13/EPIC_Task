package Conditionals;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character :");
        char ch = sc.next().charAt(0);
        int res = ch;
        if(res>=65 && res <=90 || res >=97 && res <=122){
            System.out.println("Alphabet");
        }
        else{
            System.out.println("Not an Alphabet");
        }
        sc.close();
    }
}
