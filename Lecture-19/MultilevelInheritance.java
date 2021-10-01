class A
{ 
    void funA()
    {
        System.out.println("This is FunA!");
    }
}

class B extends A
{
    void funB()
    {
        System.out.println("This is FunB!");
    }
}

class C extends B
{
    public static void main(String[] args)
    {
        C obj = new C();
        obj.funA();
        obj.funB();
    }
}