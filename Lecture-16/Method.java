class Method
{
    int addNum(int num1, int num2)
    {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args)
    {
        Method obj = new Method();
        int ans = obj.addNum(10, 20);
        System.out.println("Sum: "+ans);
    }
}