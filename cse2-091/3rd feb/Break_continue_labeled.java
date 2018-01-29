class Break_continue_labeled
{
	public static void main(String args[])
	{
	int i,j,k;int flag=0;
	inner : for(i=0;i<5;i++)
	{
		for(j=0;j<5;j++)
		{
			for(k=0;k<5;k++)
			{
				if(i*j*k==8)	
				{System.out.println("test");flag++;break inner;}
			}

		}
	}
	outer:
		for(i=0;i<5;i++)
		{
		System.out.println(i);
		if((flag++)==1)
		continue outer;
		else 
		break outer;
		}
		}
}