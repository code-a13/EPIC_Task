import java.util.Scanner;

public class IsArraySorted {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
        }
        if(IsArraySorted(array)){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Unsorted");
        }
        sc.close();
    }
    public static boolean IsArraySorted(int nums[]){
        boolean result = true;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]>nums[i]){
                result = false;
                break;
            }
        }
        return result;
    }
}
