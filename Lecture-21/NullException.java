class NullException
{
    public static void main(String[] args)
    {
        try
        {
            String name = null;
            System.out.println(name);
        }
        catch (Exception e)
        {
            System.out.println("You canot measure the length of null values");
        }
    }
}