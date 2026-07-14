import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommonElements {
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
        System.out.println("Common Elements : "+CommonElements(array1,array2));
        sc.close();
    }
    public static List<Integer> CommonElements(int nums1[],int nums2[]){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for(int j = 0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    list.add(nums1[i]);
                }
            }
        }
        return list;
    }
}
