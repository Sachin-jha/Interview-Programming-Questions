import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class FrequencyCount 
{
	static void frequencey(String str)
	{
		String name[] = str.split(" ");
		ArrayList<String> ls = new ArrayList<String>();
		for(String s:name)
		{
			ls.add(s);
		}

		Set<String> dis = new LinkedHashSet<>(ls);
		for(String s1:dis)
		{
			System.out.println(s1+" "+Collections.frequency(ls, s1));
		}
	
	}

	public static void main(String[] args) 
	{
		String str = "sachin is a good boy sachin is a nice person";
		frequencey(str);
	}

}
