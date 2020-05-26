
public class SelectionSort 
{
	static void selectionSort(int[] arr , int size)
	{
		int temp;
		for(int i=0; i<size-1; i++)
		{
			int indexMin = i;
			for(int j=i+1; j<size; j++)
			{
				if(arr[j]<arr[indexMin])
					indexMin=j;
			}
			temp = arr[i];
			arr[i] = arr[indexMin];
			arr[indexMin] = temp;
		}
		
		for(Integer n : arr)
			System.out.print(n+" ");
	}

	public static void main(String[] args) 
	{
		int[] arr = {23,1,3,2,56,12};
		int size = arr.length;
		selectionSort(arr , size);
	}


}
