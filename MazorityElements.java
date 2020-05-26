// Mazority elements appear more then n/2 times.
public class MazorityElements 
{
	static void mazorityElement(int[] arr , int n)
	{
		int index = -1;
		int maxcount = 0;
		for(int i=0; i<n; i++)
		{
			int count = 0;
			for(int j=0; j<n; j++)
			{
				if(arr[i]==arr[j])
					count++;
			}	
			
			if(count > n/2)
			{
				maxcount=count;
				index=i;
			}
		}
		if(maxcount>n/2)
			System.out.println(arr[index]);
	}

	public static void main(String[] args) 
	{
		int[] arr = {3,1,3,3,1};
		int n = arr.length;
		
		mazorityElement(arr, n);
	}

}
