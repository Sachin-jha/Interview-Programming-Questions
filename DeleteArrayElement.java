
public class DeleteArrayElement 
{
	static void deleteElement(int[] arr , int delIndex)
	{
		System.out.println("Before Deletion");
		for(Integer i:arr)
			System.out.print(i+" ");
				
		for(int i=delIndex; i<arr.length-1; i++)
			arr[i]=arr[i+1];
		
		System.out.println();		
		System.out.println("After Deletion of index "+delIndex);	
		for(int i=0; i<arr.length-1; i++)
			System.out.print(arr[i]+" ");
	}

	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		int delIndex = 2;
		deleteElement(arr , delIndex);
	}

}
