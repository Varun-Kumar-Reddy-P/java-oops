import java.util.Scanner;
class MethodOverloading{

    int calculate(int a, int b){
        return a+b;
    }
    float calculate(float c, float d){
        return c+d;
    }

    public static void main(String []args){
        MethodOverloading obj = new MethodOverloading();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter two decimal numbers: ");
        float c = sc.nextFloat();
        float d = sc.nextFloat();

        System.out.println("Sum of integers: "+obj.calculate(a,b));
        System.out.println("Sum of decimal numbers: "+obj.calculate(c,d));

        sc.close();
    }
}
