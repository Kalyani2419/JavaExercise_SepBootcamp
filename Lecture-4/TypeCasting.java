class TypeCasting
{
    public static void main(String args[])
    {
        int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
        System.out.println("Sum= "+sum);

        double sum2 = Double.parseDouble(args[0]) + Double.parseDouble(args[1]);
        System.out.println("Sum= "+sum2);
    }
}