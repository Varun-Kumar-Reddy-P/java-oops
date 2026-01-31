public class StudentDemo
{
    int rollNo;
    String name;
    int age;

    // Constructor
    StudentDemo(int rollNo, String name, int age)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public static void main(String []args)
    {
        StudentDemo student = new StudentDemo(12,"Varun",19);

        System.out.println("Student roll no: "+student.rollNo);
        System.out.println("Student name: "+student.name);
        System.out.println("Student age: "+student.age);
    }
}
