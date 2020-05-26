public class SumArrayPrograme 
{
	static void sumArray(int[] arr, int sum)
	{
		/*for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j] == sum)
				{
				   System.out.println("index :- " +i +","+j);
				   System.out.println("Value:- " +arr[i] +","+arr[j]);
										
				}
				//System.out.println("");
			}			
		}*/
		
		int left=0;
		int right=arr.length-1;
		
		while(left<right)
		{
			if(arr[left]+arr[right] == sum)
			{
				System.out.println("index :- " +left +","+right);
				System.out.println("Value:- " +arr[left] +","+arr[right]);
				left++;
			}
			else
				right--;
				
		}
	}

	public static void main(String[] args) 
	{
		int[] arr = {8,7,2,5,3,1}; // 1,2,3,5,7,8
		int sum = 10;
		
		sumArray(arr,sum);
		
	}

}
