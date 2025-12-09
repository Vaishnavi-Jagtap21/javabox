package Sample;

public class Boxing {

	public static void main(String[] args) {
		Integer intObject=10;//boxing=primitve to wrapper covertion
		int intValue=intObject;
		System.out.println(intObject.getClass());
		System.out.println("Object"+intValue);
		
		//Unboxing=wrpper to primitive 
		int a=intObject;
		System.out.println(a);
		
		Character ch='a';
		System.out.println("ch: "+ch);
		System.out.println(ch.getClass());
		
//		
//		Double doubleObject=5.5;
//		double doubleValue=doubleObject;
//		
//		Boolean boolObject=true;
//		boolean boolvalue=boolObject;

	}

}
