package Array;

public class Start {

	public static void main(String[] args) {
		// Array
		int [] a= {1,2,3,4,5,6};
		//Array Declaration
		int [] b;
		//Intialization
		b=new int[5];
		//Traditional for loop
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		//Enhanced for loop
		for(int element:a)
		{
			System.out.println(element);
		}
	}

}
