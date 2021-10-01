class A
{ 
    void fun()
    {
        System.out.println("Fun!");
    }
}

class B extends A
{
    void hello()
    {
        System.out.println("Hello!");
    }

    public static void main(String[] args)
    {
        B obj = new B();
        obj.fun();
        obj.hello();
    }
}