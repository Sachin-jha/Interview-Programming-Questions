
public class FindDuplicatesElement 
{
	static void duplicate(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[Math.abs(arr[i])] >= 0)
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			else
				System.out.println("Repeated values are:- "+Math.abs(arr[i]));
		}
	
		/*for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
					System.out.println("Repeated elements:- "+arr[i]);
			}
		}*/
	}

	public static void main(String[] args) 
	{
		int[] arr = {1,2,1,3,4,2,6,7,4};
		duplicate(arr);
	}

}
