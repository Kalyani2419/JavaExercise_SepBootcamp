class FunOverriding
{
    void show()
    {
        System.out.println("I am inside the show method");
    }
}

class Main extends FunOverriding
{
    void show()
    {
        System.out.println("This time, I am inside the Class Main");
    }
    public static void main(String[] args)
    {
        Main obj = new Main(); 
        obj.show();
    }
}