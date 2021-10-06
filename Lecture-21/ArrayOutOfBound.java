class Main
{
    public static void main(String[] args)
    {
        try
        {
            int[] roll_number = {101, 102, 103, 104, 105};
            System.out.println(roll_number[10]);
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong. Exception Occure-> "+e);
        }
    }
}