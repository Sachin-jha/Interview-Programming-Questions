import java.util.Scanner;

public class StringRepeat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string:-");
		String str = sc.nextLine();
		int count=0;
		char[] strChar = str.toCharArray();
		System.out.print("Duplicate Elements:- ");
		for(int i=0; i<strChar.length-1; i++)
		{
			/*for(int j=i+1; j<strChar.length; j++)
			{ 
				if(strChar[i]==strChar[j] && i!=j)
				{
					count++;
					System.out.print(strChar[i]);
				}
			}*/
			if(strChar[i] == strChar[i+1])
			{
				count++;
				System.out.print(strChar[i]);
			}
		}
		System.out.println();
		System.out.println(count);
	}

}
