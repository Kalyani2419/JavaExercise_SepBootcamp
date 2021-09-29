/* No Return But Argument */
class NoReturnArg
{
    static void addNum(int num1, int num2)
    {
        int sum = num1 + num2;
        System.out.println("Sum: "+sum);
    }

    public static void main(String[] args)
    {
        addNum(10, 5); 
    }
}