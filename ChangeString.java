
public class ChangeString 
{
	static void changeString(String s)
	{
		char[] str = s.toCharArray();
		
		for(int i=0; i<str.length; i++)
		{
			if(str[i]=='a')
			{
				str[i] = 'b';
			}
		}
		for(char c:str)
			System.out.print(c);
	}

	public static void main(String[] args) 
	{
		String s = "abcd";
		changeString(s);
	}

}
