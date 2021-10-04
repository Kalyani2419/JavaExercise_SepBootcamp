class A
{
    static void hello()
    {
        System.out.println("Hello Everyone!");
    }
}

class Main extends A
{
    static void hello()
    {
        System.out.println("Hello Everybody!");
    }
    public static void main(String[] args)
    {
       hello();
    }
}