public class NumberMethods {
    public static void main(String[] args) {
        /* Number Methods */
        /*1.xxxValue()
        converts the value of this number object to
        the xxx datatype and returns it.*/
        System.out.println("xxxValue() Method:");
        Integer x = 5;
        System.out.println(x.byteValue());
        System.out.println(x.doubleValue());

        /*2.compareTo()
        compares the Number object to the argument
        if the arguments is equal, returns 0; if less then returns -1
        if greater then returns 1.
         */
        System.out.println("compareTo() Method:");
        Integer t = 10;
        System.out.println(t.compareTo(5));
        Float fl = 3.14f;
        System.out.println(fl.compareTo(3.14f));

        /*3.equals() boolean method
        check the number object is equal or not to the argument
        */
        System.out.println("equals() Method:");
        Integer a = 10;
        Integer Y = 20;
        Short y = 20;
        System.out.println(a.equals(Y));
        System.out.println(y.equals(Y));
        /*4.valueOf() static method it also takes string argument and radix
        returns the Integer Objects holding the value of specified primitive
        */
        System.out.println("valueOf() Method:");
        int A = 16;//Hexadecimal base
        Integer X = Integer.valueOf(5);
        Integer b = Integer.valueOf("444",A);
        Double c = Double.valueOf(5);
        System.out.println(X);
        System.out.println(b);
        System.out.println(c);

        /*5.toString()
        returns a String Object representing the value of a specified int or Integer
        */
        System.out.println("toString() Method:");
        Integer d = 10;
        System.out.println(d.toString());
        System.out.println(Integer.toString(400,8));
        /*6.parseInt() is also used for CommandLine Input
        this method is used to get the primitive data type of a certain String
        */
        System.out.println("parseInt() Method:");
        int xx = Integer.parseInt("10");
        double cc = Double.parseDouble("5");
        int bb = Integer.parseInt("222",8);
        System.out.println(xx);
        System.out.println(cc);
        System.out.println(bb);

        /*7.abs()
        returns the absolute value of the argument
        */
        System.out.println("abs() Method:");
        Integer ff = -8;
        double h = -100;
        float k = -90;
        System.out.println(Math.abs(ff));
        System.out.println(Math.abs(h));
        System.out.println(Math.abs(k));

        /*8.ceil()
        returns the smallest integer that is greater then or equal to the
        argument,returned in double.
        */
        System.out.println("ceil() Method:");
        double dd = -100.675;
        float fh = -90;
        System.out.println(Math.ceil(dd));
        System.out.println(Math.ceil(fh));

        /*9.floor()
        returns the largest integer that is less then or equal to the argument,
        returned as double.*/
        System.out.println("floor() Method:");
        double du = -100.675;
        float fll = -90;

        System.out.println(Math.floor(du));
        System.out.println(Math.floor(fll));

        /*10.rint()
        returns the integer that is closest in value to the argument ,
        returned as the double.
        */
        System.out.println("rint() Method:");
        double o = 100.675;
        double op = 100.500;
        System.out.println(o);
        System.out.println(op);

        /*11.round()
        returns the closest long or int ,as indicated by the methods return type
        to the argument.*/
        double n = 100.675;
        double e = 1000.576;
        float fx = 99.1f;

        System.out.println(n);
        System.out.println(e);
        System.out.println(fx);
        /*12.min()
        returns the smaller of the two argument.*/
        System.out.println("min() Method:");
        System.out.println(Math.min(5,6));
        System.out.println(Math.min(3.14,2.24));

        /*13.max()
        returns the larger of the two arguments.*/
        System.out.println("max() Method:");
        System.out.println(Math.max(9,5));
        System.out.println(Math.max(3.12,1.234));

        /*14.exp()
        returns the base of the natural logarithms, e, to the power of the argument
        */
        System.out.println("exp() method:");
        double fj = 11.0464;
        double gg  = 2.76;
        System.out.printf("The Value of e is %.4f%n",Math.E);
        System.out.println(Math.exp(x));
        /*15.log()
        returns the natural logarithms of the argument
        */
        System.out.println("log() Method:");
        double x1 = 11.635;
        double y1 = 2.76;
        System.out.printf("The value of e is %.4f%n", Math.E);
        System.out.println(Math.log(x1));
        /*16.pow()
        returns the value of the first argument raised to the power of the second
        argument.*/
        System.out.println("pow() Method:");
        double xr = 11.635;
        double yr = 2.76;
        System.out.printf("The value of e is %.4f%n", Math.E);
        System.out.println(Math.pow(xr, yr));
        /*17.sqrt()
        returns the square root of the argument*/
        System.out.println("sqrt() Method:");
        System.out.printf("The value of e is %.4f%n", Math.E);
        System.out.println(Math.sqrt(x));
        /*18.sin()
        returns the sine of the specified double value*/
        System.out.println("sin() Method:");
        double degrees = 45.0;
        double radians = Math.toRadians(degrees);
        System.out.format("The value of pi is %.4f%n", Math.PI);
        System.out.format("The sine of %.1f degrees is %.4f%n", degrees, Math.sin(radians));
        /*19.cos()
        returns the cosine of the double value*/
        System.out.println("cos() Method:");
        System.out.format("The value of pi is %.4f%n", Math.PI);
        System.out.format("The cosine of %.1f degrees is %.4f%n", degrees, Math.cos(radians));
        /*20.tan()
        returns the tangent of the double value*/
        System.out.println("tan() Method:");
        System.out.format("The value of pi is %.4f%n", Math.PI);
        System.out.format("The tangent of %.1f degrees is %.4f%n", degrees, Math.tan(radians));
        /*21.asin()
        returns the arcsine of the specified double value*/
        System.out.println("asin() Method:");
        System.out.format("The value of pi is %.4f%n", Math.PI);
        System.out.format("The arcsine of %.4f is %.4f degrees %n", Math.sin(radians), Math.toDegrees(Math.asin(Math.sin(radians))));
        /*22.acos()
        returns the arccosine of the double value
        23.atan()
        returns the arctangent of the double value. similarly you may use this*/

        /*24.atan2()
        converts rectangular coordinates (x,y) to polar coordinate (r,theta)
        and returns theta.*/
        System.out.println("atan2() Method:");
        double xz = 45.0;
        double yz = 30.0;
        System.out.println( Math.atan2(xz, yz) );

        /*25.toDegrees()
        converts the argument to degrees*/
        System.out.println("toDegrees() method:");
        System.out.println( Math.toDegrees(xz) );
        System.out.println( Math.toDegrees(yz) );

        /*26.toRadians()
        converts the arguments to radians*/
        System.out.println("toRadians() Method:");
        System.out.println( Math.toRadians(xz) );
        System.out.println( Math.toRadians(yz) );
        /*27.random()
        returns a random number.
         */
        System.out.println("random() Method:");
        System.out.println( Math.random() );
        System.out.println( Math.random() );
    }
}
