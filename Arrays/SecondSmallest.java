import java.util.Scanner;

public class SecondSmallest {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println("Second Smallest Number :"+SecondSmallest(array));
        sc.close();
    }
    public static int SecondSmallest(int nums[]){
        int min = Integer.MAX_VALUE,smin = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(min>nums[i]){
                smin = min;
                min = nums[i];
            }
            if(min != nums[i]&& smin>nums[i]){
                smin = nums[i];
            }
        }
        if(smin == Integer.MAX_VALUE){
            return -1;
        }
        return smin;
    }
}
