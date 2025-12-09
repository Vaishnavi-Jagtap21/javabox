package lists;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx {

	public static void main(String[] args) {
		SortedSet<String> set=new TreeSet<>();
		
		//Adding Element
		set.add("D");
		set.add("A");
		set.add("B");
		set.add("C");
		
		//Iterating through the sorted set using for each loop
		for(String item:set)
		{
			System.out.println(item);//A B C D
		}
		
		//Accessing first and last elements
		System.out.println("First :"+set.first());
		System.out.println("Last :"+set.last());

	}

}
