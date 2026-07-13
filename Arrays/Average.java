import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println("Average :"+AverageNumber(array));
        sc.close();
    }
    public static int AverageNumber(int[] nums){
        int n = nums.length;
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum+=nums[i];
        }
        int avg = sum / n;
        return avg;
    }
}
