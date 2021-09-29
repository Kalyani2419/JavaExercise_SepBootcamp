class Student
{
    String studName;
    int age;

    Student(String name, int age)
    {
        this.studName = name;
        this.age = age;
    }

    void showStudent()
    {
        System.out.println("Name: " +studName+" age: " +age);
    }
}

class Main1
{
    public static void main(String[] args)
    {
        Student st1 = new Student("ABC", 20);
        st1.showStudent();
    }
}