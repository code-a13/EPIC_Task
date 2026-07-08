package a2z_Pattern;

public class C {
    public static void main(String[] args) {
        C c = new C();
        c.pattern3(4);
    }
    public void pattern3(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// *
// **
// ***
// ****