package a2z_Pattern;

public class H {
    
    public static void main(String[] args) {
        H h = new H();
        h.pattern8(4);
    }

    public void pattern8(int n){
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=n-i+1;j++){
                System.out.print(n-i+1);
            }
            System.out.println();
        }
    }
}
// 4444
// 333
// 22
// 1