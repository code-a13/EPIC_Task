import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
        }
        CopyArray(array);
        sc.close();
    }

    public static void CopyArray(int nums[]){
        int copy[] = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            copy[i]=nums[i];
        }
        System.out.println("Original Array : "+Arrays.toString(nums));
        System.out.println("Copy Array : "+Arrays.toString(copy));
    }
}
