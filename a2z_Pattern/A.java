
public class A {
    public static void main(String[] args) {
        A a = new A();
        a.pattern1(4);
    }
    public void pattern1(int n ){
        for ( int i = 1; i <=n; i++) {
            for(int j = 1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// ****
// ****
// ****
// ****