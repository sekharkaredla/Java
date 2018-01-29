class String_test 
{
	public static void main(String args[])
	{
	String s="12345ab cDe";
	System.out.println(s.charAt(4));
	System.out.println(s.concat("fghij"));
	System.out.println(s+"fghij");
	System.out.println(s);
	System.out.println(s.equalsIgnoreCase("12345AB CDE"));
	System.out.println(s.length());
	System.out.println(s.replace('a','k'));
	System.out.println(s.substring(4));
	System.out.println(s.substring(4,9));
	System.out.println(s.toLowerCase());
	System.out.println(s.toUpperCase());
	System.out.println(s.trim());
	}
}
	
	