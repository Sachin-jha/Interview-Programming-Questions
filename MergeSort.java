
public class MergeSort 
{
	static void mergeSort(int[] arr , int size)
	{
		// dividing element into sub-part
		if(size<2)
			return;
		
		int mid = size/2;
		
		int[] left = new int[mid];
		int[] right = new int[size-mid];
		
		for(int i=0; i<mid; i++)
		{
			left[i] = arr[i];
			System.out.print(left[i]+" ");
		}
			
		System.out.print("  ");
		for(int i=mid; i<size; i++)
		{
			right[i-mid] = arr[i];
			System.out.print(right[i-mid]+" ");
		}	
		
		// sorting
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<left.length && j<right.length)
		{
			if(left[i]<=right[i])
			{
				arr[k] = left[i];
				i++;
				k++;				
			}
			else
			{
				arr[k] = right[j];
				j++;
				k++;				
			}			
		}
		//remaining element will be send to arr[k]
		while(i<left.length)
		{
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j<right.length)
		{
			arr[k] = right[j];
			j++;
			k++;
		}
		System.out.println();
		for(int l=0;l<arr.length;l++)
		{
			System.out.print(arr[l]+" ");
		}
		
	}

	public static void main(String[] args) 
	{
		int[] arr = {8,5,3,7,2,4,1,6}; //2,4,1,6,8,5,3,7
		int size = arr.length;
		mergeSort(arr,size);
	}

}
