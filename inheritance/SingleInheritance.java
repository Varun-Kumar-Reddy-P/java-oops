class Parent{
    String height = "Tall";
    String color = "White";
}

class Child extends Parent{
    String eyes = "small";
}

public class SingleInheritance{
    public static void main(String []args){
        Child kid = new Child();

        System.out.println("Height: "+kid.height);
        System.out.println("color : "+kid.color);
        System.out.println("Eyes : "+kid.eyes);
    }
}
