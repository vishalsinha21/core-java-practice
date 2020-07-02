package oops;

class Derived
{
    public void getDetails() throws RuntimeException //line 23
    {
        System.out.println("Derived class");
    }
}

public class Test extends Derived
{
    public void getDetails() throws IllegalArgumentException //line 24
    {
        System.out.println("Test class");
        System.out.println("create index");
    }

}
