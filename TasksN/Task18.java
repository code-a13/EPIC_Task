import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        if(Task18.harshad(n)){
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not a Harshad Number");
        }
        sc.close();
    }
    public static boolean harshad(int n ){
        int temp = n;
        int sum = 0;
        while(n>0){
            sum += n%10;
            n/=10;
        }
        return  temp % sum == 0 ;
    }
}
