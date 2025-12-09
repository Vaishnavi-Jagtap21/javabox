package lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>(); //List javal ArrayList pan karu shkato
		list.add("A");
		list.add("B");
		list.add("C");
		
		//Creating an iterator
		Iterator<String> iterator=list.iterator();
		
		//iterating through the list
		while(iterator.hasNext())
		{
			String item=iterator.next();
			System.out.println(item);
			
			//Removing an element
			if("B".equals(item))
			{
				iterator.remove();
			}
		}
		//Checking the list after removal 
		System.out.println("List After Removal: "+list);

	}

}
