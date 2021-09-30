/* Parameterised Constructor */
class Student
{
    String studName;
    int studAge;

    Student(String studName, int studAge)
    {
        this.studName = studName;
        this.studAge = studAge;
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
        Student obj = new Student("Vaishnavi", 20);
        obj.getData();
    }
}