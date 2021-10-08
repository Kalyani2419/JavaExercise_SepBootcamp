interface RTC
{
    void showCourses();
}

class Main implements RTC 
{
    public void showCourses()
    {
        System.out.println("Web Development");
        System.out.println("Mern Stack");
    }
    public static void main(String[] args)
    {
        Main obj = new Main();
        obj.showCourses();
    }
}

