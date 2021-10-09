//Private Access Modifier
class A
{
    private String courseName;

    void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    String getCourseName()
    {
        return courseName;
    }    
}

class Main
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.setCourseName("Web Development");

        System.out.println(obj.getCourseName());
    }
}