/*
A loop statement allows us to execute a statement or group of statements multiple times
1.While Loop:
"Repeats a statement or group of statements while a given condition is true.
It tests the condition before executing the loop body. "

2.For Loop:
"Execute a sequence of statements multiple times and
abbreviates the code that manages the loop variable. "

3.Do-While Loop:
"Like a while statement, except that it tests the condition at the end of the loop body. "

 */
public class Loops {
    public static void main(String[] args) {
        //Using while Loop
        int y = 10;
        while( y <= 20 ) {
            System.out.print("value of y : " + y);
            y++;
            System.out.print("\n");
        }
        //Using for Loop
        for(int x = 10; x <= 20; x++) {
            System.out.print("value of x : " + x );
            System.out.print("\n");
        }
        //Using do-while Loop
        int z = 10;
        do{
            System.out.print("value of z : " + z );
            z++;
            System.out.print("\n");
        }while( z <= 20 );
    }
}
