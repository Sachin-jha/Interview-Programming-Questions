
public class ProvideSpace 
{
	static void space(String str)
	{
		/*str=str.replace("", " ");
		System.out.print(str);
		System.out.println();*/
		
		int[] arr = new int[str.length()];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = Integer.parseInt(str);
		}
		System.out.println(arr.length);
		
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
		
		/*for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				arr[i]=(arr[i]*arr[i]);
			}
			System.out.print(arr[i]+" ");
		}*/
	}

	public static void main(String[] args) 
	{
		String str = "12345";
		space(str);
	}

}
