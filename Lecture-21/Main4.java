class Main4
{
    public static void main(String[] args)
    {
        int  age = 19;
        if(age<18)
        {
            throw new ArithmeticException("you must older than 18 years.");
        }
        else
        {
            System.out.println("Your Age is " + age);
        }
    }
}