/*This a Basic Implementation of abstract keyword
   Here we will learn a different different uses of
   Abstract Keyword.it is use only with classes and methods.
   we can not use this with variable name.we can't use abstract with final.
   we can't make private methods.
*/

abstract class Human{//abstract class
    String name;
    int age;
    String fruitsName;
    Human(String name,int age,String fruitsName){
        this.name = name;
        this.age = age;
        this.fruitsName = fruitsName;
    }
    abstract void display();//abstract methods
    abstract void eating();//behaviour of human
    abstract void talking();
}
class Child extends Human{

    Child(String name, int age, String fruitsName) {
        super(name, age, fruitsName);
        //super is a keyword .it is used for tailing about a attributes which belongs with parent class
    }

    @Override
    void display() {
        System.out.println("Name :\s"+name+"\n"+"Age :\s"+age);
    }

    @Override
    void eating() {
        System.out.println("He is eating :\s"+fruitsName);
    }

    @Override
    void talking() {
        System.out.println("Hey! How are you?");
    }

}
public class AbstractTest {
    public static void main(String[] args) {
        Child child = new Child("CodexRitik",21,"Apple");
        child.display();
        child.eating();
        child.talking();
    }
}
