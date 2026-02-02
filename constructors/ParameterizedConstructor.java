public class ParameterizedConstructor{
    String name;
    int age;
   
    ParameterizedConstructor(String name, int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String []args){
        
        ParameterizedConstructor obj = new ParameterizedConstructor("Varun",19);

        System.out.println("Name : "+obj.name);
        System.out.println("Age : "+obj.age);
    }
}

