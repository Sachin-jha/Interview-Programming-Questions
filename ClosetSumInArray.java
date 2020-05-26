public class ClosetSumInArray 
{
	
	static void closetSum(int[] arr, int sum)
	{
		/*int minDiff = Math.abs(arr[0]+arr[1]-sum);
		int firstIndex=0;
		int secondIndex=1;		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				int tempDiff = Math.abs(arr[i]+arr[j]-sum);
				if(tempDiff<minDiff)
				{
					firstIndex=i;
					secondIndex=j;
					minDiff=tempDiff;
					//System.out.println(i +"," +j);
				}
			}
		}
		System.out.println(arr[firstIndex] +","+ arr[secondIndex]);*/
		
		//Optimal Solution
		int diff = Integer.MAX_VALUE;
		int left=0;
		int indexLeft=0; int indexRight=0;
		int right=arr.length-1;
		
		while(left < right)
		{
			if(Math.abs(arr[left]+arr[right]-sum) < diff)
			{
				indexLeft=left;
				indexRight=right;
				diff = Math.abs(arr[left]+arr[right]-sum);
			}
			else if(arr[left]+arr[right] < sum)
				left++;
			else
				right--;
		}		
		System.out.println(arr[indexLeft] +","+ arr[indexRight]);
		
	}

	public static void main(String[] args)
	{
		int[] arr = {10,22,28,29,30,40};
		int sum = 54;
		closetSum(arr, sum);
	}

}
