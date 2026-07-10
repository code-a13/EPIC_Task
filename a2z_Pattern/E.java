
public class E {
    public static void main(String[] args) {
        E e = new E();
        e.pattern5(4);
    }
    public void pattern5(int n){
        int start = 0;
        for (int i = 1; i <=n; i++) {
            start = i%2 == 0? 0 : 1;
            for (int j = 1; j <=i; j++) {
                System.out.print(start);
                start += start == 0 ? 1 : -1;
            }
            System.out.println();
        }
    }
}
// 1
// 01
// 101
// 0101