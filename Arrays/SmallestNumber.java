import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println("Smallest number :"+SmallestNumber(array));
        sc.close();
    }
    public static int SmallestNumber(int[] nums){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(min>nums[i]){
                min = nums[i];
            }
        }
        return min;
    }
}
