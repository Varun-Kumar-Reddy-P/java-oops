class Parent{
    void message(){
        System.out.println("Message from parent");
    }
}

class Child extends Parent{
    void message(){
        System.out.println("Message from child");
    }
}

public class MethodOverriding{
    public static void main(String []args){
        Parent obj = new Child();
        obj.message();
    }
}
