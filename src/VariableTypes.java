class Test{
    int number = 100;//Instance Variable
    static int num = 50;//Class variable
    void display(){
        int sum;//Local Variable
        sum = number + num;
        System.out.println("Total Sum :"+sum);
    }
}
public class VariableTypes {
    public static void main(String[] args) {
        Test test = new Test();//Object creation
        test.display();//Method call
    }
}
