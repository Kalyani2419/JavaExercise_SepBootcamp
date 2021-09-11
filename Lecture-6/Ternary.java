class Ternary
{
    public static void main(String[] args)
    {
        int a = 45;
        int b = 100;

        int max = a>b ? a : b;
        System.out.println("Maximum value: " + max);

        boolean result = a>b ? true : false;
        System.out.println("Maximum value: " + result);
    }
}