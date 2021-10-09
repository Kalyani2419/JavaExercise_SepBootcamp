//Default Access Modifier
class A
{
    String courseName;
}

class Main
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.courseName = "Web Development";

        System.out.println(obj.courseName);
    }
}