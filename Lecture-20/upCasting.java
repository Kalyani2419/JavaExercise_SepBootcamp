class A
{
    void hello()
    {
        System.out.println("Hello Everyone!");
    }
}

class Main extends A
{
    void hello()
    {
        System.out.println("Hello Everybody!");
    }
    public static void main(String[] args)
    {
       //upcasting
       A obj = new Main();
       obj.hello();
    }
}