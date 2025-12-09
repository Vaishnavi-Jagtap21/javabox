package Inheritance;

class One {
	void print_hello()
	{
		System.out.println("Hello EveryOne...");
	}
}

class Two extends One{
	
}

class Third extends Two{
	
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		Third t=new Third();
		t.print_hello();

	}

}