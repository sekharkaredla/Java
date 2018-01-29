class Father
{
    int age=65;
    String name="Ram";
    void getData()
    {
        System.out.println("Father age "+age);
        System.out.println("Father name "+name);
    }
}
public class Super_call extends Father
{
    int age=25;
    String name="Shyam";
    void getData()
    {
        System.out.println("Son age "+age);
        System.out.println("Son name "+name);
        System.out.println("Father age "+super.age);
        super.getData();
    }
    public static void main(String args[])
    {
        Super_call obj=new Super_call();
        obj.getData();
    }
}