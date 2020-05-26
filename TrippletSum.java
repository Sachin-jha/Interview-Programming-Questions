import java.util.Arrays;

public class TrippletSum 
{
	static void tripplet(int[] arr, int sum)
	{
		int count=0;
		Arrays.sort(arr);
		for(int i=0; i<arr.length-2; i++)
		{
			/*for(int j=i+1; j<arr.length-1; j++)
			{
				for(int k=j+1; k<arr.length; k++)
				{
					if(arr[i]+arr[j]+arr[k] < sum)
						count++;
					System.out.println(arr[i]+","+arr[j]+","+arr[k]);
				}
			}*/
			int j=i+1;
			int k=arr.length-1;
			while(j<k)
			{
				if(arr[i]+arr[j]+arr[k] < sum)
				{					
					count += (k - j);
					j++;					
				}
				else
					k--;					
			}				
		}
		System.out.println("Tripplets having less then sum are:- "+count);
	}

	public static void main(String[] args) 
	{
		int[] arr = {5,1,3,4,7}; //5,1,3,4,7  -2,0,1,3
		int sum = 12;
		tripplet(arr, sum);
	}

}
