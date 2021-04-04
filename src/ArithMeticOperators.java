/*
Arithmetic Operators in Java
1.Addition = '+'
2.Subtraction = '-'
3.Multiplication = '*'
4.Division = '/'
5.Modulo = '%'
6.increment = '++'
7.decrement = '--'
We will Perform all arithmetic operations using a separate methods for each operator
 */
class Operations{
    public void addition(int num1,int num2){
        int result = num1 + num2;
        System.out.println("Addition : A + B =\t"+result);
    }
    public void Subtraction(int num1,int num2){
        int result  = num1 - num2;
        System.out.println("Subtraction : A - B =\t"+result);
    }
    public void multiplication(int num1,int num2){
        int result = num1 * num2;
        System.out.println("Multiplication : A * B =\t"+result);
    }
    public void division(int num1,int num2){
        int result = num1 / num2;
        System.out.println("Division : A / B =\t"+result);
    }
    public void modulo(int num1 , int num2){
        int result = num1 % num2;
        System.out.println("Modulo : A % B =\t"+result);
    }
    public void increment(int num1){
        System.out.println("Increment : \nA ="+num1+"\n"+"A++ ="+num1++);//it will increase value after execution
        System.out.println("Increment : \nA ="+num1+"\n"+"A++ ="+(++num1));//it will increase value before execution
    }
    public void decrement(int num1){
        //it will decrease value after execution
        System.out.println("Decrement : \nA ="+num1+"\n"+"A-- ="+num1--);
        //it will decrease value before execution
        System.out.println("Decrement : \nA ="+num1+"\n"+"--A ="+(--num1));
    }
}
public class ArithMeticOperators {
    public static void main(String[] args) {
        Operations operations = new Operations();
        operations.addition(10,20);
        operations.Subtraction(20,10);
        operations.multiplication(10,20);
        operations.division(20,10);
        operations.modulo(5,2);
        operations.increment(10);
        operations.decrement(10);
    }

}
