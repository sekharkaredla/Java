class Static
{
int x=0;static int y=10;
public static void main(String args[])
{
	//System.out.println(x);
	System.out.println(y);
	Static x1=new Static();
	Static x2=new Static();
	System.out.println(x1.x);
	System.out.println(x2.y);
	x1.y=20;
	System.out.println(x2.y);
	System.out.println(Static.y);
	x1.test();
	//System.out.println(local);
}
 void test()
{
	int local=25;
	System.out.println(local);
	System.out.println(x);
	System.out.println(y);
}
}	