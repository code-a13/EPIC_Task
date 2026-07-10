
public class D {
    public static void main(String[] args) {
        D d = new D();
        d.pattern4(4);
    }
    public void pattern4(int n ){
        for (int i = 1; i <=n; i++) {
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
// 1
// 12
// 123
// 1234