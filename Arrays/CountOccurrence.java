import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the Value to Count Occurrence :");
        int target = sc.nextInt();
        System.out.println("Value occurred : "+CountOccurrence(array, target));
        sc.close();
    }

    public static int CountOccurrence(int nums[],int target){
        int occurences = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==target){
                occurences++;
            }
        }
        return occurences;
    }
}
