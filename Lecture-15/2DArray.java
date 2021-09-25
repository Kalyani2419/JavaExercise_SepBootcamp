class TwoDArray
{
    public static void main(String[] args)
    {
        int[][] arr = {
            {7, 8, 9},
            {10, 11, 12},
            {13, 14, 15}
        };

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                /*System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);*/
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}