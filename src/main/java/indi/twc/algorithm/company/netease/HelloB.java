package indi.twc.algorithm.company.netease;

public class HelloB extends HelloA
{
    public HelloB()
    {
    }
    {
        System.out.println("I’m B class");
    }
    static
    {
        System.out.println("static B");
    }
    public static void main(String[] args)
    {
        new HelloB();
    }
}
class HelloA
{
    public HelloA()
    {
    }
    {
        System.out.println("I’m A class");
    }
    static
    {
        System.out.println("static A");
    }
}