abstract class A
{
    abstract void show();
}

class Main extends A
{
    void show()
    {
        System.out.println("Hello World");
    }
    public static void main(String[] args)
    {
        Main obj = new Main();
        obj.show();
    }
}