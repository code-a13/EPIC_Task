import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the Element to search :");
        int target = sc.nextInt();
        System.out.println("Element found at "+LinearSearch(array,target)+" index");
        sc.close();
    }
    public static int  LinearSearch(int nums[],int target){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
