import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeArrays {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of First Array:");
        int n1 = sc.nextInt();
        int [] array1 = new int[n1];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n1; i++) {
            array1[i]=sc.nextInt();
        }
        System.out.println("Enter the Size of Second Array:");
        int n2 = sc.nextInt();
        int [] array2 = new int[n2];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n2; i++) {
            array2[i]=sc.nextInt();
        }
        System.out.println(MergeArrays(array1, array2));
        sc.close();
    }
    public static List<Integer> MergeArrays(int nums1[],int nums2[]){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i< nums1.length; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i< nums2.length; i++) {
            list.add(nums2[i]);
        }
        return list;
    }
}
