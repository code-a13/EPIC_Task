import java.util.Scanner;

public class CheckTwoArrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array 1 :");
        int n1 = sc.nextInt();
        int [] array1 = new int[n1];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n1; i++) {
            array1[i]=sc.nextInt();
        }
        System.out.println("Enter the Size of Array 2: ");
        int n2 = sc.nextInt();
        int [] array2 = new int[n2];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n2; i++) {
            array2[i]=sc.nextInt();
        }
        System.out.println(CheckTwoArrays(array1,array2) ? "Equal" : "Not Equal");
        sc.close();
    }
    public static boolean CheckTwoArrays(int nums1[],int nums2[]){
        if(nums1.length != nums2.length){
            return false;
        }
        for (int i = 0; i < nums2.length; i++) {
            if(nums1[i]!=nums2[i]){
                return false;
            }
        }
        
        return true;
    }
}