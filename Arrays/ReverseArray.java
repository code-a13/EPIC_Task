import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
        }
        ReverseArray(array);
        sc.close();
    }
    public static void ReverseArray(int nums[]){
        int l = 0;
        int r = nums.length -1;
        while(l<r){
            int temp = nums[l];
            nums[l]=nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
        System.out.println("Reversed Array :"+ Arrays.toString(nums));
    }
}
