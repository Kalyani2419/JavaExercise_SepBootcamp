/* Default Constructor */
class Student
{
    String studName;
    int studAge;

    void setData(String name, int age) 
    {
        studName = name;
        studAge = age;
    }

    void getData()
    {
        System.out.println("Name: "+studName);
        System.out.println("Age: "+studAge);
    }
}

class Main
{
    public static void main(String[] args)
    {
        Student obj = new Student();
        obj.setData("A", 20);
        obj.getData();
    }
}