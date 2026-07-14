import java.util.Scanner;

public class CountInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
        }
        CountInteger(array);
        sc.close();
    }
    public static void CountInteger(int nums[]){
        int positive = 0,negative = 0,zero = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>0){
                positive++;
            }
            else if (nums[i]<0){
                negative++;
            }
            else{
                zero++;
            }
        }
        System.out.println("Positive : "+positive);
        System.out.println("Negative : "+negative);
        System.out.println("Zero : "+zero);
    }
}
