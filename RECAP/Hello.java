public  class Hello
{
  static
  {
    System.out.println("hello");
  }
  public static void main(String args[])
  {
      float x1=3.14f;
      System.out.println(x1);
      //for(char x=0x0000;x<0xFFFF;x++)
      //System.out.println(x);
      Hello obj=new Hello();
      System.out.println("hashcode is : "+obj.hashCode());
      int a[][]=new int[3][];
      a[0]=new int[2];
      a[1]=new int[1];
      a[2]=new int[5];
      for(int i=0;i<a.length;i++)
      for(int j=0;j<a[i].length;j++)
      System.out.println(a[i][j]);
  }
  public int sum(int x,int y)
  {
    return x+y;
  }
  public  int sum(int x,int y,int z)
  {
    return x+y+z;
  }
}
