import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        System.out.println("Binary to Decimal :"+Task13.btod(n));
        sc.close();
    }
    public static int btod(int n){
        int i = 0;
        int sum = 0;
        while(n>0){
            sum += (n%10)*Math.pow(2, i);
            i++;
            n/=10;
        }
        return sum;
    }
}
