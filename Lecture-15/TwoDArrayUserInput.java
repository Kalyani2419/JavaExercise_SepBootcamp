import java.util.Scanner;

class TwoDArrayUserInput
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[10][10];

        System.out.print("Enter the value of rows: ");
        int row = sc.nextInt();
        
        System.out.print("Enter the value of column: ");
        int column = sc.nextInt();

        for(int r=0; r<row; r++)
        {
            for(int c=0; c<column; c++)
            {
                System.out.print(" arr["+r+"]["+c+"]: ");
                arr[r][c] = sc.nextInt();
            }
            System.out.println();
        }

        for(int r=0; r<row; r++)
        {
            for(int c=0; c<column; c++)
            {
                System.out.print(arr[r][c]+"\t");
            }
            System.out.println();
        }
    }
}