class PalindromeString
{
	public static void main(String[] args) 
	{
		String a="surus";
		char[] array=a.toCharArray();
		char[] temp=new char[array.length];
		int counter=0;
		for(int i=array.length-1;i>=0;i--)
		{
			temp[counter]=array[i];
			counter++;
		}
		String toTest=new String(temp);
		if(toTest.equals(a))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}


	}
}