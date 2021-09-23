class ReverseArray
{
    public static void main(String[] args)
    {
        int[] arr = {12, 4, 5, 76, 89};
        int[] temp = new int[5];

        int arrIndex = 4; //arrIndex = arr.length-1
        int tempIndex = 0;

        while(arrIndex>=0)
        {
            temp[tempIndex] = arr[arrIndex];
            tempIndex++;
            arrIndex--;
        }

        for(int i = 0; i<temp.length; i++)
        {
            System.out.println(temp[i]);
        }
    }
}