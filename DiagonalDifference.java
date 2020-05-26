import java.util.Scanner;

public class DiagonalDifference 
{
	/*static int diagonalDifference(int[][] arr)
    {
        int Leftsum=0;
        int Rightsum=0;
        for(int i=0; i<arr.length; i++)
        {
            Leftsum+=arr[i][i];
            Rightsum+=arr[i][arr.length-1-i];
        }
        return (Math.abs(Leftsum-Rightsum));
    }*/

    public static void main(String... s)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        int Leftsum=0;
        int Rightsum=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                if(i==j)
                    Leftsum+=arr[i][j];
                if((i+j) == (arr.length-1))
                    Rightsum+=arr[i][j];
            }            
        }
        System.out.println(Math.abs(Leftsum-Rightsum));
    }
}
