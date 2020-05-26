
public class MatrixSorting 
{
	static void matrixSort(int[][] arr , int row , int col)
	{
		int temp;
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				for(int k=j+1; k<col; k++)
				{
					if(arr[i][j]>arr[i][k])
					{
						temp = arr[i][j];
						arr[i][j] = arr[i][k];
						arr[i][k] = temp;
					}
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		int[][] arr = {
						{2,3,12,5,43},
						{6,45,9,4,32},
						{1,65,23,45,77}
					  };
		int col = arr[0].length;
		int row = arr.length;
		matrixSort(arr,row,col);
		
	}
}


