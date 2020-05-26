import java.util.Arrays;

public class KthLargestNumber 
{
	static void kthLargest(int[] arr , int k)
	{
		//Arrays.sort(arr); //1,2,3,4,12,16
		
		int temp;
		
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]<arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Sorted Element:- ");
		for(int n:arr)
		{
			System.out.print(" "+n);
		}
		System.out.println();
		System.out.println(k+" largest Element:- "+arr[k-1]);
	}

	public static void main(String[] args) 
	{
		int[] arr = {2,1,4,12,3,16};
		int k = 3;
		
		kthLargest(arr, k);
	}

}
