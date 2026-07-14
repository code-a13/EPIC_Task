import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println("Sorted : "+Arrays.toString(SortArray(array)));

        sc.close();
    }
    public  static int[] SortArray(int[] nums) {
    int n = nums.length ;
    for (int i = 0; i < n - 1; i++) {
      int min = i;
      for (int j = i + 1; j < n; j++) {
        if (nums[j] < nums[min]) {
          min = j;
        }
      }
      if (min != i) {
          int temp = nums[i];
          nums[i] = nums[min];
          nums[min] = temp;
        }
    }
    return nums;
  }
}
