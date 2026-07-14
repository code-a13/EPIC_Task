import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println("Second Largest Number :"+SecondLargest(array));
        sc.close();
    }
    public static int SecondLargest(int nums[]){
        int max = Integer.MIN_VALUE,smax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(max<nums[i]){
                smax = max;
                max = nums[i];
            }
            if(max != nums[i]&& smax<nums[i]){
                smax = nums[i];
            }
        }
        if(smax == Integer.MIN_VALUE){
            return -1;
        }
        return smax;
    }
}
