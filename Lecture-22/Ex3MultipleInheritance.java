interface A
{
    void show(); 
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
    public static void main(String[] args)
    {
        Main obj = new Main();
        obj.show();
    }
}

