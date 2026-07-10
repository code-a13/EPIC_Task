
public class L {
    public static void main(String[] args) {
        L l = new L();
    l.pattern12(4);
    }
    public void pattern12(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(i<=j ){
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
// ****
//  ***
//   **
//    *