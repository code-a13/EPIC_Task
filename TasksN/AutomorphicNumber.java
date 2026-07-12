import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        if(AutomorphicNumber.isAutomorphic(n)){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("Not a Automorphic Number");
        }
        sc.close();
    }
    public static boolean isAutomorphic(int num) {
    int square = num * num;
    while (num > 0) {
        if (num % 10 != square % 10) return false;
        num /= 10;
        square /= 10;
    }
    return true;
}

}
