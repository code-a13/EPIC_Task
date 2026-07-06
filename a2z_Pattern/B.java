package a2z_Pattern;

public class B {
    public static void main(String[] args) {
        B b = new B();
        b.pattern2(4);
    }
    public void pattern2(int n){
        for (int i = 1; i <=n; i++) {
            for(int j =1;j<=n;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
// 1111
// 2222
// 3333
// 4444
