
public class I {
    
    public static void main(String[] args) {
        I i = new I();
        i.pattern9(4);
    }
    public void pattern9(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
// 1234
// 123
// 12
// 1