import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        if(Task19.isSpy(n)){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not a Spy Number");
        }
        sc.close();
    }
    public static boolean isSpy(int n){
       
        int sum = 0;
        int product = 1;
        while (n>0){
            sum += n%10;
            product *= n%10;
            n/=10;
        } 
            
    return sum == product;
    }
}
