package Inheritance;

public class ChildClass extends ParentClass{
    public static void main(String[] args) {
        ParentClass parentClass = new ChildClass();
        parentClass.engine();
        System.out.println(parentClass.colour);

    }

    public void engine(){
        System.out.println("child class engine");
    }
}
