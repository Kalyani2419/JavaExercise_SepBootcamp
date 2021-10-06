class NullException1
{
    public static void main(String[] args)
    {
        try
        {
            String name = null;
            System.out.println(name.length());
        }
        catch (Exception e)
        {
            System.out.println("You canot measure the length of null values. Exception occured->"+e);
        }
    }
}