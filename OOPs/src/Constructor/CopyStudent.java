package Constructor;

public class CopyStudent {
      String name;
      String city;
      CopyStudent(String a,String b)
      {
    	  name=a;
    	  city=b;
    	  System.out.println("Name :"+name+"City: "+city);
      }
      CopyStudent(CopyStudent cst)
      {
    	  String n=cst.name;
    	  String c=cst.city;
    	  System.out.println("From Copy Constructor \n"+"Name: "+n+"City : "+c);
      }
	public static void main(String[] args) {
		// Copy Constructor
		CopyStudent cst=new CopyStudent ("Akshay","Ahilyanagar");
		CopyStudent st=new CopyStudent(cst);

	}

}
