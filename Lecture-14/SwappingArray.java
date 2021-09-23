class SwappingArray
{
    public static void main(String[] args)
    {
        int[] arr = {12, 4, 5, 76, 89};

        int l = arr.length;

        for(int i=0; i<l/2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }

        for(int i = 0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}