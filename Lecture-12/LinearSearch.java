import java.util.Scanner;

class LinearSearch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of students: ");
        int studNumber = sc.nextInt();

        int[] ages = new int[studNumber];

        System.out.println("\nEnter the ages of "+studNumber+" students: \n");
        
        for(int i=0; i<ages.length; i++)
        {
            System.out.println("Enter the age of "+i+" student");
            ages[i] = sc.nextInt();
        }

        for(int i=0; i<ages.length; i++)
        {
            System.out.println("Age: "+ages[i]);
        }

        //max
        int max=ages[0];
        for(int i=1; i<ages.length; i++)
        {
            if(ages[i]>max)
            {
                max= ages[i];
            }
        }

        System.out.println("Max Age: "+max);
    }
}