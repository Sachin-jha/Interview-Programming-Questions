import java.util.Scanner;

public class SparseArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int s=sc.nextInt();
		System.out.println("String");
		String[] st = new String[s];		
		for(int i=0; i<st.length; i++)
			st[i] = sc.next();
		
		int q = sc.nextInt();
		System.out.println("queries");
		String[] qu = new String[q];
		for(int i=0; i<qu.length; i++)
			qu[i] = sc.next();
		int count=0;
		//int[] count = new int[qu.length];
		for(int i=0; i<s; i++)
		{
			for(int j=0; j<q; j++)
			{
				if(st[i].equals(qu[j]))
				{
					count++;
					System.out.println(qu[j]);
				}
			}
			System.out.println(count);
		}
		
		//for(int i=0; i<count.length; i++)
			//System.out.println(count);
		
		/*for(String s1:st)
			System.out.println(s1);
		for(String q1:qu)
			System.out.println(q1);*/
	}

}
