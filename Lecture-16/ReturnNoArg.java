/* Return And No Argument */
class ReturnNoArg
{
    static int addNum()
    {
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        return sum;
        
    }

    public static void main(String[] args)
    {
        int ans = addNum();
        System.out.println("Sum: "+ans);
    }
}