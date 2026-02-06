abstract class Animal{

    //Abstract method
    public abstract void pet();

    //Concrete method
    public void sleep(){
        System.out.println("It's sleeping!");
    }
}

class Dog extends Animal{
    public void pet(){
        System.out.println("Dog is my pet");
    }
}

public class AbstractClassDemo{
    public static void main(String []args){
        Animal animal = new Dog();
        animal.pet();
        animal.sleep();
    }
}
