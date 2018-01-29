class Contents_of_array
{
	public static void main(String args[])
	{
	int []a=new int[5];
	for(int i=0;i<a.length;i++)
	a[i]=i*2;
	for(int i=0;i<a.length;i++)
	System.out.print(a[i]+" ");	
	System.out.println("\n");
	for(int i:a)
	{System.out.print(i+" ");}
	int [][]ad=new int[5][];
	for(int i=0;i<ad.length;i++)
	ad[i]=new int[5];
	for(int i=0;i<ad.length;i++)
	for(int j=0;j<ad[i].length;j++)
	ad[i][j]=i*j;
	System.out.println("\n");
	for(int i=0;i<ad.length;i++)
	{System.out.println();
	for(int j=0;j<ad[i].length;j++)
	System.out.print(ad[i][j]+" ");}	
	System.out.println("\n");
		for(int i=0;i<ad.length;i++)
		{
		System.out.println();
		for(int j:ad[i])
		System.out.print(j+" ");
		}
	}
}