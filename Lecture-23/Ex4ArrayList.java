import java.util.ArrayList;

class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> courses = new ArrayList<String>();

        courses.add("C");
        courses.add("C++");
        courses.add("Java");
        courses.add("Python");

        System.out.println("ArrayList: " + courses);

        courses.add(3, "JavaScript");

        System.out.println("Updated ArrayList: " + courses);

        System.out.println("Index 3?" + courses.get(3));

        courses.remove(0);
        System.out.println("Next Updated ArrayList: " + courses);
    }
}