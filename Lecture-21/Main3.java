class Main3
{
    public static void main(String[] args)
    {
        try
        {
            int[] roll_number = {101, 102, 103, 104, 105};
            System.out.println(roll_number[6]);
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong. Exception Occure-> "+e);
        }
        finally
        {
            System.out.println("Finally try catch finished");
        }
    }
}