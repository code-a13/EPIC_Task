package a2z_Pattern;

public class G {
    public static void main(String[] args) {
        G g = new G();
        g.pattern7(4);
    }
    public void pattern7(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// ****
// ***
// **
// *