package lists;

import java.util.LinkedList;

public class GenericLinked {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		
//		Adding element
		list.add("A");
		list.addFirst("B");
		list.addLast("C");
		
//		Accessing elements
		System.out.println(list.getFirst());
		System.out.println(list.get(1));
		
//		REmoving element
		list.removeLast();
		
//		Iterate through the list
		for(String item:list) {
			System.out.println(item);
		}

	}

}
