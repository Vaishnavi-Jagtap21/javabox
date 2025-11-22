package Objects;

public class IsObject {

	public static void main(String[] args) {
		IsObject isobj=new IsObject();
		boolean ob=isobj instanceof IsObject;
		if(ob==true)
		{
			System.out.println("isObj is an object of IsObject  Class");
		}
		else
		{
			System.out.println("isObj is not an object of IsObject Class");
		}
	}

}
