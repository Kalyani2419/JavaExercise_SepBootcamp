import java.util.Scanner;

class TwoDArray3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[][] arr = {
            {-1, -1},      
            {-1, -1, -1, -1}, 
            {-1}           
        };

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.println("Enter value for["+i+"]["+j+"]");
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        
    }
}