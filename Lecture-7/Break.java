class Break
{
    public static void main(String[] args)
    {
        int button = 2;

        switch(button)
        {
            case 1:
                System.out.println("Fan");
                break;

            case 2:
                System.out.println("Bulb");
                break;

            case 3:
                System.out.println("Heater");
                break;

            default:
                System.out.println("Not Match");
        }
    }
}