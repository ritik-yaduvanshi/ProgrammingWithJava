/*
Logical Operators in Java
1. && (Logical and)
"If both the operands are non-zero, then the condition becomes true."
2. || (Logical or)
"If any of the two operands are non-zero, then the condition becomes true. "
3. ! (Logical not)
"Use to reverses the logical state of its operand.
If a condition is true then Logical NOT operator will make false."
 */
public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a&&b));
        System.out.println("a || b = " + (a||b) );
        System.out.println("!(a && b) = " + !(a && b));
    }
}
