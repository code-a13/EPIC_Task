import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println("Largest Number :"+LargestElement(array));
        sc.close();
    }
    public static int LargestElement(int nums[]){
        int max = 0;
        for(int i = 0;i<nums.length;i++){
            if(max<nums[i]){
                max = nums[i];
            }
        }
        return max;
    }
}
