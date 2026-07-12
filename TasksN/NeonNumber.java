import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        if(NeonNumber.isNeon(n)){
            System.out.println("Neon Number");
        }
        else{
            System.out.println("Not a Neon Number");
        }
        sc.close();
    }
    public static boolean isNeon(int n){
        int temp = n;
        int square = n*n;
        n = square;
        int sum = 0;
        while(n>0){
            sum += n%10;
            n/=10;
        }
        return  sum == temp ;
    }
}
