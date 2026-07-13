import java.util.Arrays;
import java.util.Scanner;

public class CountOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
        }
        int[] count = CountOddEven(array);
        System.out.println("Even and Odd Numbers :"+ Arrays.toString(count));
        sc.close();
    }
    public static int[] CountOddEven(int nums[]){
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0){
                result[0]++;
            }
            else{
                result[1]++;
            }
        }
        return result;
    }
}
