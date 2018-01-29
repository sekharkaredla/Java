class Power
{
 int power(int a,int b)
{
	int i;int r=1;
	for(i=1;i<=b;i++)
	r=r*a;
	return r;
}
public static void main(String args[])
{
	Power obj=new Power();
	System.out.println(" "+obj.power(4,3));
}
};		