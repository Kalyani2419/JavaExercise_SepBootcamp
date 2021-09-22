class BinarySearch
{
    public static void main(String[] args)
    {
        int[] arr = {2, 4, 10, 15, 20, 25, 30, 47};

        int low = 0;
        int high = arr.length - 1;
        int number = 25;
        //int isFound = 0;
        
        while(high>=low)
        {
            int middle = (low + high)/2;

            if(arr[middle]==number)
            {
                System.out.println("Found at: "+middle);
                break;
            }
            else if(arr[middle]<number)
            {
                low = middle + 1;
            }
            else if(arr[middle]>number)
            {
                high = middle - 1;
            }
        }  
        /* if(isFound==0)
        {
            System.out.println("Element not found");
        } */     
    }
}