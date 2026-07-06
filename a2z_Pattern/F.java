package a2z_Pattern;

public class F {
    public static void main(String[] args) {
        F f = new F();
        f.pattern6(4);
    }
    public void pattern6(int n){
        int count = 0;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                count++;
                System.out.print(count);
            }
            System.out.println();
        }
    }
}
// 1
// 23
// 456
// 78910