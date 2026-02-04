class Grandparent{
    String color = "White";
    String height = "Tall";
}

class Parent extends Grandparent{
    String eyes = "small";
    String behaviour = "Polite";
}

class Child extends Parent{
    String ears = "small";
}

public class MultilevelInheritance{
    public static void main(String []args){
        Parent inheritedFirst = new Parent();
        Child inheritedSecond = new Child();

        System.out.println("Parent color: "+inheritedFirst.color);
        System.out.println("Parent height: "+inheritedFirst.height);
        System.out.println("Parent eyes: "+inheritedFirst.eyes);
        System.out.println("Parent behaviour: "+inheritedFirst.behaviour);
        
        System.out.println();

        System.out.println("Child color: "+inheritedSecond.color);
        System.out.println("Child height: "+inheritedSecond.height);
        System.out.println("Child eyes: "+inheritedSecond.eyes);
        System.out.println("Child behaviour: "+inheritedSecond.behaviour);
        System.out.println("Child ears : "+inheritedSecond.ears);
    }
}
