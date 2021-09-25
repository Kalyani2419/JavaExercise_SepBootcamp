class TwoDArray2
{
    public static void main(String[] args)
    {
        /* int[] arr = {0, 1, 2, 3}; //arr.length, arr[0] */

        int[][] arr = {
            {1, 2},      //arr[0].length
            {3, 4, 5, 6}, //arr[1].length
            {7}           //arr[2].length
        };

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                /*System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);*/
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        
    }
}