import java.util.Scanner;
//CodexRitik
public class DataTypesInJava {
    public static void main(String[] args) {
        //Taking User input Using Scanner
        Scanner scan = new Scanner(System.in);
        //Integer Datatypes
        byte num = scan.nextByte();
        short num1 = scan.nextShort();
        int num3 = scan.nextInt();
        long number = scan.nextLong();

        //Floating Datatypes
        float num4 = scan.nextFloat();
        double num5 = scan.nextDouble();
        //character datatype
        char ch = scan.next().charAt(0);
        //Boolean Datatype
        boolean res = false;

        System.out.println("Byte Value\t"+num);
        System.out.println("Short Value\t"+num1);
        System.out.println("int Value\t"+num3);
        System.out.println("Long value\t"+number);
        System.out.println("Float Value\t"+num4);
        System.out.println("Double value\t"+num5);
        System.out.println("Char value\t"+ch);
        System.out.println("Boolean Value\t"+res);

    }
}
