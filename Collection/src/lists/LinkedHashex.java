package lists;


import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashex {

	public static void main(String[] args)
	{
        Set<String>set=new LinkedHashSet<>();
		
		//Adding Element
		set.add("X");
		set.add("Y");
		set.add("X");//Duplicates not allowed
		set.add("A");
		set.add("c");
		set.add("b");
		
		//Iterating through the set using for-each loop
		for(String item:set)
		{
			System.out.println(item);
		}
	}

}
