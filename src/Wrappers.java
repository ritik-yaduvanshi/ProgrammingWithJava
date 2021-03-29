import java.util.Scanner;

public class Wrappers {
    /*
    Wrapper Class is used for converting a primitive into Object Datatype
    and Object into Primitive.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //primitive type of value
        int value = scan.nextInt();
        long bigValue = scan.nextLong();
        char ch = scan.next().charAt(0);

        //Converting this data into Object data (It is called AutoBoxing)
        Integer objValue = new Integer(value);//int to Integer conversion explicitly
        //You may use simply
        Integer ObjValue = value;
        Long BigValue = bigValue;
        Character character = ch;

        //Object Data
        Integer num = 50;
        Character chars = 'B';
        Long Values = 64854858L;
        Float num1 = 34.457F;

        ///Converting Object to Primitive (It is Called UnBoxing)
        int newNumber = num.intValue();//Converting Integer to int explicitly
        //You may use simply
        int newNum = num;
        char chars1 = chars;
        long values1 = Values;
        float num2 = num1;

        System.out.println("int Value:\s"+value+"\t"+"Integer Object value:\s"+ObjValue);
        System.out.println("long Value:\s"+bigValue+"\t"+"Long Object Value:\s"+BigValue);
        System.out.println("char Value:\s"+ch+"\t"+"Character Object Value:\s"+character);
    }
}
