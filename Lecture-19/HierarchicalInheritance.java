class Ring
{
    void phoneRing()
    {
        System.out.println("Phone is Ringing");
    }
}

class Nokia extends Ring
{
    void start()
    {
        System.out.println("Nokia Started");
    }
}

class Samsung extends Ring
{
    void start()
    {
        System.out.println("Samsung Started");
    }
}

class Apple extends Ring
{
    void start()
    {
        System.out.println("Apple Started");
    }
}

class MyClass
{
    public static void main(String[] args)
    {
        Nokia n = new Nokia();
        n.phoneRing();
        n.start();

        Samsung s = new Samsung();
        s.phoneRing();
        s.start();

        Apple a = new Apple();
        a.phoneRing();
        a.start();
    }
}