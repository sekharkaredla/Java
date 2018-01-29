class String_buffer_test
{
	public static void main(String args[])
	{
		StringBuffer obj=new StringBuffer("xyz");
		System.out.println(obj);
		System.out.println(obj.append("ABC"));
		System.out.println(obj);
		System.out.println(obj.delete(2,4));
		System.out.println(obj.insert(3,"CBIT"));
		System.out.println(obj);
		System.out.println(obj.reverse());
	}
}		