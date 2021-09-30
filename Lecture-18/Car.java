class Car
{
    int modelYear;
    String modelName;

    Car(int year, String Name)
    {
        modelYear = year;
        modelName = Name;
    }

    public static void main(String[] args)
    {
        Car c = new Car(1998, "Audi");
        System.out.println(c.modelYear+" "+c.modelName);
    }
}