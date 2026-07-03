
public class Bit{
    public static void main(String[] args) {
        //PURE LOGIC 
        //Bitwise NOT &
        System.out.println(9 & 5);// 1
        // Bitwise OR  |
        System.out.println(9 | 5);// 13
        // Bitwise XOR ^
        System.out.println(3 ^ 5);// 6
        //  FORMULAS
        // ~ -> -(X+1)
        System.out.println(~5);//-6
        // << (SHIFT LEFT) X = 5 , N = 2 . => X * 2^N
        System.out.println(5 << 2);//20
        // >> (SHIFT RIGHT) X = 5 , N = 2 . => X / 2^N
        System.out.println(5>>2);//1
        
    }
}