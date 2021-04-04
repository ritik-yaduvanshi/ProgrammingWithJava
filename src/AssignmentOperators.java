/*
1. =
Simple assignment operator. Assigns values from right side operands to left side operand.
2. +=
Add AND assignment operator. It adds right operand to the left operand and assign the result to left operand.
3. -=
Subtract AND assignment operator. It subtracts right operand from the left operand and assign the result to left operand.
4. *=
Multiply AND assignment operator. It multiplies right operand with the left operand and assign the result to left operand.
5. /=
Divide AND assignment operator. It divides left operand with the right operand and assign the result to left operand.
6. %=
Modulus AND assignment operator. It takes modulus using two operands and assign the result to left operand.
7. <<=
Left shift AND assignment operator.
8. >>=
Right shift AND assignment operator
9. &=
Bitwise AND assignment operator.
10. ^=
bitwise exclusive OR and assignment operator.
11. |=
bitwise inclusive OR and assignment operator.
 */
public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
        c = a + b;
        System.out.println("c = a + b = " + c );
        c += a ;
        System.out.println("c += a = " + c );
        c -= a ;
        System.out.println("c -= a = " + c );
        c *= a ;
        System.out.println("c *= a = " + c );
        a = 10;
        c = 15;
        c /= a ;
        System.out.println("c /= a = " + c );
        a = 10;
        c = 15;
        c %= a ;
        System.out.println("c %= a = " + c );
        c <<= 2 ;
        System.out.println("c <<= 2 = " + c );
        c >>= 2 ;
        System.out.println("c >>= 2 = " + c );
        c >>= 2 ;
        System.out.println("c >>= a = " + c );
        c &= a ;
        System.out.println("c &= 2 = " + c );
        c ^= a ;
        System.out.println("c ^= a = " + c );
        c |= a ;
        System.out.println("c |= a = " + c );
    }
}
