class NullException2
{
    public static void main(String[] args)
    {
        try
        {
            String name = "Hello World!";
            System.out.println(name.length());
        }
        catch (Exception e)
        {
            System.out.println("You canot measure the length of null values. Exception occured->"+e);
        }
    }
}