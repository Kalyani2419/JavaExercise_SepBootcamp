import java.util.Scanner;

class ContinueStat
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            if(i==5)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}