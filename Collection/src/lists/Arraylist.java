package lists;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
//		ArrayList<String> al=new ArrayList<String>();
//		al.add("India");
//		al.add("IS");
//		al.add(2,"My");
//		al.add(3,"Country");
//		al.add(4,"12");
//		
//		System.out.println(al.get(0));
//		System.out.println(al.get(3));
//		al.set(1,"-");
//	   for(int i=0;i<al.size();i++)
//	   {
//		   System.out.print(al.get(i)+" ");
//	   }
//		  al.remove(3);
//		  al.remove(2);
//	      al.remove("-");
//	  
//	  for(int i=0;i<al.size();i++)
//	   {
//		   System.out.println(al.get(i)+" ");
//	   }
		
		//Without generic
		List names=new ArrayList<>();
		names.add("Harry");
		names.add(1);
		names.add(true);
		for(int i=0;i<names.size();i++)
			   {
				   System.out.println(names.get(i)+" ");
			   }
		
		//With Generic
		List<String>names1=new ArrayList<>();
		names1.add("Vaishnavi");
        names1.add("Dipika");
        names1.add("Punam");
        names1.add("Nisha");
        for(int i=0;i<names1.size();i++)
		   {
			   System.out.println(names1.get(i)+" ");
		   }
	}

}
