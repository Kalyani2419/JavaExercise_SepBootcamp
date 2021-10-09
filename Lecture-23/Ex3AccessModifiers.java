//Protected Access Modifier
class A
{
    protected void show()
    {
        System.out.println("Hello I am inside the class A");
    }
}

class Main extends A
{
    public static void main(String[] args)
    {
        Main obj = new Main();
        obj.show();
    }
}