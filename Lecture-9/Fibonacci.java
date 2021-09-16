class Fibonacci
{
    public static void main(String args[])
    {
        int n1=0, n2=1;
        int next = 0;

        for(int i=1; i<=10; i++) 
        {
            System.out.println(n1+" ");
            next = n1 + n2;
            n1 = n2;
            n2 = next;
        }
    }
}
