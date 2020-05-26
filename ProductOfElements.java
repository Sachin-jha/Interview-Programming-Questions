
public class ProductOfElements 
{
	static void productOfElem(int[] arr , int len)
	{
		int product = 1;
		for(int i=0; i<len; i++)
		{
			product = product*arr[i];
		}		
		System.out.println(product);
		
		int[] sol = new int[len];
		
		for(int i=0; i<len; i++)
		{
			sol[i] = product/arr[i];
		}
		
		for(int ans:sol)
			System.out.print(ans+" ");
	}

	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4};
		int len = arr.length;
		productOfElem(arr,len);
	}

}
