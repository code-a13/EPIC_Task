package a2z_Pattern;

public class M {
    
    public static void main(String[] args) {
        M m = new M();
        m.pattern13(4);
    }
    public void pattern13(int n){
        for(int i =1;i<=n;i++){
            for(int j =1;j<=2*n-1;j++){
                if(i+j>n && j<2*n -(n-i)){
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
//    *   
//   ***  
//  ***** 
// *******