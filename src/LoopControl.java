/*
Loop control statements change execution from its normal sequence.
When execution leaves a scope, all automatic objects
that were created in that scope are destroyed.
1.break :
"Terminates the loop or switch statement and transfers execution to the statement
immediately following the loop or switch. "

2.continue :
"Causes the loop to skip the remainder of its body and immediately retest
 its condition prior to reiterating. "
 */
public class LoopControl {
    public static void main(String[] args) {
        int [] numbers = {10, 20, 30, 40, 50};
        System.out.println("Use Of break :");
        for(int x : numbers ) {
            if( x == 30 ) {
                break;
            }
            System.out.print( x );
            System.out.print("\n");
        }
        System.out.println("Use Of continue :");
        for(int x : numbers ) {
            if( x == 30 ) {
                continue;
            }
            System.out.print( x );
            System.out.print("\n");
        }
    }
}
