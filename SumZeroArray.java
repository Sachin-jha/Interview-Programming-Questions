
public class SumZeroArray 
{
	static void sumZero(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			int sum=0;
			for(int j=i; j<arr.length; j++)
			{
				sum=sum+arr[j];
				if(sum==0)
				{
					System.out.println("index:- "+i +".."+j);
					System.out.println("Value:- ("+arr[i] +".." +arr[j]+")");
				}
			}
		}
		
	}

	public static void main(String[] args) 
	{
		int[] arr = {3,4,-7,3,1,3,1,-4,-2,-2};		
		sumZero(arr);
	}

}
