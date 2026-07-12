
import java.util.Scanner;

public class DecimaltoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        System.out.println(DecimaltoBinary.dtob(n));
        sc.close();
    }
    public static int dtob(int n){
        int binary = 0;
        int placeValue = 1;

        while (n > 0) {
            binary = binary + ( n%2 * placeValue); 
            placeValue = placeValue * 10; 
            n = n / 2;
        }
        return binary;
    }
}
