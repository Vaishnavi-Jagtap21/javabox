package Objects;

public class InstanceOf {

	public static void main(String[] args) {
		//instanceOf
		InstanceOf n =new InstanceOf();
		if(n instanceof InstanceOf)
		{
			System.out.println("n is object");
		}
		else
		{
			System.out.println("n is not object");
		}
	}

}
