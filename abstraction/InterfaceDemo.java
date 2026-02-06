interface Animal{
    void pet();
}

class Dog implements Animal{
    public void pet(){
        System.out.println("Dog is my pet.");
    }
}

public class InterfaceDemo{
    public static void main(String []args){
        Animal animal = new Dog();
        animal.pet();
    }
}
