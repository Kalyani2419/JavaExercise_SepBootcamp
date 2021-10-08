interface A
{
    void hello(); 
}

interface B
{
    void show(); 
}
class Main implements A, B 
{
    public void show()
    {
        System.out.println("This is the definition");
    }

    public void hello()
    {
        System.out.println("This is hello");
    }

    public static void main(String[] args)
    {
        Main obj = new Main();
        obj.show();
        obj.hello();
    }
}

