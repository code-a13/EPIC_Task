
public class K {
    
    public static void main(String[] args) {
        K k = new K();
        k.pattern11(4);
    }
    public void pattern11(int n){
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n;j++){
                if(i+j>=n+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
//    *
//   **
//  ***
// ****