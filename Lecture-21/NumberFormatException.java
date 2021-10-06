class NumberFormatException
{
    public static void main(String[] args)
    {
        try
        {
            String s = "abc";
            int num = Integer.parseInt(s);
            System.out.println(num);
        }
        catch (Exception e)
        {
            System.out.println("You cannot covert string to int");
        }
    }
}