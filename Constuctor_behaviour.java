class A
{
    A()
    {
        System.out.println("Constructor A");
    }
}
class B extends A
{
    B()
    {
        System.out.println("Contructor B");
    }
}
public class Constuctor_behaviour extends B
{
    Constuctor_behaviour()
    {
        System.out.println("Constructor C");
    }
    public static void main(String args[])
    {
        A obj1=new A();
        B obj2=new B();
        Constuctor_behaviour obj3=new Constuctor_behaviour();
    }
}