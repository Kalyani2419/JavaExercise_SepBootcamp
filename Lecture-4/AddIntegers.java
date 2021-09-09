import java.util.Scanner;

class AddIntegers
{
    public static void main(String args[])
    {
        //creating object
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();

        sum = num1 + num2;
        System.out.println("sum = "+sum);
    }
    
}