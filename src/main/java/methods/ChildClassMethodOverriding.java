package methods;

import Inheritance.ParentClass;

public class ChildClassMethodOverriding extends ParentClassMethodOverrriding {
    public static void main(String[] args) {
        ParentClassMethodOverrriding parentClassMethodOverrriding = new ChildClassMethodOverriding();
        parentClassMethodOverrriding.engine();
    }

    public void engine(){
        System.out.println("child class engine");
    }
}
