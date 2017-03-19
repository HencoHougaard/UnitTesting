/**
 * Created by Henco on 3/18/2017.
 */


public class UnitTesting
{
    public static float addFloat(float x, float y)
    {
        return x + y;
    }

    public static int addInt(int a, int b)
    {
        return a + b;
    }

    public static boolean intEquality(int a, int b)
    {
        if (a == b)
            return true;
        else
            return false;
    }

    String pet;
    public UnitTesting(String name)
    {
        pet = name;
    }

    public static boolean trueOrFalse(int a, int b)
    {
        if(a == b)
            return true;
        else
            return false;
    }

    public static void failingTest()
    {
        System.out.println("System Failed... aka Success");
    }

    public static void timout()
    {
        int a = 0;
        while(a<101)
        {
            System.out.println(a);
            a++;
        }
    }









}
