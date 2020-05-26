
public class BubbleSort 
{
	static void bubbleSort(int[] arr , int size)
	{
		int temp;
		for(int i=1; i<size; i++)
		{
			for(int j=0; j<size-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
			
		for(int i=0; i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) 
	{
		int[] arr = {23,1,2,45,3};
		int size = arr.length;
		bubbleSort(arr,size);
	}

}
