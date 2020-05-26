
public class RemoveDublicateElements 
{
	static void removeDuplicate(int[] arr , int len)
	{
		int j=0;

		for(int i=0; i<len-1; i++)
		{
			if(arr[i] != arr[i+1])
				arr[j++]=arr[i];			
		}
		arr[j++]=arr[len-1];
		
		for(int i=0; i<j; i++)
			System.out.print(arr[i]+" ");
	}

	public static void main(String[] args) 
	{
		int[] arr = {1,2,2,3,3,4,4,5,5};
		int len = arr.length;
		
		removeDuplicate(arr, len);
	}

}
