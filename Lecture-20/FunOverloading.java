class FunOverloading
{
    void area(int side)
    {
        int area = side * side;
        System.out.println("Area of square: "+area);
    }

    void area(int l, int b)
    {
        int area = l * b;
        System.out.println("Area of rectangle: "+area);
    }
    public static void main(String[] args)
    {
        FunOverloading obj = new FunOverloading();
        obj.area(20);
        obj.area(20, 2);
    }
}