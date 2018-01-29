class A
{
  int x;
  static int y;
  A()
  {
  x=10;
  y=20;
  }
  protected void show()
  {
    System.out.println(x+y);
  }
}
class TestInheritance extends A
{
  int x;
  static int y;
  TestInheritance()
  {
    x=30;
    y=40;
    super.show();
  }
  public void show()
  {
    System.out.println(x+y);
    super.show();
  }
  public static void main(String args[])
  {
    TestInheritance obj=new TestInheritance();
    obj.show();
    A obj1;
    obj1=obj;
    obj1.show();
  }
}
