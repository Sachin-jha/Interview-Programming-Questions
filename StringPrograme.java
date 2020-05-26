public class StringPrograme 
{

	public static void main(String[] args) 
	{
		
		String name = "sachin jha";
		
		// reverse string
		/*char[] charName = name.toCharArray();		
		for(int i=charName.length-1; i>=0; i--)
		{
			System.out.print(charName[i]);
		}*/
		
		/*String str[] = name.split(" ");		
		for(String s:str)
		{
			System.out.print(new StringBuilder(s).reverse().toString()+" ");
		}*/
		
		String[] str = name.split(" ");
		String reverseString="";
		for(int i=0; i<str.length; i++)
		{
			String word = str[i];
			String reverseWord="";
			
			for(int j=word.length()-1; j>=0; j--)
			{
				reverseWord = reverseWord+word.charAt(j);
			}
			reverseString = reverseString+reverseWord+" ";
		}
		
		System.out.println(reverseString);
		
	}

}
