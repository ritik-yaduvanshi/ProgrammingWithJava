/*
Bitwise operator works on bits and performs
bit-by-bit operation.
1.& (bitwise and)
2.| (bitwise or)
3.^ (bitwise XOR)
4.~ (bitwise compliment)
5.<< (left shift)
6.>> (right shift)
7.>>> (zero fill right shift)
 */
public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 60; /* 60 = 0011 1100 */
        int b = 13; /* 13 = 0000 1101 */
        int c = 0;
        c = a & b; /* 12 = 0000 1100 */
        System.out.println("a & b = " + c );
        c = a | b; /* 61 = 0011 1101 */
        System.out.println("a | b = " + c );
        c = a ^ b; /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c );
        c = ~a; /*-61 = 1100 0011 */
        System.out.println("~a = " + c );
        c = a << 2; /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c );
        c = a >> 2; /* 15 = 1111 */
        System.out.println("a >> 2 = " + c );
        c = a >>> 2; /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + c );
    }
}
