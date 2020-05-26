public class TrippletSumZero 
{
	static void trippletSumZero(int[] arr)
	{		
		int count = 0;
		for(int i=0; i<arr.length-2; i++)
		{			
			/*for(int j=i+1; j<arr.length-1; j++)
			{
				for(int k=j+1; j<arr.length; k++)
				{
					if((arr[i]+arr[j]+arr[k]) == 0)					
						System.out.println(arr[i]+","+arr[j]+","+arr[k]);
				}
			}*/
			
			int j = i+1;
			int k = arr.length-1;
			
			while(j<k)
			{
				if(arr[i]+arr[j]+arr[k] == 0)
				{
					count +=(k-j);
					j++;
				}
				else
					k--;
			}
			System.out.println(arr[i]+","+arr[j]+","+arr[k]);
			
		}
		System.out.println(count);
		
	}

	public static void main(String[] args) 
	{
		int[] arr = {-1,0,1,2,-1,-4};
		trippletSumZero(arr);
	}

}
