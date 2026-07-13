import java.util.Scanner;

public class ReadArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
        }
        ReadArray(array);
        sc.close();
    }
    public static void ReadArray(int[] nums){
        System.out.println("Array Elements");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}