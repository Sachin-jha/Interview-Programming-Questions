
public class FindMissingNumber 
{
	static void findMissing(int[] arr , int size)
	{
		int lastElement = arr[size-1];
		int n = lastElement*(lastElement+1)/2;
		int sum=0;
		for(int i=0; i<size; i++)
		{
			sum = sum+arr[i];
		}

		int missing = n-sum;
		System.out.println("Missing element:- " +missing);		
	}

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,5,6,7,8,9};
		int size = arr.length;
		findMissing(arr,size);
	}

}
